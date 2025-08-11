package com.example.Social.Media.Blog.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class AccountModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int accountId;
    private String username;
    private String password;

     //Empty Constructor
    public AccountModel() {
        
    }
      //Constructor
    public AccountModel(int accountId, String username, String password) {
            this.accountId = accountId;
            this.username = username;
            this.password = password;
    }
    
      //Getter Methods
    public int getAccountId() {
        return this.accountId;
    }
    public String getUsername(){
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    
    //Setter Methods

    public void setAccountId(int accountId){
           this.accountId = accountId;
    }

    public void setUsername(String username) {
            this.username = username;
    }

    public void setPassword(String password) {
             this.password = password;
    }
   

    
}
