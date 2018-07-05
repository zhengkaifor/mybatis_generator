package com.newland.iot.dao;

import com.newland.iot.model.SensorYangshengValueCfg;

public interface SensorYangshengValueCfgMapper {
    int deleteByPrimaryKey(Long valueId);

    int insert(SensorYangshengValueCfg record);

    int insertSelective(SensorYangshengValueCfg record);

    SensorYangshengValueCfg selectByPrimaryKey(Long valueId);

    int updateByPrimaryKeySelective(SensorYangshengValueCfg record);

    int updateByPrimaryKey(SensorYangshengValueCfg record);
}