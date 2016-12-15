package com.example.cn.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 12/15/2016.
 * 自定义，属性文件也可以使用,配置下文件路径就可以
 */
@Component
@ConfigurationProperties(prefix = "rk" ,locations="classpath:custom.properties")
public class CustomPropertyEntity {

    private String customproperty;


    public String getCustomproperty() {
        return customproperty;
    }

    public void setCustomproperty(String customproperty) {
        this.customproperty = customproperty;
    }


}
