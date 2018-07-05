package com.newland.iot.dao;

import com.newland.iot.model.PpiVlueGroupCfg;

public interface PpiVlueGroupCfgMapper {
    int deleteByPrimaryKey(Long groupId);

    int insert(PpiVlueGroupCfg record);

    int insertSelective(PpiVlueGroupCfg record);

    PpiVlueGroupCfg selectByPrimaryKey(Long groupId);

    int updateByPrimaryKeySelective(PpiVlueGroupCfg record);

    int updateByPrimaryKey(PpiVlueGroupCfg record);
}