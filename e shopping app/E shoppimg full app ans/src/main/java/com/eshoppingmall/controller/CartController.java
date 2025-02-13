package com.eshoppingmall.controller;

import com.eshoppingmall.model.Cart;
import com.eshoppingmall.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartController {
    
    @Autowired
    private CartService cartService;

    @GetMapping("/cart")
    public String viewCart(Model model) {
        Cart cart = cartService.getCurrentCart();
        model.addAttribute("cartItems", cart.getItems());
        model.addAttribute("total", cart.getTotal());
        return "cart";
    }

    @PostMapping("/cart")
    public String addToCart(Long pid) {
        cartService.addProductToCart(pid);
        return "redirect:/cart";
    }

    @PostMapping("/checkout")
    public String checkout() {
        cartService.checkout();
        return "redirect:/orderConfirmation";
    }
}
