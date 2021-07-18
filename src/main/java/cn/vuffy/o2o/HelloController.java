package cn.vuffy.o2o;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Auther: vuffy
 * Date:   2021/7/172:36 下午
 * Description:
 */

@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello()  throws Exception{
        return "Hello ,Spring Boot!";
    }
}
