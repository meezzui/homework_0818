create table admin_user(
    id number(7) not null,
    userid varchar2(20) not null,
    userpw varchar2(20) not null,
    name varchar2(20) not null,
    status varchar2(10) not null,
    last_login_at date,
    reg_date date default sysdate
);

create sequence seq_user
    increment by 1
    start with 1;

select * from admin_user;


create table user_tb(
    id number(7) not null,
    userid varchar2(20) not null,
    userpw varchar2(20) not null,
    hp varchar2(20) not null,
    email varchar2(20) not null,
    update_date date,
    reg_date date default sysdate
);

create sequence seq_user_tb
    increment by 1
    start with 1;

select * from user_tb;




