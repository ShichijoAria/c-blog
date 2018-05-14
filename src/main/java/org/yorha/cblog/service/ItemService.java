package org.yorha.cblog.service;

import org.yorha.cblog.Entity.ItemEntity;

import java.util.List;

public interface ItemService {
    List<ItemEntity> selectAllItem();
}
