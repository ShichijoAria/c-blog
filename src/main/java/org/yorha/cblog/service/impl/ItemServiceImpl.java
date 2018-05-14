package org.yorha.cblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yorha.cblog.dao.ItemMapper;
import org.yorha.cblog.Entity.ItemEntity;
import org.yorha.cblog.service.ItemService;

import java.util.List;

@Service("itemService")
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemMapper itemMapper;

    @Override
    public List<ItemEntity> selectAllItem() {
        return itemMapper.selectAllItem();
    }
}
