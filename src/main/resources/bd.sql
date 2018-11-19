create database ventas;

create table department (
	id_dep int auto_increment primary key,
    name_dep varchar(30) not null
);


insert into department(name_dep) values ('Java'),('QA'),('AS400'),('Front-end'),('C#'),('Mobile'),('Administrativa');

create table customer(
	id_cus int auto_increment primary key, 
    name_cus varchar(50), 
    last_name_cus varchar(50),
    id_dep int references department(id_dep)
);

insert into customer(name_cus, last_name_cus, id_dep) values ('Renato','Salcedo', 1), ('Cesar','Cochachin', 1);
insert into customer(name_cus, last_name_cus, id_dep) values ('Nelson','', 2);