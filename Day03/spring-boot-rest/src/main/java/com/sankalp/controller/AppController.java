package com.sankalp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {

    /* @Autowired
   MyController myController;*/
    private MyController myController;

    public AppController( MyController myCalculator){
        this.myController=myCalculator;
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello Sankalp :) ";
    }

    @GetMapping("/bye")
    public String sayBye() {
        return "Bye Sankalp :) ";
    }

    @RequestMapping("/hi")
    public String sayHi() {
        return "Hi Sankalp :) ";
    }
}
