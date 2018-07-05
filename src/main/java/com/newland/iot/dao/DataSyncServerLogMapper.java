package com.newland.iot.dao;

import com.newland.iot.model.DataSyncServerLog;

public interface DataSyncServerLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(DataSyncServerLog record);

    int insertSelective(DataSyncServerLog record);

    DataSyncServerLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(DataSyncServerLog record);

    int updateByPrimaryKeyWithBLOBs(DataSyncServerLog record);

    int updateByPrimaryKey(DataSyncServerLog record);
}