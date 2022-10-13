package com.example.springboot2;

import org.springframework.web.bind.annotation.*;

import java.lang.invoke.MethodHandle;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@RestController
@RequestMapping("/users")
public class UserController {

    @GetMapping
    public  String getAll()
    {
        System.out.println("=====getAll======你妈啊");
        System.out.println("=====git======你妈啊");
        return  "4156a4sd6asd";
    }
    @GetMapping("/{id}")
    public  String getById(@PathVariable int id)
    {
        System.out.println("=====getById======你妈啊"+id);
        return  "4156a4sd6asd";
    }
    @DeleteMapping("/{id}")
    public  String DeleteById(@PathVariable int id)
    {
        System.out.println("====DeleteById=======你妈啊"+id);
        return  "4156a4sd6asd";
    }
    @PutMapping
    public  String Update(@RequestBody User u)
    {
        System.out.println("======Update=====你妈啊"+u);
        return  "4156a4sd6asd";
    }

    @RequestMapping("/save5")
    public  String Insert(@RequestBody User u)
    {
        System.out.println("=======Insert====你妈啊"+ u);
        return  "4156a4sd6asd";
    }
//    @RequestMapping("/save6")
//        public  String getById6(@RequestParam List<String> u)
//    {
//        System.out.println("===========你妈啊"+ u);
//        return  "4156a4sd6asd";
//    }
//    @RequestMapping("/save7")
//    public  String getById7(@RequestBody List<String> u)
//    {
//        System.out.println("===========你妈啊"+ u);
//        return  "4156a4sd6asd";
//    }
//    @RequestMapping("/save8")
//    public  String getById8(@RequestBody User u)
//    {
//        System.out.println("===========你妈啊"+ u);
//        return  "4156a4sd6asd";
//    }
//    @RequestMapping("/save9")
//    public  String getById9(@RequestBody List<User> u)
//    {
//        System.out.println("===========你妈啊"+ u);
//        return  "4156a4sd6asd";
//    }
//    @RequestMapping("/save10")
//    public  String getById10(@RequestBody User[] u)
//    {
//        System.out.println("===========你妈啊"+ Arrays.toString(u));
//        return  "4156a4sd6asd";
//    }
//    @RequestMapping("/save11")
//    @ResponseBody
//    public  String getById11()
//    {
//        System.out.println("===========你妈啊");
//        return  "{'a':'132'}";
//    }
//    @RequestMapping("/save12")
//    public  String getById12()
//    {
//        List<User> l=new ArrayList<User>();
//        User u1=new User();
//
//        System.out.println("===========你妈啊");
//        return  "123.html";
//    }
}
