package com.eshoppingmall.controller;

import com.eshoppingmall.model.Product;
import com.eshoppingmall.service.ManagerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ManagerController {
    
    @Autowired
    private ManagerService managerService;

    @GetMapping("/admin/products")
    public String manageProducts(Model model) {
        model.addAttribute("products", managerService.findAllProducts());
        return "manageProducts";
    }

    @PostMapping("/admin/products/add")
    public String addProduct(Product product) {
        managerService.saveProduct(product);
        return "redirect:/admin/products";
    }
}
