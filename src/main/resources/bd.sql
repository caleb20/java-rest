create database ventas;

create table department (
	id_dep int auto_increment primary key,
    name_dep varchar(30) not null
);


insert into department(name_dep) values ('Java'),('QA'),('AS400'),('Front-end'),('C#'),('Mobile'),('Administrativa');


