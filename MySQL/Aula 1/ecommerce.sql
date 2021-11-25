create database ecommerce;

use ecommerce;

create table tb_produtos(
	id bigint(5) auto_increment,
    nome varchar(20) not null,
    preco decimal(5,2),
    marca varchar(20) not null,
    estoque boolean,
    primary key (id)
    );
    
insert into tb_produtos (nome, preco, marca, estoque) values ("Relogio", 750.00, "Vivara", 1);
insert into tb_produtos (nome, preco, marca, estoque) values ("Oculos", 250.00, "Chilli Beans", 1);
insert into tb_produtos (nome, preco, marca, estoque) values ("Corrente", 200.00, "Vivara", 0);
insert into tb_produtos (nome, preco, marca, estoque) values ("Tenis", 300.00, "Nike", 1);
insert into tb_produtos (nome, preco, marca, estoque) values ("Blusa", 250.00, "Adidas", 1);
insert into tb_produtos (nome, preco, marca, estoque) values ("Mochila", 140.00, "Nike", 0);
insert into tb_produtos (nome, preco, marca, estoque) values ("Bota", 130.00, "Netshoes", 1);
insert into tb_produtos (nome, preco, marca, estoque) values ("Colar", 770.00, "Vivara", 1);

select * from tb_produtos where preco > 500;

select * from tb_produtos where preco < 500;

update tb_produtos set marca = "Puma"
    where id = 6;
    