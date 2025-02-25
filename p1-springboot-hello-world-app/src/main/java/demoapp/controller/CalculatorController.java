package demoapp.controller;

import demoapp.service.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/calculator")
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping
    public String calculatorForm() {
        return "calculator";
    }

    @PostMapping
    public String calculate(@RequestParam double num1, @RequestParam double num2,
                            @RequestParam String operation, Model model) {
        model.addAttribute("num1", num1);
        model.addAttribute("num2", num2);
        model.addAttribute("operation", operation);
        model.addAttribute("result", calculatorService.calculate(num1, num2, operation));
        return "calculator";
    }
}