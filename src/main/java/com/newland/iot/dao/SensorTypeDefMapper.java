package com.newland.iot.dao;

import com.newland.iot.model.SensorTypeDef;

public interface SensorTypeDefMapper {
    int deleteByPrimaryKey(Integer typeId);

    int insert(SensorTypeDef record);

    int insertSelective(SensorTypeDef record);

    SensorTypeDef selectByPrimaryKey(Integer typeId);

    int updateByPrimaryKeySelective(SensorTypeDef record);

    int updateByPrimaryKey(SensorTypeDef record);
}