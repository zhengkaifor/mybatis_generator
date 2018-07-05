package com.newland.iot.dao;

import com.newland.iot.model.TerminalYangshengCommand;

public interface TerminalYangshengCommandMapper {
    int deleteByPrimaryKey(Long commandId);

    int insert(TerminalYangshengCommand record);

    int insertSelective(TerminalYangshengCommand record);

    TerminalYangshengCommand selectByPrimaryKey(Long commandId);

    int updateByPrimaryKeySelective(TerminalYangshengCommand record);

    int updateByPrimaryKey(TerminalYangshengCommand record);
}