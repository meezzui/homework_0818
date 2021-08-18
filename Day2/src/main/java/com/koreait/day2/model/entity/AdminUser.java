package com.koreait.day2.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

//내부적으로 get/set이 만들어짐
@Data
//저장시키는 생성자도 자동으로 만들어줌
@AllArgsConstructor
//빈 생성자를 자동으로 만들어줌
@NoArgsConstructor

@Entity //만들어 놓은 테이블과 연결시켜줌
@SequenceGenerator(
        name = "seq_user", // 내가 지어주고 싶은 이름
        sequenceName = "seq_user", //오라클 시퀀스 이름
        initialValue = 1,
        allocationSize = 1
)
@Builder
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user")//바로 아래 id에게 부여해 줌.
    //generator = "seq_user" 여기사 seq_user는 내가 지어준 이름을 넣어주는거야
    private long id; //일렬번호
    private String userid; // 아이디
    private String userpw; // 비밀번호
    private String name; // 이름
    private String status; // 계정을 사용하고 있는지 상태
    private LocalDateTime lastLoginAt; // 마지막에 접속한 시간을 저장
    private LocalDateTime regDate; // 가입날짜
}
