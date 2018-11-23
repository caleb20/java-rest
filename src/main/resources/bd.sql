create database ventas;

use ventas;

create table department (
	id_dep int auto_increment primary key,
    name_dep varchar(30) not null
);

insert into department(name_dep) values ('Java'),('QA'),('AS400'),('Front-end'),('C#'),('Mobile'),('Administrativa');

create table customer(
	id_cus int auto_increment primary key,
    name_cus varchar(100),
    last_name_cus varchar(100),
    id_dep int,
    foreign key (id_dep) references department(id_dep)
);

insert into customer(name_cus, last_name_cus, id_dep) values ('César Augusto','Cochachin Garcia',1), ('Renato Saul','Salcedo Saldaña',1), ('Nelson','',3);

create table category(
id_cat int auto_increment primary key,
name_cat varchar (100),
description_cat varchar(500)
);

insert into category(name_cat, description_cat) values ('Postres','Diversos postres para acompañar el almuerzo'), ('Pasteles','Para disfrutar con un café');

create table product(
id_pro int auto_increment primary key,
description_pro varchar(100),
price_pro double,
stock_pro int,
id_cat int,
foreign key (id_cat) references category(id_cat)
);

insert into product(description_pro, price_pro, stock_pro, id_cat) values ('Mazamorra', 1.0, 999, 1),('Arroz con leche', 1.0, 999, 1),('Combinado', 1.0, 999, 1),('Torta de chocolate', 1.5, 999, 2);

create table invoice(
id_inv int auto_increment primary key,
id_cus int,
date_inv datetime,
total_products_inv int,
total_pay_inv double,
pre_pay_inv double,
status_products_inv boolean,
foreign key (id_cus) references customer(id_cus)
);

insert into invoice(id_cus, date_inv, total_products_inv, total_pay_inv, pre_pay_inv, status_products_inv) values(1, '2018-11-16', 2, 2.0, 2.0, true),(2, '2018-11-16', 1, 1.0, 1.0, true),(3, '2018-11-16', 2, 2.0, 2.0, true);

create table detail_invoice(
id_det MEDIUMINT auto_increment,
id_inv int,
id_pro int,
quantity_det int,
price_inv double,
primary key(id_inv,id_det),
foreign key (id_inv) references invoice(id_inv),
foreign key (id_pro) references product(id_pro)
) ENGINE=MyISAM;

insert into detail_invoice(id_inv, id_pro, quantity_det, price_inv) values(1, 1, 1, 1.0), (1, 3, 1, 1.0),
(2, 3, 1, 1.0),(3, 3, 2, 2.0);

select i.id_inv, c.name_cus, i.date_inv from invoice i join customer c on c.id_cus = i.id_cus;

select c.name_cus, d.id_det, d.id_inv, p.description_pro, d.quantity_det, d.price_inv 
from detail_invoice d 
join product p on p.id_pro = d.id_pro 
join invoice i on i.id_inv = d.id_inv 
join customer c on c.id_cus = i.id_cus;
