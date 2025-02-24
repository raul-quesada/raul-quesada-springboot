package demoapp.controller;

import demoapp.service.EvenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/even")
public class EvenController {

    @Autowired
    private EvenService evenService;

    @GetMapping
    public String evenForm() {
        return "even";
    }

    @PostMapping
    public String evenCheck(@RequestParam int number, Model model) {
        model.addAttribute("number", number);
        model.addAttribute("result", evenService.isEven(number));
        return "even";
    }
}
