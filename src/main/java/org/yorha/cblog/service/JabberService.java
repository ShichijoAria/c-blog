package org.yorha.cblog.service;

import org.yorha.cblog.Entity.JabberEntity;

import java.util.List;

public interface JabberService {
    public List<JabberEntity> selectAllJabber();
}
