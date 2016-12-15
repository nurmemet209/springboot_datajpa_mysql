package com.example.cn;

import com.example.cn.entity.CustomPropertyEntity;
import com.example.cn.entity.Test2Entity;
import com.example.cn.entity.TestEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Administrator on 12/14/2016.
 */

/**
 @Controller标识一个Spring类是Spring MVC controller处理器
 @RestController：  a convenience annotation that does nothing more than adding the@Controller and @ResponseBody annotations。
 @RestController是@Controller和@ResponseBody的结合体，两个标注合并起来的作用。
 */
@RestController
@RequestMapping("/rest")
public class MyRestController {

    @Autowired
    TestEntity entity;
    //${key:defaultValue},如果在application.properties文件中找不到key，用默认值
    @Value("${rk.username:alim}")
    private String name;


    @Autowired
    CustomPropertyEntity customPropertyEntity;

    @Autowired
    Test2Entity test2Entity;

    @RequestMapping("/welcome")
    public String welcome(){
        return "rest welcome";
    }
    @RequestMapping("/name")
    public String getProperty(){
        return name;
    }
    @RequestMapping("/injectProp")
    public String getInjectedProperty(){
        return entity.getMobilenum();
    }

    /**
     * 注入数组
     * @return   输出["rukiya","abdirimjan"]
     */
    @RequestMapping("/injectPropL")
    public List<String> getInjectedPropertyList(){
        return entity.getClassMates();
    }

    @RequestMapping("/injectPropFull")
    public String getInjectedFull(){
        return entity.getFullName();
    }

    @RequestMapping("/injectPropCus")
    public String getInjectedPropCus(){
        return customPropertyEntity.getCustomproperty();
    }

    /**
     * 浏览器返回nurmemet from custom properties
     * @return
     */
    @RequestMapping("/injectWithFunc")
    public String getInjectWithFunc(){
        return test2Entity.getUsername();
    }







}
