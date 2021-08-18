package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;
import com.koreait.day2.model.entity.UserTb;
import org.springframework.beans.factory.annotation.Autowired;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

public class UserTbRepositoryTest extends Day2ApplicationTests {

    @Autowired
    private UserTbRepository userTbRepository;

    @Test
    public void create(){
        UserTb userTb = UserTb.builder()
                .userid("user")
                .userpw("1111")
                .hp("010-1111-1111")
                .email("apple@apple.com")
                .regDate(LocalDateTime.now())
                .updateDate(LocalDateTime.now())
                .build();
        UserTb newUserTb = userTbRepository.save(userTb);
    }
}
