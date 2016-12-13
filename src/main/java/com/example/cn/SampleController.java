package com.example.cn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.Map;


/**
 * Created by Administrator on 12/11/2016.
 */
@Controller
public class SampleController {

    @Value("${application.message:Hello World}")
    private String message = "Hello World";

    @Autowired
    private CityService cityService;

    @GetMapping("/test")
    @ResponseBody
    @Transactional(readOnly = true)
    public String helloWorld() {
        return this.cityService.getCity("Bath", "UK").getName();
    }

    @GetMapping("/name")
    public String welcome(Map<String, Object> model) {
        model.put("time", new Date());
        model.put("message", this.message);
        return "welcome";
    }
    @GetMapping("/allo")
    public String allo(Map<String, Object> model) {
        return "/test";
    }


}