package com.example.Social.Media.Blog.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class MessageModel {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int messageId;
    private String messageText;
    @ManyToOne 
    @JoinColumn(name = "posted_by")
    private AccountModel postedBy;

       //Empty Constructor
    public MessageModel() {

    }
       //Constructor
    public MessageModel(int messageId, String messageText, AccountModel postedBy){
          this.messageId = messageId;
          this.messageText = messageText;
          this.postedBy = postedBy;
    }

      //Getter Methods

      public int getMessageId() {
        return this.messageId;
      }

      public String getMessageText() {
        return this.messageText;
      }

      public AccountModel getPostedBy() {
        return this.postedBy;
      } 

         //Setter Methods
    
    public void setMessageId(int messageId) {
           this.messageId = messageId;
    }

    public void setMessageText(String messageText) {
            this.messageText = messageText;
    }

    public void setPostedBy(AccountModel postedBy) {
            this.postedBy = postedBy;
    }
    
}
