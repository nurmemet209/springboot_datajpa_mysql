package com.example.cn;

import com.example.cn.entity.Test2Entity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


/**
 * Created by Administrator on 12/11/2016.
 */
@Controller
@RequestMapping("/")
public class SampleController {


    public int serverPort;

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @Autowired
    private CityService cityService;
    @Autowired
    Test2Entity test2Entity;

    @GetMapping("test")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        return this.cityService.getCity("Bath", "UK").getName();
    }


    /**
     * 浏览器返回nurmemet from custom properties
     * @return
     */
    @GetMapping("beanTest")
    @ResponseBody
    @Transactional(readOnly = true)
    public String prop() {
        return test2Entity.getUsername();
    }





}