package com.newland.iot.dao;

import com.newland.iot.model.TerminalMessageLog;

public interface TerminalMessageLogMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalMessageLog record);

    int insertSelective(TerminalMessageLog record);

    TerminalMessageLog selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalMessageLog record);

    int updateByPrimaryKey(TerminalMessageLog record);
}