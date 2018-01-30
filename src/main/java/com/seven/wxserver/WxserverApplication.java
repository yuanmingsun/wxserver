package com.seven.wxserver;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

import com.seven.wxserver.bean.*;
import com.seven.wxserver.dao.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@RestController
public class WxserverApplication {

    @Resource
    private IGroupRecTextMsgDao groupRecTextMsgDao;


    @Resource
    private IGroupSendTextMsgDao groupSendTextMsgDao;


    @Resource
    private IGroupSendMediaMsgDao groupSendMediaMsgDao;

    @Resource
    private IGroupRecMediaMsgDao groupRecMediaMsgDao;

    @Resource
    private IGroupStatusDao groupStatusDao;


    @RequestMapping(value="/recgrouptextmsg",method = RequestMethod.GET)
    public List<Object> getRecGroupTextMsg(@RequestParam("client")String client,@RequestParam("start_time")Integer startTime,@RequestParam("end_time")Integer endTime)
    {
        try {
            return groupRecTextMsgDao.getListByDate(client,startTime,endTime);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @RequestMapping(value="/sendgrouptextmsg",method = RequestMethod.GET)
    public List<Object> getSendGroupTextMsg(@RequestParam("client")String client,@RequestParam("start_time")Integer startTime,@RequestParam("end_time")Integer endTime)
    {
        try {
            return groupSendTextMsgDao.getListByDate(client,startTime,endTime);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @RequestMapping(value="/recgroupmediamsg",method = RequestMethod.GET)
    public List<Object> getRecGroupMediaMsg(@RequestParam("client")String client,@RequestParam("start_time")Integer startTime,@RequestParam("end_time")Integer endTime)
    {
        try {
            return groupRecMediaMsgDao.getListByDate(client,startTime,endTime);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @RequestMapping(value="/sendgroupmediamsg",method = RequestMethod.GET)
    public List<Object> getSendGroupMediaMsg(@RequestParam("client")String client,@RequestParam("start_time")Integer startTime,@RequestParam("end_time")Integer endTime)
    {
        try {
            return groupSendMediaMsgDao.getListByDate(client,startTime,endTime);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
    @RequestMapping(value="/groupstatusmsg",method = RequestMethod.GET)
    public List<JSONObject> getGroupStatusMsg(@RequestParam("client")String client,@RequestParam("start_time")Integer startTime,@RequestParam("end_time")Integer endTime)
    {
        try {
           List<GroupStatus> list= groupStatusDao.getListByDate(client,startTime,endTime);
           List<JSONObject> jsonList=new ArrayList<>();
           for(GroupStatus status :list)
           {
               JSONObject jsonObject=new JSONObject();
               jsonObject.put("id",status.getId());
               jsonObject.put("client",status.getClient());
               jsonObject.put("event",status.getEvent());
               jsonObject.put("post_type",status.getPost_type());
               jsonObject.put("time",status.getTime());
               JSONArray jsonArray=JSON.parseArray(status.getParams());
               jsonObject.put("params",jsonArray);
               jsonList.add(jsonObject);
           }
           return jsonList;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

	@RequestMapping(value="/",method = RequestMethod.POST)
	public void postWx(HttpServletRequest req,@RequestBody String body)
	{
	    System.out.println(body+req);
		String client=req.getParameter("client");

        dealBody(client,body);

	}

	public void dealBody(String client,String body)
	{
        JSONObject jsonObject=JSON.parseObject(body);
        String postType=jsonObject.getString("post_type");

        if(postType.equals("event"))
        {
            String event=jsonObject.getString("event");
            if(event.equals("lose_group_member")||event.equals("new_group_member"))
            {
                GroupStatus status=new GroupStatus();
                status.setClient(client);
                status.setEvent(jsonObject.getString("event"));
                status.setParams(jsonObject.getString("params"));
                status.setPost_type(jsonObject.getString("post_type"));
                status.setTime((int)(System.currentTimeMillis()/1000));
                groupStatusDao.save(status);
            }
        }
        if(postType.equals("receive_message"))
        {
            String type=jsonObject.getString("type");
            if(type.equals("group_message"))
            {
                String format=jsonObject.getString("format");
                if(format.equals("text"))
                {
                    GroupRecTextMsg textMsg=JSON.parseObject(body,GroupRecTextMsg.class);
                    textMsg.setClient(client);
                    groupRecTextMsgDao.save(textMsg);
                }
                if(format.equals("media"))
                {
                    GroupRecMediaMsg mediaMsg= JSON.parseObject(body,GroupRecMediaMsg.class);
                    mediaMsg.setClient(client);
                    groupRecMediaMsgDao.save(mediaMsg);
                }
            }
        }
        if(postType.equals("send_message"))
        {
            String type=jsonObject.getString("type");
            if(type.equals("group_message"))
            {
                String format=jsonObject.getString("format");
                if(format.equals("text"))
                {
                    GroupSendTextMsg textMsg=JSON.parseObject(body,GroupSendTextMsg.class);
                    textMsg.setClient(client);
                    groupSendTextMsgDao.save(textMsg);
                }
                if(format.equals("media"))
                {
                    GroupSendMediaMsg mediaMsg= JSON.parseObject(body,GroupSendMediaMsg.class);
                    mediaMsg.setClient(client);
                    groupSendMediaMsgDao.save(mediaMsg);
                }
            }
        }

	}

	public static void main(String[] args) {

		SpringApplication.run(WxserverApplication.class, args);
	}
}
