package com.newland.iot.dao;

import com.newland.iot.model.DeviceDataValue;

public interface DeviceDataValueMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DeviceDataValue record);

    int insertSelective(DeviceDataValue record);

    DeviceDataValue selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DeviceDataValue record);

    int updateByPrimaryKey(DeviceDataValue record);
}