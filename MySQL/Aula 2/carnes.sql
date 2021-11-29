create database db_cidade_das_carnes;

use db_cidade_das_carnes;

create table tb_categoria(
	id_cat bigint auto_increment primary key,
    categoria varchar(20) not null,
    corte varchar(20) not null,
    PassarNaMaquina boolean 
);

insert into tb_categoria (categoria, corte, PassarNaMaquina) values ("Carne", "Picanha", false);
insert into tb_categoria (categoria, corte, PassarNaMaquina) values ("Carne", "Coxao Mole", true);
insert into tb_categoria (categoria, corte, PassarNaMaquina) values ("Carne", "Coxao Duro", true);
insert into tb_categoria (categoria, corte, PassarNaMaquina) values ("Frango", "Coxinha", false);
insert into tb_categoria (categoria, corte, PassarNaMaquina) values ("Frango", "Asinha", false);

create table tb_produto(
	id bigint auto_increment primary key,
    animal varchar(20) not null,
    valor varchar(20) not null,
    prato varchar(20),
    refrigerante varchar(15),
    cat_id bigint not null,
    
    foreign key (cat_id) references tb_categoria (id_cat)
);

insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Boi", 55.00, "bife", "Coca-Cola", 1);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Buffalo", 70.00, "Assado", "Guarana", 3);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Vaca", 35.00, "Churrasco", "Pepsi", 5);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Boi", 50.00, "Churrasco", "Coca-Cola", 1);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Cordeiro", 30.00, "cozido", "Coca-Cola", 2);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Boi", 55.00, "a parmegiana", "Dolly", 3);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("Porco", 50.00, "escondidinho", "Itubaina", 4);
insert into tb_produto (animal, valor, prato, refrigerante, cat_id) values ("vaca", 80.00, "frito", "Pepsi", 5);


select * from tb_produto where valor > 45.00;

select * from tb_produto where valor > 29.00 and valor < 60.00;

select * from tb_produto where animal like "%c%";

select * from tb_produto
	inner join tb_categoria on tb_categoria.id_cat = tb_produto.cat_id;
    
select tb_categoria.corte, tb_produto.animal from tb_produto
inner join tb_categoria on tb_categoria.id_cat = tb_produto.cat_id