package com.seven.wxserver.service;

import com.seven.wxserver.bean.GroupRecMediaMsg;
import com.seven.wxserver.dao.IGroupRecMediaMsgDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 15:11
 */
@Service
public class IGroupRecMediaMsgService {
    @Resource
    private IGroupRecMediaMsgDao recMediaMsgDao;

    @Transactional
    public void saveSendMediaMsg(GroupRecMediaMsg msg){
        recMediaMsgDao.save(msg);
    }
}
