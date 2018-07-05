package com.newland.iot.dao;

import com.newland.iot.model.DataControlLog;

public interface DataControlLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DataControlLog record);

    int insertSelective(DataControlLog record);

    DataControlLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DataControlLog record);

    int updateByPrimaryKey(DataControlLog record);
}