package com.example.cn.entity;

/**
 * Created by Administrator on 12/15/2016.
 */

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;

/**
    这个类的属性从application.properties文件中读取
    注入方法一样
    @Autowired
    TestEntity entity;
    必须提供getter,setter方法
    数组也可以注入

 */
@Component
@ConfigurationProperties(prefix = "rk")//配置文件中读取属性
public class TestEntity {

    private String username;
    private String mobilenum;
    private List<String> classMates;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     松散的绑定规则
     意思是application.properties文件中的属性跟bean中的属性不需要精确匹配
     如下面的一样
     其实Spring内部也有这种使用如
     context-path,spring.jpa.show-sql   contextPath,showSql
     */
    //大写转为小写
    //rk.FIST_NAME=nuralimjan
    private String firstName;
    //rk.last-name
    //分割线之后的单词第一个字母转为大写
    private String lastName;

    private String fullName;


    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }





    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }




    public List<String> getClassMates() {
        return classMates;
    }

    public void setClassMates(List<String> classMates) {
        this.classMates = classMates;
    }



    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getMobilenum() {
        return mobilenum;
    }

    public void setMobilenum(String mobilenum) {
        this.mobilenum = mobilenum;
    }


}
