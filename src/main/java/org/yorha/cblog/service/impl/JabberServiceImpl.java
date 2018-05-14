package org.yorha.cblog.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.yorha.cblog.dao.JabberMapper;
import org.yorha.cblog.Entity.JabberEntity;
import org.yorha.cblog.service.JabberService;

import java.util.List;

@Service("jabberService")
public class JabberServiceImpl implements JabberService {
    @Autowired
    private JabberMapper jabberMapper;

    public List<JabberEntity> selectAllJabber() {
        return jabberMapper.selectAllJabber();
    }
}
