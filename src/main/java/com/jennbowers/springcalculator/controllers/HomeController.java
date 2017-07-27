package com.jennbowers.springcalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "firstOperand", required = false) Double firstOperand,
                        @RequestParam(value = "operatorSelect", required = false) String operatorSelect,
                        @RequestParam(value = "secondOperand", required = false) Double secondOperand,
                        ModelMap model){
        try {
            System.out.println(firstOperand);
            System.out.println(operatorSelect);
            System.out.println(secondOperand);

            double result = calculator(firstOperand, operatorSelect, secondOperand);

            model.addAttribute("fullEquation", firstOperand + " " + operatorSelect + " " + secondOperand);
            model.addAttribute("result", result);
        } catch (NullPointerException e) {
            System.out.println("Please enter a valid number");
        }
        return "index";
    }

    public double calculator(Double firstOperand, String operator, Double secondOperand) {
        double result= 0;
            switch(operator) {
                case "+":
                    result = firstOperand + secondOperand;
                    System.out.println(firstOperand + operator + secondOperand);
                    System.out.println(result);
                    break;
                case "-":
                    result = firstOperand - secondOperand;
                    System.out.println(firstOperand + operator + secondOperand);
                    System.out.println(result);
                    break;
                case "*":
                    result = firstOperand * secondOperand;
                    System.out.println(firstOperand + operator + secondOperand);
                    System.out.println(result);
                    break;
                case "/":
                    result = firstOperand / secondOperand;
                    System.out.println(firstOperand + operator + secondOperand);
                    System.out.println(result);
                    break;
                default:
                    break;
            }
        return result;
    }
}

