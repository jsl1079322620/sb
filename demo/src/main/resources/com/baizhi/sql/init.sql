create schema demo
    DEFAULT CHARACTER SET UTF8MB4;

create table t_user
(
    id     int(6) primary key auto_increment,
    name   varchar(40),
    age    int(3),
    salary double(7, 2)
);
