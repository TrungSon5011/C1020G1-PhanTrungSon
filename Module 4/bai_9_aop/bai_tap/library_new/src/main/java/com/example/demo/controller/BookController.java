package com.example.demo.controller;

import com.example.demo.aop.WriteLog;
import com.example.demo.model.Book;
import com.example.demo.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class BookController {
    @Autowired
    BookService bookService;

    @GetMapping("")
    public String list(Model model){
        model.addAttribute("books",bookService.findAll());
        return "list";
    }
    @GetMapping("/book/{id}/borrow")
    public String borrow(@PathVariable Integer id,Model model){
        Book book = bookService.findById(id);
        book.setQuantity(book.getQuantity() -1);
        if(book.getQuantity() < 0){
            model.addAttribute("message","Sorry, this book has ran out !!");
            return "error";
        }
        WriteLog.bookName = book.getName();
        bookService.save(book);
        return "redirect:/";
    }

    @GetMapping("/book/give_back")
    public String giveBack(@RequestParam Integer id,Model model){
        Book book = bookService.findById(id);
        if(book == null){
            model.addAttribute("message","We haven't that id yet");
            return "error";
        }
        book.setQuantity(book.getQuantity()+1);
        bookService.save(book);
        WriteLog.bookName = book.getName();
        return "redirect:/";
    }
}
