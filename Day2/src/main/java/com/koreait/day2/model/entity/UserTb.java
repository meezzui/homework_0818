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
        name = "seq_user_tb", // 내가 지어주고 싶은 이름
        sequenceName = "seq_user_tb", //오라클 시퀀스 이름
        initialValue = 1,
        allocationSize = 1
)
@Builder
public class UserTb {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_user_tb")
    private Long id;
    private String userid;
    private String userpw;
    private String hp;
    private String email;
    private LocalDateTime regDate;
    private LocalDateTime updateDate;
}
