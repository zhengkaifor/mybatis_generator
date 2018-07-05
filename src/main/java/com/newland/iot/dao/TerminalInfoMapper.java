package com.newland.iot.dao;

import com.newland.iot.model.TerminalInfo;

public interface TerminalInfoMapper {
    int deleteByPrimaryKey(Long terminalId);

    int insert(TerminalInfo record);

    int insertSelective(TerminalInfo record);

    TerminalInfo selectByPrimaryKey(Long terminalId);

    int updateByPrimaryKeySelective(TerminalInfo record);

    int updateByPrimaryKey(TerminalInfo record);
}