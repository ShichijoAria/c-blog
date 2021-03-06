package org.yorha.cblog.Entity;

import java.util.Date;

public class ItemEntity {
    private Long id;

    private String name;

    private Date publicatedTime;

    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Date getPublicatedTime() {
        return publicatedTime;
    }

    public void setPublicatedTime(Date publicatedTime) {
        this.publicatedTime = publicatedTime;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}