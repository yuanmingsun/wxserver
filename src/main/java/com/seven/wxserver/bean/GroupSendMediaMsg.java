package com.seven.wxserver.bean;

import com.alibaba.fastjson.annotation.JSONField;

import javax.persistence.*;

/**
 * @author seven@vb.com.cn
 * @createDate 2018/1/30 14:19
 */
@Entity
@Table(name="groupSendMediaMsg")
public class GroupSendMediaMsg {

    /**
     * class : send
     * code :
     * content : [视频](non-exist-path)
     * format : media
     * group : 口口三皮、test for vb
     * group_id : @@0eda825f209a903890ad06aaf8ec708b8a50748402acf78dba8eb048c08dd3c5
     * group_name :
     * group_uid :
     * id : 1237046707006697832
     * info : 来自其他设备
     * media_code : 43
     * media_data :
     * media_ext : mp4
     * media_id : 1237046707006697832:43
     * media_mime : video/mp4
     * media_mtime : 1517292916
     * media_name : non-exist-path
     * media_path : non-exist-path
     * media_size :
     * media_type : video
     * msg : 发送成功
     * post_type : send_message
     * sender : Seven
     * sender_account :
     * sender_id : @fb409afac2b099f1d065a7dbdd88a10a
     * sender_markname : Seven
     * sender_name :
     * sender_uid :
     * source : outer
     * time : 1517292915
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
    @JSONField(name="id")
    private String msg_id;
    @Column(name="info")
    private String info;
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
    @Column(name="media_name")
    private String media_name;
    @Column(name="media_path")
    private String media_path;
    @Column(name="media_size")
    private String media_size;
    @Column(name="media_type")
    private String media_type;
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

    public String getClassX() {
        return classX;
    }

    public void setClassX(String classX) {
        this.classX = classX;
    }

    public String getCode() {
        return code;
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
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

    public String getMedia_name() {
        return media_name;
    }

    public void setMedia_name(String media_name) {
        this.media_name = media_name;
    }

    public String getMedia_path() {
        return media_path;
    }

    public void setMedia_path(String media_path) {
        this.media_path = media_path;
    }

    public String getMedia_size() {
        return media_size;
    }

    public void setMedia_size(String media_size) {
        this.media_size = media_size;
    }

    public String getMedia_type() {
        return media_type;
    }

    public void setMedia_type(String media_type) {
        this.media_type = media_type;
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
