package com.example.springboot2;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class ExceptionAdvice {
    @ExceptionHandler(Exception.class)
    public void exceptionadvice(Exception e)
    {
        System.out.println("捕捉到异常-----------------"+e);
    }
}
