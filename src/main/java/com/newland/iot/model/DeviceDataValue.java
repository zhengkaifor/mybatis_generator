package com.newland.iot.model;

import java.util.Date;

public class DeviceDataValue {
    private Long id;

    private Integer collectDate;

    private Integer systemId;

    private Long deviceId;

    private Long terminalId;

    private Long messageLogId;

    private String sensorNo;

    private Long valueId;

    private String valueName;

    private String value;

    private String valueByte;

    private String valueUnit;

    private Date collectTime;

    private Date insertTime;

    private Integer syncFlag;

    private Long sensorId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getCollectDate() {
        return collectDate;
    }

    public void setCollectDate(Integer collectDate) {
        this.collectDate = collectDate;
    }

    public Integer getSystemId() {
        return systemId;
    }

    public void setSystemId(Integer systemId) {
        this.systemId = systemId;
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

    public Long getMessageLogId() {
        return messageLogId;
    }

    public void setMessageLogId(Long messageLogId) {
        this.messageLogId = messageLogId;
    }

    public String getSensorNo() {
        return sensorNo;
    }

    public void setSensorNo(String sensorNo) {
        this.sensorNo = sensorNo;
    }

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getValueByte() {
        return valueByte;
    }

    public void setValueByte(String valueByte) {
        this.valueByte = valueByte;
    }

    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public Date getCollectTime() {
        return collectTime;
    }

    public void setCollectTime(Date collectTime) {
        this.collectTime = collectTime;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public Integer getSyncFlag() {
        return syncFlag;
    }

    public void setSyncFlag(Integer syncFlag) {
        this.syncFlag = syncFlag;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }
}