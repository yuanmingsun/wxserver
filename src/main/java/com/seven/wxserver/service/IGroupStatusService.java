package com.seven.wxserver.service;

import com.seven.wxserver.bean.GroupSendTextMsg;
import com.seven.wxserver.bean.GroupStatus;
import com.seven.wxserver.dao.IGroupStatusDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 15:46
 */
@Service
public class IGroupStatusService {

    @Resource
    private IGroupStatusDao iGroupStatusDao;

    @Transactional
    public void saveStatus(GroupStatus msg){
        iGroupStatusDao.save(msg);
    }
}
