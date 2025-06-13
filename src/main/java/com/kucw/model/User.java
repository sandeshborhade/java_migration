package com.kucw.model;

import java.io.Serializable;
import java.time.LocalDateTime;

public class User implements Serializable {
    private Integer id;
    private String name;
    private LocalDateTime updateTime;

    public User(){}

    public User(Integer id, String name, LocalDateTime updateTime) {
        this.id = id;
        this.name = name;
        this.updateTime = updateTime;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(LocalDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", updateTime=" + updateTime +
                '}';
    }
}
