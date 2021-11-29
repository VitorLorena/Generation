create database db_construindo_a_nossa_vida;

use db_construindo_a_nossa_vida;

create table tb_categoria(
    id bigint auto_increment,
    comodo varchar (10) not null,
    tipo varchar (10) not null,
    marca varchar (10) not null,
    primary key (id)
    );

insert into tb_categoria (comodo, tipo, marca) values ("Banheiro","Torneira","Monocomando" );
insert into tb_categoria (comodo, tipo, marca) values ("Sala", "Tomada", "Dicompel");
insert into tb_categoria (comodo, tipo, marca) values ("Quarto", "Lampada", "Tualux");
insert into tb_categoria (comodo, tipo, marca) values ("Cozinha", "Piso", "Elcatex");
insert into tb_categoria (comodo, tipo, marca) values ("Quintal", "Mangueira", "Vonder");

create table tb_produto(
	id bigint auto_increment primary key,
    nome varchar (20) not null,
    preco decimal (4,2) not null,
    promocao boolean,
    quantidade bigint (10) not null,
    cat_id bigint not null,
    foreign key (cat_id) references tb_categoria(id)
);

insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Porcelanato", 16.23, true, 20, 1);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Ceramica", 30.00, false, 3, 2);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("incandescente", 02.45, true, 1, 3);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("fluoerecentes", 10.16, false, 1, 4);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("misturador", 16.23, false, 1, 5);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("Metal", 18.63, false, 2, 2);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("vinilico", 21.37, true, 1, 5);
insert into tb_produto (nome, preco, promocao, quantidade, cat_id) values ("tacos", 15.07, false, 1, 1);

select * from tb_produto where preco > 50.00;

select * from tb_produto where preco > 3.00 and 60.00;

select * from tb_produto where nome like "%C%";

select * from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.cat_id;

select tb_categoria.comodo, tb_produto.nome from tb_produto
inner join tb_categoria on tb_categoria.id = tb_produto.cat_id