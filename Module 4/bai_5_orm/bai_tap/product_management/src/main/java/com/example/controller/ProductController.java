package com.example.controller;

import com.example.model.Product;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    ProductService productService;
    @GetMapping({"","/list"})
    public String goProductList(Model model){
        model.addAttribute("productList",productService.findAll());
        return "product_list";
    }
    @GetMapping("/create")
    public String createForm(Model model){
        model.addAttribute("product",new Product());
        return "create";
    }
    @PostMapping("/save")
    public String save(Product product, RedirectAttributes redirectAttributes){
        productService.save(product);
        redirectAttributes.addFlashAttribute("message","created");
        return "redirect:/product";
    }
    @GetMapping("/{id}/view")
    public String view(@PathVariable Integer id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "view";
    }
    @GetMapping("/{id}/delete")
    public String deleteForm(@PathVariable Integer id,Model model){
        model.addAttribute("product",productService.findById(id));
        return "delete";
    }
    @PostMapping("/delete")
    public String delete(Product product,RedirectAttributes redirectAttributes){
        productService.delete(product.getId());
        redirectAttributes.addFlashAttribute("message","Deleted");
        return "redirect:/product";
    }
    @GetMapping("/{id}/edit")
    public String updateForm(Model model,@PathVariable Integer id){
        model.addAttribute("product",productService.findById(id));
        return "edit";
    }
    @PostMapping("/edit")
    public String update(Model model,Product product){
        productService.save(product);
        model.addAttribute("message","updated");
        return "redirect:/product";
    }


}
