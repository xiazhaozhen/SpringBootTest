package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by sgl on 17/11/17.
 */
@Controller
public class HelloWorld {

    @ResponseBody
    @RequestMapping(value = "helloworld",method = RequestMethod.GET)
    public String helloWorld(){
        return "hello world";
    }
}
