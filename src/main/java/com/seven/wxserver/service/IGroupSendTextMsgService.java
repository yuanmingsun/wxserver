package com.seven.wxserver.service;

import com.seven.wxserver.bean.GroupRecTextMsg;
import com.seven.wxserver.bean.GroupSendTextMsg;
import com.seven.wxserver.dao.IGroupSendTextMsgDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/29 18:29
 */
@Service
public class IGroupSendTextMsgService {
    @Resource
    private IGroupSendTextMsgDao groupSendTextMsgDao;


    @Transactional
    public void saveSendMsg(GroupSendTextMsg msg){
        groupSendTextMsgDao.save(msg);
    }
}
