-- User schema

-- !Ups
create table users(
    id int not null auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    primary key(id)
);

insert into users (username, password) values ('akiyuki kamiura', 'thepassword');
insert into users (username, password) values ('aipu ukai', 'thepassword2');

-- !Downs
drop table users;