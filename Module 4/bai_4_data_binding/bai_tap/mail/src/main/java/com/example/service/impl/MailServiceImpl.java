package com.example.service.impl;

import com.example.model.Mail;
import com.example.service.MailService;
import org.springframework.stereotype.Service;

@Service
public class MailServiceImpl implements MailService {
   private  Mail mail;
   public Mail getMail(){
       mail = new Mail("English",5,true,"King, asgard");
       return mail;
   }
}
