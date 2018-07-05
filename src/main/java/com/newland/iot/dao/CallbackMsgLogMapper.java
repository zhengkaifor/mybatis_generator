package com.newland.iot.dao;

import com.newland.iot.model.CallbackMsgLog;

public interface CallbackMsgLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CallbackMsgLog record);

    int insertSelective(CallbackMsgLog record);

    CallbackMsgLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CallbackMsgLog record);

    int updateByPrimaryKey(CallbackMsgLog record);
}