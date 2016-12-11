package com.example.cn;

import org.springframework.util.Assert;

import java.io.Serializable;

/**
 * Created by Administrator on 12/11/2016.
 */
public class CitySearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public CitySearchCriteria() {
    }

    public CitySearchCriteria(String name) {
        Assert.notNull(name, "Name must not be null");
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}