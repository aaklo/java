package com.springboot.domain;

import java.io.Serializable;

/**
 * user
 * @author 
 */

public class User implements Serializable {
    private Integer id;

    private String name;

    private String passwd;

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

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    private static final long serialVersionUID = 1L;
}