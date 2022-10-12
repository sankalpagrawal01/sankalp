package com.sankalp.calculator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {

    /* @Autowired
     MyCalculator myCalculator;*/
    private MyCalculator myCalculator;
    public CalculatorController( MyCalculator myCalculator){
        this.myCalculator=myCalculator;
    }

    @GetMapping("/add")
    public double addition(@RequestParam(name="a", required = true) double a,@RequestParam(name="b", required = true) double b){
        return a+b;
    }
    @GetMapping("/sub")
    public double subtraction(@RequestParam(name="a", required = true) double a,@RequestParam(name="b", required = true) double b){
        return a-b;
    }
    @GetMapping("/mul")
    public double multiplication(@RequestParam(name="a", required = true) double a,@RequestParam(name="b", required = true) double b){
        return a*b;
    }
    @GetMapping("/div")
    public double division(@RequestParam(name="a", required = true) double a,@RequestParam(name="b", required = true) double b){
        return a/b;
    }

    @GetMapping("/addstring")
    public String addString(@RequestParam(name="a", required = true) String a,@RequestParam(name="b", required = true) String b){
        return myCalculator.addString(a,b);
    }
}
