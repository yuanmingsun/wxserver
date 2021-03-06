package com.seven.wxserver.dao;

import com.seven.wxserver.bean.GroupSendTextMsg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/29 18:28
 */
public interface IGroupSendTextMsgDao extends JpaRepository<GroupSendTextMsg,Integer>{
    @Query(value="select g from GroupRecTextMsg g where g.client=?1 and g.time between ?2 and ?3 order by g.time asc")
    List<Object> getListByDate(String client, Integer startTime, Integer endTime) throws Exception;
}
