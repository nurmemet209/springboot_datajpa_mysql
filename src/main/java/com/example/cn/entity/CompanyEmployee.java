package com.example.cn.entity;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 12/16/2016.
 * 通过静态内部类注入
 */
@ConfigurationProperties(prefix = "com.kfit",locations = "classpath:custom.properties")
@Component
public class CompanyEmployee {


    private CompanyEmployeeInfo employForzs;

    private CompanyEmployeeInfo employForls;

    public CompanyEmployeeInfo getEmployForzs() {
        return employForzs;
    }

    public void setEmployForzs(CompanyEmployeeInfo employForzs) {
        this.employForzs = employForzs;
    }

    public CompanyEmployeeInfo getEmployForls() {
        return employForls;
    }

    public void setEmployForls(CompanyEmployeeInfo employForls) {
        this.employForls = employForls;
    }

    public static class CompanyEmployeeInfo {
        private String name;
        private int age;
        private String gender;
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public int getAge() {
            return age;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getGender() {
            return gender;
        }
        public void setGender(String gender) {
            this.gender = gender;
        }
        @Override
        public String toString() {
            return "EmployForzs [name=" + name + ", age=" + age + ", gender=" + gender + "]";
        }
    }

    @Override
    public String toString() {
        return "CompanyEmployee [employForzs=" + employForzs + ", employForls=" + employForls + "]";
    }

}
