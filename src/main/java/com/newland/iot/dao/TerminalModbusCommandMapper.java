package com.newland.iot.dao;

import com.newland.iot.model.TerminalModbusCommand;

public interface TerminalModbusCommandMapper {
    int deleteByPrimaryKey(Long commandId);

    int insert(TerminalModbusCommand record);

    int insertSelective(TerminalModbusCommand record);

    TerminalModbusCommand selectByPrimaryKey(Long commandId);

    int updateByPrimaryKeySelective(TerminalModbusCommand record);

    int updateByPrimaryKey(TerminalModbusCommand record);
}