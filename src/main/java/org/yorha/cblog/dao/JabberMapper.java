package org.yorha.cblog.dao;

import org.yorha.cblog.Entity.JabberEntity;

import java.util.List;

public interface JabberMapper {
    List<JabberEntity> selectAllJabber();

    int deleteByPrimaryKey(Long id);

    int insert(JabberEntity record);

    int insertSelective(JabberEntity record);

    JabberEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(JabberEntity record);

    int updateByPrimaryKey(JabberEntity record);
}