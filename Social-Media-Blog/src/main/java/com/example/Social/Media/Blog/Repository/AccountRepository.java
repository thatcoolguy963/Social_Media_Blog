package com.example.Social.Media.Blog.Repository;

import com.example.Social.Media.Blog.Model.AccountModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountModel, Integer> {

    AccountModel findByUsername(String username);

}

    
    

