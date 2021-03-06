package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.Map;
import java.util.TreeMap;

@Controller
@SessionAttributes("cart")
public class ProductController {

    @Autowired
    ProductService productService;

    @GetMapping({"","/product"})
    public String productList(Model model){
        model.addAttribute("products",productService.findAll());
        return "list";
    }
    @GetMapping("/product/{id}/view")
    public String viewProduct(@PathVariable Integer id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }

    @GetMapping("/product/{id}/add")
    public String addToCart(@ModelAttribute("cart") Map<Product,Integer> cart,Model model,@PathVariable Integer id){
        Product product = productService.findById(id);
        if(cart.get(product) == null){
            cart.put(product,1);
        }else {
            cart.replace(product,cart.get(product),cart.get(product)+1);
        }
        return "redirect:/";
    }
    @GetMapping("product/cart/{id}/delete")
    public String deleteProduct(@PathVariable Integer id,@ModelAttribute("cart") Map<Product,Integer> cart,Model model){
        cart.remove(productService.findById(id));
        model.addAttribute("cart",cart);
        return "redirect:/";
    }
    @GetMapping("/product/cart")
    public String productInCart(Model model,@ModelAttribute("cart") Map<Product,Integer> cart){
        model.addAttribute("cart",cart);
        model.addAttribute("totalPrice",productService.calculateTotalPrice(cart));
        return "product_cart";
    }
    @GetMapping("/product/cart/delete")
    public String deleteAll(@ModelAttribute("cart") Map<Product,Integer> cart){
        cart.clear();
        return "redirect:/";
    }
    @GetMapping("/bought")
    public String buyProduct(@ModelAttribute("cart") Map<Product,Integer> cart,Model model){
        model.addAttribute("cart",cart);
        return "bought";
    }
    @ModelAttribute("cart")
    public Map<Product,Integer> cart(){
        return new TreeMap<>();
    }

}
