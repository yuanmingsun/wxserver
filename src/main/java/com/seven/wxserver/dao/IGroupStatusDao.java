package com.seven.wxserver.dao;

import com.seven.wxserver.bean.GroupStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 15:46
 */
public interface IGroupStatusDao extends JpaRepository<GroupStatus,Integer>{
    @Query(value="select g from GroupStatus g where g.client=?1 and g.time between ?2 and ?3 order by g.time asc")
    List<GroupStatus> getListByDate(String client, Integer startTime, Integer endTime) throws Exception;
}
