package com.seven.wxserver.bean;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 14:18
 */
@Entity
@Table(name="groupRecMediaMsg")
public class GroupRecMediaMsg {

    /**
     * class : recv
     * content : [语音](C:\Users\34819\AppData\Local\Temp\mojo_weixin_media_pJWe.mp3)
     * format : media
     * group : 口口三皮、test for vb
     * group_id : @@0eda825f209a903890ad06aaf8ec708b8a50748402acf78dba8eb048c08dd3c5
     * group_name :
     * group_uid :
     * id : 7960011890976953179
     * media_code : 34
     * media_data :
     * media_ext : mp3
     * media_id : 7960011890976953179:34
     * media_mime : audio/mp3
     * media_mtime : 1517294541
     * media_path : C:\Users\34819\AppData\Local\Temp\mojo_weixin_media_pJWe.mp3
     * media_size : 3130
     * media_type : voice
     * post_type : receive_message
     * receiver : Seven
     * receiver_account :
     * receiver_id : @fb409afac2b099f1d065a7dbdd88a10a
     * receiver_markname : Seven
     * receiver_name :
     * receiver_uid :
     * sender : 口口三皮
     * sender_account :
     * sender_id : @bf16bde3408d38f94810a86410e9d5c0
     * sender_markname : 口口三皮
     * sender_name :
     * sender_uid :
     * time : 1517294542
     * type : group_message
     */
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JSONField(name="p_id")
    @Column(name="id")
    private Integer id;

    @Column(name="client")
    private String client;
    @JSONField(name="class")
    @Column(name="classX")
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
    @Column(name="media_code")
    private int media_code;
    @Column(name="media_data")
    private String media_data;
    @Column(name="media_ext")
    private String media_ext;
    @Column(name="media_id")
    private String media_id;
    @Column(name="media_mime")
    private String media_mime;
    @Column(name="media_mtime")
    private int media_mtime;
    @Column(name="media_path")
    private String media_path;
    @Column(name="media_size")
    private int media_size;
    @Column(name="media_type")
    private String media_type;
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
    @Column(name="sende_markename")
    private String sender_markname;
    @Column(name="sender_name")
    private String sender_name;
    @Column(name="sender_uid")
    private String sender_uid;
    @Column(name="time")
    private int time;
    @Column(name="type")
    private String type;

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

    public String getMsg_id() {
        return msg_id;
    }

    public void setMsg_id(String msg_id) {
        this.msg_id = msg_id;
    }

    public int getMedia_code() {
        return media_code;
    }

    public void setMedia_code(int media_code) {
        this.media_code = media_code;
    }

    public String getMedia_data() {
        return media_data;
    }

    public void setMedia_data(String media_data) {
        this.media_data = media_data;
    }

    public String getMedia_ext() {
        return media_ext;
    }

    public void setMedia_ext(String media_ext) {
        this.media_ext = media_ext;
    }

    public String getMedia_id() {
        return media_id;
    }

    public void setMedia_id(String media_id) {
        this.media_id = media_id;
    }

    public String getMedia_mime() {
        return media_mime;
    }

    public void setMedia_mime(String media_mime) {
        this.media_mime = media_mime;
    }

    public int getMedia_mtime() {
        return media_mtime;
    }

    public void setMedia_mtime(int media_mtime) {
        this.media_mtime = media_mtime;
    }

    public String getMedia_path() {
        return media_path;
    }

    public void setMedia_path(String media_path) {
        this.media_path = media_path;
    }

    public int getMedia_size() {
        return media_size;
    }

    public void setMedia_size(int media_size) {
        this.media_size = media_size;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
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
