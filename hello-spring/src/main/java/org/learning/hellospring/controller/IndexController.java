package org.learning.hellospring.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Random;

@Controller
@RequestMapping("/")
public class IndexController {
    @GetMapping
    public String index(@RequestParam String name, Model model){
        Random random=new Random();
        int value=random.nextInt();
        model.addAttribute("randomValue",value);
        model.addAttribute("userName", name);
        return "home";
    }
}
