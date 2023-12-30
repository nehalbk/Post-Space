-- creating database
create database post_space;

use post_space;

create table users(
usersid int primary key,
username varchar(25) not null,
password varchar(25) not null
);

select *from users;

alter table users modify column usersid  int auto_increment;

create table posts(
	postid int primary key auto_increment,
    postcont varchar(255) not null,
    postuserid int,
    foreign key (postuserid) references users(usersid)
);

select *from posts;

create table likes(
likeid int primary key auto_increment,
likeuserid int,
likepostid int,
foreign key (likeuserid) references users(usersid),
foreign key (likepostid) references posts(postid)
);

create table comments(
commentid int primary key auto_increment,
commentuserid int,
commentpostid int,
commentcont varchar(255) not null,
foreign key (commentuserid) references users(usersid),
foreign key (commentpostid) references posts(postid)
);

select *from comments;