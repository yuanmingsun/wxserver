package com.seven.wxserver.bean;



import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/22 18:08
 */
@Entity
@Table(name="groupRecTextMsg")
public class GroupRecTextMsg {

    /**
     * class : recv
     * content : 3
     * format : text
     * group : 口口三皮、test for vb
     * group_id : @@197c81e0d32c16301b605b66e816f0ff70f29ca0102a089f04eef1a21909223a
     * group_name :
     * group_uid :
     * id : 2889292115277241039
     * post_type : receive_message
     * receiver : Seven
     * receiver_account :
     * receiver_id : @83b2fdb0a144a3d1c63786f8e68ed7df
     * receiver_markname : Seven
     * receiver_name :
     * receiver_uid :
     * sender : test for vb
     * sender_account :
     * sender_id : @6913a88e0e76f922f4c8a630f314b468491009b620b9dba14cdb3366cfdcd470
     * sender_markname : test for vb
     * sender_name :
     * sender_uid :
     * time : 1516615548
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
    @JSONField(name="class")
    private String classX;
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
    @JSONField(name="id")
    private String msg_id;
    @Column(name="post_type")
    private String post_type;
    @Column(name="receiver")
    private String receiver;
    @Column(name="receiver_account")
    private String receiver_account;
    @Column(name="receiver_id")
    private String receiver_id;
    @Column(name="receiver_markname")
    private String receiver_markname;
    @Column(name="receiver_name")
    private String receiver_name;
    @Column(name="receiver_uid")
    private String receiver_uid;
    @Column(name="sender")
    private String sender;
    @Column(name="sender_account")
    private String sender_account;
    @Column(name="sender_id")
    private String sender_id;
    @Column(name="sender_markname")
    private String sender_markname;
    @Column(name="sender_name")
    private String sender_name;
    @Column(name="sender_uid")
    private String sender_uid;
    @Column(name="time")
    private int time;
    @Column(name="type")
    private String type;
    public String getClient() {
        return client;
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

    public void setClient(String client) {
        this.client = client;
    }
    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
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



    public String getPost_type() {
        return post_type;
    }

    public void setPost_type(String post_type) {
        this.post_type = post_type;
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getReceiver_account() {
        return receiver_account;
    }

    public void setReceiver_account(String receiver_account) {
        this.receiver_account = receiver_account;
    }

    public String getReceiver_id() {
        return receiver_id;
    }

    public void setReceiver_id(String receiver_id) {
        this.receiver_id = receiver_id;
    }

    public String getReceiver_markname() {
        return receiver_markname;
    }

    public void setReceiver_markname(String receiver_markname) {
        this.receiver_markname = receiver_markname;
    }

    public String getReceiver_name() {
        return receiver_name;
    }

    public void setReceiver_name(String receiver_name) {
        this.receiver_name = receiver_name;
    }

    public String getReceiver_uid() {
        return receiver_uid;
    }

    public void setReceiver_uid(String receiver_uid) {
        this.receiver_uid = receiver_uid;
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
