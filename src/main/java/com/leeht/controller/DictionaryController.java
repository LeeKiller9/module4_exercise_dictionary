package com.leeht.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.HashMap;

@Controller
public class DictionaryController {
    private static HashMap<String, String> vocabulary = new HashMap<>();

    static {
        vocabulary.put("banana", "Qua Chuoi");
        vocabulary.put("book", "Cuon Sach");
        vocabulary.put("phone", "Dien thoai");
        vocabulary.put("house", "Can nha");
    }

    @GetMapping({"/", "/home"})
    public String home() {
        return "index";
    }

    @GetMapping("/search")
    public String search(@RequestParam String search, Model model) {
        String result = vocabulary.get(search);
        if (result != null) {
            model.addAttribute("mean", result);
        } else {
            model.addAttribute("mean", "Not Found");
        }
        model.addAttribute("word", search);
        return "index";
    }
}
