package com.newland.iot.dao;

import com.newland.iot.model.TerminalMessageLogHis;

public interface TerminalMessageLogHisMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TerminalMessageLogHis record);

    int insertSelective(TerminalMessageLogHis record);

    TerminalMessageLogHis selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TerminalMessageLogHis record);

    int updateByPrimaryKey(TerminalMessageLogHis record);
}