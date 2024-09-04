package com.sarka99.RPMCalculator.service;

import com.sarka99.RPMCalculator.model.Stack;
import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    Stack<Integer> stack = new Stack<>();

    public int EvaluateRPN(String[] rpnExpression) {
        stack.clear();  // Ensure stack is empty before evaluation
        for (String token : rpnExpression) {
            try {
                switch (token) {
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
                        if (divisor == 0) {
                            throw new ArithmeticException("Division by zero");
                        }
                        stack.push(stack.pop() / divisor);
                        break;
                    default:
                        stack.push(Integer.parseInt(token));
                }
            } catch (Exception e) {
                throw new IllegalArgumentException("Invalid RPN expression");
            }
        }

        return stack.pop();
    }
}
