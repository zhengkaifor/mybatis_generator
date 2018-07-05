package com.newland.iot.model;

import java.math.BigDecimal;

public class SensorModbusValueCfg {
    private Long valueId;

    private Long commandId;

    private String sensorName;

    private Long sensorId;

    private String sensorNo;

    private Integer dataType;

    private Integer startReg;

    private BigDecimal amplifiedFactor;

    private String model;

    private Integer status;

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Long getCommandId() {
        return commandId;
    }

    public void setCommandId(Long commandId) {
        this.commandId = commandId;
    }

    public String getSensorName() {
        return sensorName;
    }

    public void setSensorName(String sensorName) {
        this.sensorName = sensorName;
    }

    public Long getSensorId() {
        return sensorId;
    }

    public void setSensorId(Long sensorId) {
        this.sensorId = sensorId;
    }

    public String getSensorNo() {
        return sensorNo;
    }

    public void setSensorNo(String sensorNo) {
        this.sensorNo = sensorNo;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public Integer getStartReg() {
        return startReg;
    }

    public void setStartReg(Integer startReg) {
        this.startReg = startReg;
    }

    public BigDecimal getAmplifiedFactor() {
        return amplifiedFactor;
    }

    public void setAmplifiedFactor(BigDecimal amplifiedFactor) {
        this.amplifiedFactor = amplifiedFactor;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}