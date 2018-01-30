package com.seven.wxserver.service;

import com.seven.wxserver.bean.GroupSendMediaMsg;
import com.seven.wxserver.dao.IGroupSendMediaMsgDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 14:27
 */
@Service
public class IGroupSendMediaMsgService {
    @Resource
    private IGroupSendMediaMsgDao sendMediaMsgDao;

    @Transactional
    public void saveSendMediaMsg(GroupSendMediaMsg msg){
       sendMediaMsgDao.save(msg);
    }
}
