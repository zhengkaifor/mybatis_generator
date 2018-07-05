package com.newland.iot.dao;

import com.newland.iot.model.PpiValueCfg;

public interface PpiValueCfgMapper {
    int deleteByPrimaryKey(Long valueId);

    int insert(PpiValueCfg record);

    int insertSelective(PpiValueCfg record);

    PpiValueCfg selectByPrimaryKey(Long valueId);

    int updateByPrimaryKeySelective(PpiValueCfg record);

    int updateByPrimaryKey(PpiValueCfg record);
}