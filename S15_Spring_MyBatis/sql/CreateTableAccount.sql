-- auto-generated definition
create table tbl_account
(
    id    int auto_increment
        primary key,
    name  varchar(30)     not null,
    money double(100, 30) not null
);
