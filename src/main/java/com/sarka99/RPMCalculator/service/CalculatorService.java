package com.sarka99.RPMCalculator.service;

import com.sarka99.RPMCalculator.model.Stack;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    Stack<Integer> stack = new Stack<>();
    public int EvaluateRPN(String [] rpnExpression){
        //Going through each token, and pushing/popping to the stack depending on the current token
        for(String token : rpnExpression){
            switch (token){
                case "+":
                stack.push(stack.pop() + stack.pop());
                break;
                case "-":
                    int subtractor = stack.pop();
                    stack.push(stack.pop() - subtractor);
                    break;
                case "*":
                    stack.push(stack.pop() * stack.pop());
                    break;
                case "/":
                    int divisor = stack.pop();
                    stack.push(stack.pop() / divisor);
                    break;
                default:
                    //If an operand is the current token, it's simply added to the stack
                    stack.push(Integer.parseInt(token));
            }
        }
        //Returns the final answer, which is the final value in the stack
        return stack.pop();
    }
}
