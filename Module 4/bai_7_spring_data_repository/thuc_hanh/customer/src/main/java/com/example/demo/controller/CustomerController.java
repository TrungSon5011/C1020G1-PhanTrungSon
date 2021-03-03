package com.example.demo.controller;

import com.example.demo.model.Customer;
import com.example.demo.service.CustomerService;
import com.example.demo.service.ProvinceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @Autowired
  ProvinceService provinceService;
  @GetMapping("")
  public String listCustomer(@PageableDefault(size = 1) Pageable pageable, Model model){
      model.addAttribute("customers",customerService.findAll(pageable));
      return "list";
  }
  @GetMapping("/customer/create")
    public String createForm(Model model){
      model.addAttribute("customer",new Customer());
      model.addAttribute("provinces",provinceService.findAll());
      return "create";
  }
  @PostMapping("/customer/save")
    public String create(Customer customer){
      customerService.save(customer);
      return "redirect:/";
  }
  @GetMapping("/customer/{id}/edit")
    public String editForm(Model model, @PathVariable Integer id){
      model.addAttribute("customer",customerService.findById(id));
    model.addAttribute("provinces",provinceService.findAll());
      return "edit";
  }
  @PostMapping("/customer/edit")
    public String edit(Customer customer){
      customerService.save(customer);
      return "redirect:/";
  }
  @GetMapping("/customer/{id}/delete")
    public String deleteForm(@PathVariable Integer id,Model model){
      model.addAttribute("customer",customerService.findById(id));
      return "delete";
  }
  @PostMapping("/customer/delete")
    public String delete(Customer customer){
      customerService.remove(customer);
      return "redirect:/";
  }
  @GetMapping("/customer/{id}/view")
    public String view(@PathVariable Integer id,Model model){
      model.addAttribute("customer",customerService.findById(id));
      return "view";
  }
  @GetMapping("/customer/search")
  public String search(@RequestParam String name,Model model){
    model.addAttribute("customers",customerService.findByNameContaining(name));
    return "search";
  }

}
