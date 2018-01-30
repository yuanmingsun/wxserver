package com.seven.wxserver.bean;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 15:43
 */
@Entity
@Table(name = "group_status")
public class GroupStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JSONField(name = "p_id")
    @Column(name = "id")
    private Integer id;
    @Column(name = "client")
    private String client;
    @Column(name = "event")
    private String event;
    @Column(name = "params")
    private String params;
    @Column(name = "post_type")
    private String post_type;
    @Column(name = "time")
  private Integer time;

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getParams() {
        return params;
    }

    public void setParams(String params) {
        this.params = params;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }
}
