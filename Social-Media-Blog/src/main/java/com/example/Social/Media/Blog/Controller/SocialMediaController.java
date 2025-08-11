package com.example.Social.Media.Blog.Controller;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Social.Media.Blog.Service.MessageService;
import com.example.Social.Media.Blog.Model.AccountModel;
import com.example.Social.Media.Blog.Model.MessageModel;
import com.example.Social.Media.Blog.Service.AccountService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;






@RestController
@RequestMapping("/api")
public class SocialMediaController {
    @Autowired
    private AccountService accountService;

    @Autowired
    private MessageService messageService;

    @PostMapping(value="/register", consumes="application/json", produces="application/json")
    public AccountModel registerAccount(@RequestBody AccountModel account) {
        return accountService.saveAccount(account);
    }
    
    @PostMapping(value="/message", consumes="application/json", produces="application/json")
    public MessageModel postMessage(@RequestBody MessageModel message) {
        return messageService.saveMessage(message);
    }

    @GetMapping("/messages")
    public List<MessageModel> getAllMessages() {
        return messageService.getAllMessages();
    }
    
    @GetMapping("/messages/{id}")
    public Optional<MessageModel> getMessageById(@PathVariable int id) {
        return messageService.getMessageById(id);
    }
    @DeleteMapping("/message/{id}")
    public ResponseEntity<String> deleteMessageById(@PathVariable int id){
          messageService.deleteMessage(id);
          return ResponseEntity.ok("Message Deleted Successfully");
          
    }
    
}
