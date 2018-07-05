package com.newland.iot.model;

import java.util.Date;

public class LoraMessageLog {
    private Long seqId;

    private Integer applicationId;

    private String applicationName;

    private String nodeName;

    private String devEui;

    private String mac;

    private String uploadTime;

    private String rssi;

    private Integer fcnt;

    private Integer fport;

    private String data;

    private Date recieveTime;

    public Long getSeqId() {
        return seqId;
    }

    public void setSeqId(Long seqId) {
        this.seqId = seqId;
    }

    public Integer getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(Integer applicationId) {
        this.applicationId = applicationId;
    }

    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public String getDevEui() {
        return devEui;
    }

    public void setDevEui(String devEui) {
        this.devEui = devEui;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getUploadTime() {
        return uploadTime;
    }

    public void setUploadTime(String uploadTime) {
        this.uploadTime = uploadTime;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    public Integer getFcnt() {
        return fcnt;
    }

    public void setFcnt(Integer fcnt) {
        this.fcnt = fcnt;
    }

    public Integer getFport() {
        return fport;
    }

    public void setFport(Integer fport) {
        this.fport = fport;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Date getRecieveTime() {
        return recieveTime;
    }

    public void setRecieveTime(Date recieveTime) {
        this.recieveTime = recieveTime;
    }
}