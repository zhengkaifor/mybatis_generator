package com.newland.iot.dao;

import com.newland.iot.model.CallbackMsg;

public interface CallbackMsgMapper {
    int deleteByPrimaryKey(Long id);

    int insert(CallbackMsg record);

    int insertSelective(CallbackMsg record);

    CallbackMsg selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(CallbackMsg record);

    int updateByPrimaryKey(CallbackMsg record);
}