package com.seven.wxserver.dao;

import com.seven.wxserver.bean.GroupRecMediaMsg;
import com.seven.wxserver.bean.GroupSendMediaMsg;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 14:26
 */
public interface IGroupSendMediaMsgDao extends JpaRepository<GroupSendMediaMsg,Integer> {
    @Query(value="select g from GroupSendMediaMsg g where g.client=?1 and g.time between ?2 and ?3 order by g.time asc")
    List<Object> getListByDate(String client, Integer startTime, Integer endTime) throws Exception;
}
