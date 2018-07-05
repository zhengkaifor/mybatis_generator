package com.newland.iot.dao;

import com.newland.iot.model.TerminalLoginHis;

public interface TerminalLoginHisMapper {
    int deleteByPrimaryKey(Long seqId);

    int insert(TerminalLoginHis record);

    int insertSelective(TerminalLoginHis record);

    TerminalLoginHis selectByPrimaryKey(Long seqId);

    int updateByPrimaryKeySelective(TerminalLoginHis record);

    int updateByPrimaryKey(TerminalLoginHis record);
}