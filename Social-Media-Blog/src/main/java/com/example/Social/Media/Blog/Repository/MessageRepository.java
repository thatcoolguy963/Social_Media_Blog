package com.example.Social.Media.Blog.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.Social.Media.Blog.Model.AccountModel;
import com.example.Social.Media.Blog.Model.MessageModel;
import java.util.List;


@Repository
public interface MessageRepository extends JpaRepository<MessageModel, Integer> {
    
    MessageModel findByMessageId(int messageId); 

    List<MessageModel> findByPostedBy(AccountModel postedBy);
}
