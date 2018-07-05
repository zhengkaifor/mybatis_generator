package com.newland.iot.dao;

import com.newland.iot.model.TerminalSensorCfg;

public interface TerminalSensorCfgMapper {
    int deleteByPrimaryKey(Long sensorId);

    int insert(TerminalSensorCfg record);

    int insertSelective(TerminalSensorCfg record);

    TerminalSensorCfg selectByPrimaryKey(Long sensorId);

    int updateByPrimaryKeySelective(TerminalSensorCfg record);

    int updateByPrimaryKey(TerminalSensorCfg record);
}