create database db_farmacia_do_bem;

use db_farmacia_do_bem;

create table tb_categoria(
    id bigint auto_increment,
    departamento varchar (10) not null,
    categoria varchar (10) not null,
    marca varchar (10) not null,
    primary key (id)
    );

insert into tb_categoria (departamento, categoria, marca) values ("Remedio","Nauseas","Generico" );
insert into tb_categoria (departamento, categoria, marca) values ("Higiene", "Escova", "colgate");
insert into tb_categoria (departamento, categoria, marca) values ("Bebê", "Acessorio", "Neopan");
insert into tb_categoria (departamento, categoria, marca) values ("Remedio", "Antigases", "Cimed");
insert into tb_categoria (departamento, categoria, marca) values ("Higiene", "Shampoo", "Clear");

create table tb_produto(
	id bigint auto_increment primary key,
    nome varchar (20) not null,
    preco decimal (4,2) not null,
    promocao boolean,
    quantidade bigint (10) not null,
    cat_id bigint not null,
    foreign key (cat_id) references tb_categoria(id)
);

insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Bromoprida", 16.23, true, 20, 1);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Slim soft black", 30.00, false, 3, 2);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Chupeta", 02.45, true, 1, 3);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Simeticona", 10.16, false, 1, 4);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Shampoo Anticaspa", 16.23, false, 1, 5);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Whitening", 18.63, false, 2, 2);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Scalpfoods Detox", 21.37, true, 1, 5);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Cinarizina", 15.07, false, 1, 1);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco > 3.00 and 60.00;

select * from tb_produto where nome like "%B%";

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.cat_id;

select tb_categoria.departamento, tb_produto.nome from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.cat_id