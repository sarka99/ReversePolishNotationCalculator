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

        return calculatorService.EvaluateRPN(rpnExpression);
    }
}
