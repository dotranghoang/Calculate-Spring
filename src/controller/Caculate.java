package controller;

public class Caculate {
    public static double calculate(double firstOperand, double secondOperand, String operator) {
        switch (operator) {
            case "Addition (+)":
                return firstOperand + secondOperand;
            case "Subtraction (-)":
                return firstOperand - secondOperand;
            case "Multiple (X)":
                return firstOperand * secondOperand;
            case "Division (/)":
                return firstOperand / secondOperand;
            default:
                throw new RuntimeException("Invalid operation");
        }
    }
}
