package com.seven.wxserver.bean;


import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/22 18:07
 */
@Entity
@Table(name="groupSendTextMsg")
public class GroupSendTextMsg {

    /**
     * class : send
     * code :
     * content : 3
     * format : text
     * group : 口口三皮、test for vb
     * group_id : @@197c81e0d32c16301b605b66e816f0ff70f29ca0102a089f04eef1a21909223a
     * group_name :
     * group_uid :
     * id : 2140651398394703227
     * info : 来自其他设备
     * msg : 发送成功
     * post_type : send_message
     * sender : Seven
     * sender_account :
     * sender_id : @83b2fdb0a144a3d1c63786f8e68ed7df
     * sender_markname : Seven
     * sender_name :
     * sender_uid :
     * source : outer
     * time : 1516615494
     * type : group_message
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JSONField(name="p_id")
    @Column(name="id")
    private Integer id;
    @Column(name="client")
    private String client;
    @Column(name="classX")
    private String classX;
    @Column(name="code")
    private String code;
    @Column(name="content")
    private String content;
    @Column(name="format")
    private String format;
    @Column(name="msg_group")
    private String group;
    @Column(name="group_id")
    private String group_id;
    @Column(name="group_name")
    private String group_name;
    @Column(name="group_uid")
    private String group_uid;
    @Column(name="msg_id")
    private String msg_id;
    @Column(name="info")
    private String info;
    @Column(name="msg")
    private String msg;
    @Column(name="post_type")
    private String post_type;
    @Column(name="sender")
    private String sender;
    @Column(name="sender_account")
    private String sender_account;
    @Column(name="sender_id")
    private String sender_id;
    @Column(name="sender_markename")
    private String sender_markname;
    @Column(name="sender_name")
    private String sender_name;
    @Column(name="sender_uid")
    private String sender_uid;
    @Column(name="source")
    private String source;
    @Column(name="time")
    private int time;
    @Column(name="type")
    private String type;


    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getGroup_id() {
        return group_id;
    }

    public void setGroup_id(String group_id) {
        this.group_id = group_id;
    }

    public String getGroup_name() {
        return group_name;
    }

    public void setGroup_name(String group_name) {
        this.group_name = group_name;
    }

    public String getGroup_uid() {
        return group_uid;
    }

    public void setGroup_uid(String group_uid) {
        this.group_uid = group_uid;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getSender_account() {
        return sender_account;
    }

    public void setSender_account(String sender_account) {
        this.sender_account = sender_account;
    }

    public String getSender_id() {
        return sender_id;
    }

    public void setSender_id(String sender_id) {
        this.sender_id = sender_id;
    }

    public String getSender_markname() {
        return sender_markname;
    }

    public void setSender_markname(String sender_markname) {
        this.sender_markname = sender_markname;
    }

    public String getSender_name() {
        return sender_name;
    }

    public void setSender_name(String sender_name) {
        this.sender_name = sender_name;
    }

    public String getSender_uid() {
        return sender_uid;
    }

    public void setSender_uid(String sender_uid) {
        this.sender_uid = sender_uid;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
