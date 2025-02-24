package demoapp.controller;

import demoapp.service.PalindromeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/palindrome")
public class PalindromeController {

    @Autowired
    private PalindromeService palindromeService;

    @GetMapping
    public String palindromeForm() {
        return "palindrome";
    }

    @PostMapping
    public String palindromeCheck(@RequestParam String word, Model model) {
        model.addAttribute("word", word);
        model.addAttribute("result", palindromeService.isPalindrome(word));
        return "palindrome";
    }
}