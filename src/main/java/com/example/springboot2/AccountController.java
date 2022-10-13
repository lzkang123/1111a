package com.example.springboot2;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @RequestMapping(value = "/acounts",method = RequestMethod.POST)
    public String save()
    {
        System.out.println("123123123123");
        int i=1/0;
        return "123";
    }
}
