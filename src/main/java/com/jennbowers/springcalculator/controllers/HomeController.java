package com.jennbowers.springcalculator.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String index(@RequestParam(value = "firstOperand", required = false) double firstOperand,
                        @RequestParam(value = "operatorSelect", required = false) String operatorSelect,
                        @RequestParam(value = "secondOperand", required = false) double secondOperand){
        System.out.println(firstOperand);
        System.out.println(operatorSelect);
        System.out.println(secondOperand);

        calculator(firstOperand, operatorSelect, secondOperand);

        return "index";
    }

    public void calculator(double firstOperand, String operator, double secondOperand) {
        double result;
        switch(operator) {
            case "add":
                result = firstOperand + secondOperand;
                System.out.println(firstOperand + "+" + secondOperand);
                System.out.println(result);
                break;
            case "subtract":
                result = firstOperand - secondOperand;
                System.out.println(firstOperand + "-" + secondOperand);
                System.out.println(result);
                break;
            case "multiply":
                result = firstOperand * secondOperand;
                System.out.println(firstOperand + "*" + secondOperand);
                System.out.println(result);
                break;
            case "divide":
                result = firstOperand / secondOperand;
                System.out.println(firstOperand + "/" + secondOperand);
                System.out.println(result);
                break;
            default:
                break;
        }
    }
}
