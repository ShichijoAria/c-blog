package org.yorha.cblog.dao;

import org.yorha.cblog.Entity.ItemEntity;

import java.util.List;

public interface ItemMapper {
    List<ItemEntity> selectAllItem();

    int deleteByPrimaryKey(Long id);

    int insert(ItemEntity record);

    int insertSelective(ItemEntity record);

    ItemEntity selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(ItemEntity record);

    int updateByPrimaryKey(ItemEntity record);
}