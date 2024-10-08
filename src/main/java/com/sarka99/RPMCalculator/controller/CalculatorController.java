package com.sarka99.RPMCalculator.controller;

import com.sarka99.RPMCalculator.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
    @Autowired
    private CalculatorService calculatorService;
    @PostMapping("/evaluate")
    public int EvaluateExpression(@RequestBody String[] rpnExpression){
        StringBuilder sb = new StringBuilder();
        for(String s : rpnExpression){
            sb.append(s);
        }
        System.out.println("rpn expression from the frontend: " + sb.toString());
        System.out.println("Evaluating expression from backend called");
        System.out.println("result of evaluation is:" + calculatorService.EvaluateRPN(rpnExpression));
        return calculatorService.EvaluateRPN(rpnExpression);
    }
}
