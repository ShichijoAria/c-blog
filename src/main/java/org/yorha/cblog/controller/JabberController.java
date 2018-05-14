package org.yorha.cblog.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.yorha.cblog.Entity.JabberEntity;
import org.yorha.cblog.service.JabberService;

import java.util.List;

@RestController
public class JabberController {
    @Autowired
    public JabberService jabberService;

    @PostMapping("jabber/selectAll")
    @ResponseBody
    @CrossOrigin
    public Object selectAll(@RequestParam(value = "pageNum",required = false,defaultValue = "1")int pageNum,
                            @RequestParam(value = "pageSize",required = false,defaultValue = "5")int pageSize){
        PageHelper.startPage(pageNum, pageSize);
        List<JabberEntity> list=jabberService.selectAllJabber();
        PageInfo<JabberEntity> page = new PageInfo<JabberEntity>(list);
        return page;
    }
}
