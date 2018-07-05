package com.newland.iot.dao;

import com.newland.iot.model.DeviceInfo;

public interface DeviceInfoMapper {
    int deleteByPrimaryKey(Long deviceId);

    int insert(DeviceInfo record);

    int insertSelective(DeviceInfo record);

    DeviceInfo selectByPrimaryKey(Long deviceId);

    int updateByPrimaryKeySelective(DeviceInfo record);

    int updateByPrimaryKey(DeviceInfo record);
}