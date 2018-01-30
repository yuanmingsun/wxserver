package com.seven.wxserver.service;

import com.seven.wxserver.bean.GroupRecTextMsg;
import com.seven.wxserver.dao.IGroupRecTextMsgDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/29 15:31
 */
@Service
public class IGroupRecTextMsgService {

    @Resource
    private IGroupRecTextMsgDao groupRecTextMsgDao;

    @Transactional
    public void saveRecTextMsg(GroupRecTextMsg msg){
        groupRecTextMsgDao.save(msg);
    }
}
