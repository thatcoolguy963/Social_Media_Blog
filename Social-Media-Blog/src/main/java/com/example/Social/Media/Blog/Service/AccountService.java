package com.example.Social.Media.Blog.Service;




import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Social.Media.Blog.Model.AccountModel;
import com.example.Social.Media.Blog.Repository.AccountRepository;



@Service
public class AccountService {
 @Autowired
private AccountRepository accountRepository;

        
    public AccountModel saveAccount(AccountModel account) {
         return accountRepository.save(account);
    }

    public AccountModel getAccountByUsername(String username) {
        return accountRepository.findByUsername(username);
    }

    public String getPasswordByUsername(String username) {
        AccountModel account = accountRepository.findByUsername(username);
        return account != null ? account.getPassword() : null;
    }

    public Optional<AccountModel> getAccountById(int id) {
         return accountRepository.findById(id);
    }

    public void deleteAccountById(int id) {
         accountRepository.deleteById(id);
    }

}
