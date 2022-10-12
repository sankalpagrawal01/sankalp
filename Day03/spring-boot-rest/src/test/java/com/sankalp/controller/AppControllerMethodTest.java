package com.sankalp.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AppControllerMethodTest {

    AppController appController;

    @Test
    public void helloTest(){
        MyController controller=new MyController();
        appController=new AppController(controller);
        String result=appController.sayHello();
        assertEquals("Hello Sankalp :) ",result);
    }

    @Test
    public void hiTest(){
        MyController controller=new MyController();
        appController=new AppController(controller);
        String result=appController.sayHi();
        assertEquals("Hi Sankalp :) ",result);
    }

    @Test
    public void byeTest(){
        MyController controller=new MyController();
        appController=new AppController(controller);
        String result=appController.sayBye();
        assertEquals("Bye Sankalp :) ",result);
    }
}
