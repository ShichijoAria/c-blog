package org.yorha.cblog.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yorha.cblog.Entity.ItemEntity;
import org.yorha.cblog.service.ItemService;

import java.util.List;

@RestController
@RequestMapping("/admin/item")
public class ItemController {
    @Autowired
    private ItemService itemService;


    @PostMapping("selectAll")
    @CrossOrigin
    @ResponseBody
    public Object selectAll(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
        @RequestParam(value = "pageSize",required = false,defaultValue = "5")int pageSize){
            PageHelper.startPage(pageNum, pageSize);
            List<ItemEntity> list=itemService.selectAllItem();
            PageInfo<ItemEntity> page = new PageInfo<ItemEntity>(list);
            return page;
    }
}
