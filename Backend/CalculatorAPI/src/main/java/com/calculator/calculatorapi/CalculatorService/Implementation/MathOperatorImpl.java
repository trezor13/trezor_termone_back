package com.calculator.calculatorapi.CalculatorService.Implementation;

import com.calculator.calculatorapi.CalculatorService.MathOperator;
import com.calculator.calculatorapi.Exceptions.InvalidOperationException;
import org.springframework.stereotype.Service;

@Service
public class MathOperatorImpl implements MathOperator {
    @Override
    public double doMath(double operand1, double operand2, String operation) throws InvalidOperationException {
        if("/".equals(operation) && operand2== (double)0 ){
            throw new InvalidOperationException("Impossible to divide numebr by 0");
        }
        switch (operation) {
            case "+":
                return operand1 + operand2;
            case "-":
                return operand1 - operand2;
            case "*":
                return operand1 * operand2;
            case "/":
                return operand1 / operand2;
            default:
                throw new RuntimeException("this operation is invalid");
        }
    }
}

