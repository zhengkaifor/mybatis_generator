package com.newland.iot.dao;

import com.newland.iot.model.LoraMessageLog;

public interface LoraMessageLogMapper {
    int deleteByPrimaryKey(Long seqId);

    int insert(LoraMessageLog record);

    int insertSelective(LoraMessageLog record);

    LoraMessageLog selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(LoraMessageLog record);

    int updateByPrimaryKey(LoraMessageLog record);
}