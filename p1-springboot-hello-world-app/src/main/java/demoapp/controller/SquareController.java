package demoapp.controller;

import demoapp.service.SquareService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/square")
public class SquareController {

    @Autowired
    private SquareService squareService;

    @GetMapping
    public String squareForm() {
        return "square";
    }

    @PostMapping
    public String squareCheck(@RequestParam int base, @RequestParam int square, Model model) {
        model.addAttribute("base", base);
        model.addAttribute("square", square);
        model.addAttribute("result", squareService.isSquare(base, square));
        return "square";
    }
}
