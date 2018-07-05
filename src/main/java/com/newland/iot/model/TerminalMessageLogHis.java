package com.newland.iot.model;

import java.util.Date;

public class TerminalMessageLogHis {
    private Long id;

    private Integer insertDate;

    private Integer systemId;

    private Long gatewayId;

    private String terminalIp;

    private Long deviceId;

    private Long terminalId;

    private String reqMessage;

    private String respMessage;

    private Date requestTime;

    private Date respTime;

    private Integer status;

    private Integer errorCode;

    private String errorMsg;

    private Date bakTime;

    private Integer requestSrc;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getInsertDate() {
        return insertDate;
    }

    public void setInsertDate(Integer insertDate) {
        this.insertDate = insertDate;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public Long getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
    }

    public String getTerminalIp() {
        return terminalIp;
    }

    public void setTerminalIp(String terminalIp) {
        this.terminalIp = terminalIp;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Long getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Long terminalId) {
        this.terminalId = terminalId;
    }

    public String getReqMessage() {
        return reqMessage;
    }

    public void setReqMessage(String reqMessage) {
        this.reqMessage = reqMessage;
    }

    public String getRespMessage() {
        return respMessage;
    }

    public void setRespMessage(String respMessage) {
        this.respMessage = respMessage;
    }

    public Date getRequestTime() {
        return requestTime;
    }

    public void setRequestTime(Date requestTime) {
        this.requestTime = requestTime;
    }

    public Date getRespTime() {
        return respTime;
    }

    public void setRespTime(Date respTime) {
        this.respTime = respTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getErrorCode() {
        return errorCode;
    }

    public void setErrorCode(Integer errorCode) {
        this.errorCode = errorCode;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public Date getBakTime() {
        return bakTime;
    }

    public void setBakTime(Date bakTime) {
        this.bakTime = bakTime;
    }

    public Integer getRequestSrc() {
        return requestSrc;
    }

    public void setRequestSrc(Integer requestSrc) {
        this.requestSrc = requestSrc;
    }
}