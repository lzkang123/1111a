package com.example.springboot2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.logging.Filter;


public class HandlerInterceptorController extends WebMvcConfigurationSupport
{
    @Autowired
    intercept intercept;
    @Override
    protected void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(intercept).addPathPatterns("/student","/student/*");
    }

    public  Filter[] filter()
    {
        CharacterEncodingFilter filter=new CharacterEncodingFilter();
        filter.setEncoding("UTF-8");
        return  new Filter[]{(Filter) filter};
    }
}
