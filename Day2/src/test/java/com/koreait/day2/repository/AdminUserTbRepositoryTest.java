package com.koreait.day2.repository;

import com.koreait.day2.Day2ApplicationTests;
import com.koreait.day2.model.entity.AdminUser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.LocalDateTime;

//junit를 사용할 수 있는 클래스를 하나 상속받아서  만듦
public class AdminUserTbRepositoryTest extends Day2ApplicationTests {
    
    @Autowired // 아까 만들어준 AdminUserRepository를 전역변수로 가져다가 쓸 수 있음
    private AdminUserRepository adminUserRepository;

    //테스트를 할려면 @Test를 해줘야 함
    @Test //단위 테스트 실행
    public void create(){
        AdminUser adminUser =  AdminUser.builder()
                .userid("admin") //괄호열면 바로 set이 됨
                .userpw("1234")
                .name("관리자")
                .status("use")
                .regDate(LocalDateTime.now())
                .build(); //마지막에 빌드를 하게되면 해당(위에 set해준) 데이터를 저장해 줌
        AdminUser newAdminUser = adminUserRepository.save(adminUser); //adminUser가 데이터를 가지고 있음
        //dminUserRepository.save(adminUser) : 레퍼지토리 안에 저장하면 그게 DTO에 저장되고 그게 테이블로 저장됨
        //dminUserRepository : JAP사용했기 떄문에 테이블에 담김

    }

}
