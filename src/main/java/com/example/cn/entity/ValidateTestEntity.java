package com.example.cn.entity;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

/**
 * Created by Administrator on 12/16/2016.
 *  当我们使用@ConfigurationProperties的时候，我们希望对一些参数进行校验，
 *  比如有些参数为空或者数字超出的限制就抛出异常信息，那么这个怎么操作呢
 */
@Component
@ConfigurationProperties(prefix = "rk")
public class ValidateTestEntity {
    @URL
    private String url;
    @Max(value = 1000)
    @Min(value = 1)
    private int employCount;
    @NotNull
    private String name;
    @NotEmpty
    private String location;



    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public int getEmployCount() {
        return employCount;
    }

    public void setEmployCount(int employCount) {
        this.employCount = employCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


}
