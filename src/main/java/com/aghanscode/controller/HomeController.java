package com.aghanscode.controller;

import com.aghanscode.entity.Product;
import com.aghanscode.service.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class HomeController {

    @Autowired
    private ProductService productService;
    
    @GetMapping
    public String welcome(Model model){
        //doing something
        String message = "Welcome to Spring MVC with AghansCode";
        model.addAttribute("msg", message);
        model.addAttribute("products", productService.findAll());
        return "index";
    }

    @GetMapping("/add")
    public String add(Model model){
        model.addAttribute("product", new Product());
        return "add";
    }

    @PostMapping("/save")
    public String save(Product product, Model model){
        productService.addProduct(product);
        return "redirect:/";
    }
}