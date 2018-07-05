package com.newland.iot.model;

import java.math.BigDecimal;

public class PpiValueCfg {
    private Long valueId;

    private Long groupId;

    private String valueName;

    private Integer valueType;

    private Integer startReg;

    private String valueUnit;

    private BigDecimal amplifiedFactor;

    private Integer status;

    public Long getValueId() {
        return valueId;
    }

    public void setValueId(Long valueId) {
        this.valueId = valueId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getValueName() {
        return valueName;
    }

    public void setValueName(String valueName) {
        this.valueName = valueName;
    }

    public Integer getValueType() {
        return valueType;
    }

    public void setValueType(Integer valueType) {
        this.valueType = valueType;
    }

    public Integer getStartReg() {
        return startReg;
    }

    public void setStartReg(Integer startReg) {
        this.startReg = startReg;
    }

    public String getValueUnit() {
        return valueUnit;
    }

    public void setValueUnit(String valueUnit) {
        this.valueUnit = valueUnit;
    }

    public BigDecimal getAmplifiedFactor() {
        return amplifiedFactor;
    }

    public void setAmplifiedFactor(BigDecimal amplifiedFactor) {
        this.amplifiedFactor = amplifiedFactor;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}