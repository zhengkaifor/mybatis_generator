package com.newland.iot.model;

public class DeviceInfo {
    private Long deviceId;

    private Integer systemId;

    private String deviceNo;

    private String deviceName;

    private String deviceSn;

    private String description;

    private Long customerId;

    private String deviceAddr;

    private Long groupId;

    private String msisdn;

    private Long appId;

    private Integer status;

    private Long userId;

    private Long gatewayId;

    private Integer gatewayType;

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
    }

    public String getDeviceNo() {
        return deviceNo;
    }

    public void setDeviceNo(String deviceNo) {
        this.deviceNo = deviceNo;
    }

    public String getDeviceName() {
        return deviceName;
    }

    public void setDeviceName(String deviceName) {
        this.deviceName = deviceName;
    }

    public String getDeviceSn() {
        return deviceSn;
    }

    public void setDeviceSn(String deviceSn) {
        this.deviceSn = deviceSn;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getDeviceAddr() {
        return deviceAddr;
    }

    public void setDeviceAddr(String deviceAddr) {
        this.deviceAddr = deviceAddr;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getMsisdn() {
        return msisdn;
    }

    public void setMsisdn(String msisdn) {
        this.msisdn = msisdn;
    }

    public Long getAppId() {
        return appId;
    }

    public void setAppId(Long appId) {
        this.appId = appId;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getGatewayId() {
        return gatewayId;
    }

    public void setGatewayId(Long gatewayId) {
        this.gatewayId = gatewayId;
    }

    public Integer getGatewayType() {
        return gatewayType;
    }

    public void setGatewayType(Integer gatewayType) {
        this.gatewayType = gatewayType;
    }

    @Override
    public String toString() {
        return "DeviceInfo{" +
                "deviceId=" + deviceId +
                ", systemId=" + systemId +
                ", deviceNo='" + deviceNo + '\'' +
                ", deviceName='" + deviceName + '\'' +
                ", deviceSn='" + deviceSn + '\'' +
                ", description='" + description + '\'' +
                ", customerId=" + customerId +
                ", deviceAddr='" + deviceAddr + '\'' +
                ", groupId=" + groupId +
                ", msisdn='" + msisdn + '\'' +
                ", appId=" + appId +
                ", status=" + status +
                ", userId=" + userId +
                ", gatewayId=" + gatewayId +
                ", gatewayType=" + gatewayType +
                '}';
    }
}