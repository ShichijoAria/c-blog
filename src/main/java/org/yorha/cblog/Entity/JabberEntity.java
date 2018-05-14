package org.yorha.cblog.Entity;

import java.util.Date;

public class JabberEntity {
    private Long id;

    private String context;

    private Long userId;

    private Date publicatedTime;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context == null ? null : context.trim();
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getPublicatedTime() {
        return publicatedTime;
    }

    public void setPublicatedTime(Date publicatedTime) {
        this.publicatedTime = publicatedTime;
    }
}