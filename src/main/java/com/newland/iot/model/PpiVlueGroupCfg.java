package com.newland.iot.model;

public class PpiVlueGroupCfg {
    private Long groupId;

    private String groupName;

    private Long terminalId;

    private Integer slaveId;

    private Integer type;

    private String da;

    private String sa;

    private String fc;

    private String dsap;

    private String ssap;

    private String regType;

    private Integer regOffset;

    private String dataNums;

    private Integer intervalTime;

    private Integer status;

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public Long getTerminalId() {
        return terminalId;
    }

    public void setTerminalId(Long terminalId) {
        this.terminalId = terminalId;
    }

    public Integer getSlaveId() {
        return slaveId;
    }

    public void setSlaveId(Integer slaveId) {
        this.slaveId = slaveId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getDa() {
        return da;
    }

    public void setDa(String da) {
        this.da = da;
    }

    public String getSa() {
        return sa;
    }

    public void setSa(String sa) {
        this.sa = sa;
    }

    public String getFc() {
        return fc;
    }

    public void setFc(String fc) {
        this.fc = fc;
    }

    public String getDsap() {
        return dsap;
    }

    public void setDsap(String dsap) {
        this.dsap = dsap;
    }

    public String getSsap() {
        return ssap;
    }

    public void setSsap(String ssap) {
        this.ssap = ssap;
    }

    public String getRegType() {
        return regType;
    }

    public void setRegType(String regType) {
        this.regType = regType;
    }

    public Integer getRegOffset() {
        return regOffset;
    }

    public void setRegOffset(Integer regOffset) {
        this.regOffset = regOffset;
    }

    public String getDataNums() {
        return dataNums;
    }

    public void setDataNums(String dataNums) {
        this.dataNums = dataNums;
    }

    public Integer getIntervalTime() {
        return intervalTime;
    }

    public void setIntervalTime(Integer intervalTime) {
        this.intervalTime = intervalTime;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}