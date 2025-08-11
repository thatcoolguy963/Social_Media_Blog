package com.example.Social.Media.Blog.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Social.Media.Blog.Model.AccountModel;
import com.example.Social.Media.Blog.Model.MessageModel;
import com.example.Social.Media.Blog.Repository.MessageRepository;

@Service
public class MessageService {
@Autowired
private MessageRepository messageRepository; 

   public MessageModel saveMessage(MessageModel message) {
      return messageRepository.save(message);
   }

   public List<MessageModel> getAllMessages() {
     return messageRepository.findAll();
   }

   public Optional<MessageModel> getMessageById(int id) {
        return messageRepository.findById(id);
   }

   public void deleteMessage(int id) {
     messageRepository.deleteById(id);
   }

   public List<MessageModel> getMessagesByUser(AccountModel user) {
       return messageRepository.findByPostedBy(user);
   }
}
