package com.koreait.day2.repository;

import com.koreait.day2.model.entity.AdminUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUserRepository extends JpaRepository<AdminUser,Long> {
    //JPA를 사용하려면 repository를 생성해 줘야 함. 그래서 이게 그거 해준거
    //paRepository<엔티티명, 대표타입>
    
}
