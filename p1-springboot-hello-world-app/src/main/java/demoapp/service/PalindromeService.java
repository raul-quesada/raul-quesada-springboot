package demoapp.service;

import org.springframework.stereotype.Service;

@Service
public class PalindromeService {
    public boolean isPalindrome(String word) {
        if (word == null) return false;
        String clean = word.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(new StringBuilder(clean).reverse().toString());
    }
}