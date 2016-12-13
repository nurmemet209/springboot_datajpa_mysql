package com.example.cn;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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

    @RequestMapping("/welcome")
    public String welcome(){
        return "rest welcome";
    }
}
