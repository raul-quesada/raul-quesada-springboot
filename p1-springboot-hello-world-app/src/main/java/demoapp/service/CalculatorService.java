package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorService {
    public double calculate(double num1, double num2, String operation) {
        if ("add".equals(operation)) {
            return num1 + num2;
        } else if ("subtract".equals(operation)) {
            return num1 - num2;
        } else if ("multiply".equals(operation)) {
            return num1 * num2;
        } else if ("divide".equals(operation)) {
            return (num2 != 0) ? num1 / num2 : Double.NaN;
        } else {
            throw new IllegalArgumentException("Operación no válida: " + operation);
        }
    }
}
