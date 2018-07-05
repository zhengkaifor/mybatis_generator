package com.newland.iot.dao;

import com.newland.iot.model.SensorModbusValueCfg;

public interface SensorModbusValueCfgMapper {
    int deleteByPrimaryKey(Long valueId);

    int insert(SensorModbusValueCfg record);

    int insertSelective(SensorModbusValueCfg record);

    SensorModbusValueCfg selectByPrimaryKey(Long valueId);

    int updateByPrimaryKeySelective(SensorModbusValueCfg record);

    int updateByPrimaryKey(SensorModbusValueCfg record);
}