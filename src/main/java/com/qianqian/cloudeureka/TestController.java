package com.qianqian.cloudeureka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @RequestMapping("/jenkins")
    public String jenkins(){
        return "jenkins complete changed again";
    }
}
