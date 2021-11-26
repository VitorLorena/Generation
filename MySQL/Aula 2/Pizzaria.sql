create database db_pizzaria_legal;

use db_pizzaria_legal;

create table tb_categoria(
	id_cat bigint auto_increment primary key,
    categoria varchar(20) not null,
    tamanho varchar(20) not null,
    borda varchar(20)
);

insert into tb_categoria (categoria, tamanho, borda) values ("Salgada", "Grande", "Catupiry");
insert into tb_categoria (categoria, tamanho, borda) values ("Doce", "Pequena", "Sem Borda");
insert into tb_categoria (categoria, tamanho, borda) values ("Salgada", "Pequena", "Catupiry");
insert into tb_categoria (categoria, tamanho, borda) values ("Doce", "Grande", "Chocolate");
insert into tb_categoria (categoria, tamanho, borda) values ("Salgada", "Grande", "Sem Borda");

create table tb_pizza(
	id bigint auto_increment primary key,
    sabor varchar(20) not null,
    valor varchar(20) not null,
    vegetariana boolean,
    refrigerante varchar(15),
    cat_id bigint not null,
    
    foreign key (cat_id) references tb_categoria (id_cat)
);

insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Bauru", 60.00, false, "Coca-Cola", 1);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Calabresa", 70.00, false, "Guarana", 3);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Mussarela", 35.00, false, "Pepsi", 5);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Napolitana", 50.00, false, "Coca-Cola", 1);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Chocolate", 30.00, false, "Coca-Cola", 2);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Portuguesa", 55.00, false, "Dolly", 3);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Ovomaltine", 50.00, false, "Itubaina", 4);
insert into tb_pizza (sabor, valor, vegetariana, refrigerante, cat_id) values ("Veggie", 80.00, true, "Pepsi", 5);


alter table tb_pizza modify valor decimal(8,2);

select * from tb_pizza where valor > 45.00;

select * from tb_pizza where valor > 29.00 and valor < 60.00;

select * from tb_pizza
	inner join tb_categoria on tb_categoria.id_cat = tb_pizza.cat_id;
    
select tb_categoria.categoria, tb_pizza.sabor from tb_pizza
inner join tb_categoria on tb_categoria.id_cat = tb_pizza.cat_id
where tb_categoria.categoria like "%Sal%"