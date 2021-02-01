package com.wangpip.jenkins.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * ClassName: JenkinsController <br/>
 * Description: <br/>
 * date: 2021/1/28 10:21<br/>
 *
 * @author lenovo<br />
 * @version v1.0
 * @since JDK 1.8
 */
@RestController
public class JenkinsController {

    private int a;
   //
    private int c;

    @GetMapping("/index")
    public Object index(){
        return "hello jenkins 123456 2222 444";
    }
}
