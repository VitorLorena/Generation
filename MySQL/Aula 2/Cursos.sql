create database db_cursoDaMinhaVida;

use db_cursoDaMinhaVida;

create table tb_categoria(
	id_cat bigint auto_increment primary key,
    curso varchar(20) not null,
    nivel varchar(20) not null,
    promocao boolean 
);

insert into tb_categoria (curso, nivel, promocao) values ("Financas", "Avancado", true);
insert into tb_categoria (curso, nivel, promocao) values ("Linguas", "Moderado", true);
insert into tb_categoria (curso, nivel, promocao) values ("Empreendedorismo", "Avancado", true);
insert into tb_categoria (curso, nivel, promocao) values ("Pessoas", "Iniciante", false);
insert into tb_categoria (curso, nivel, promocao) values ("Inovacao", "Iniciante", false);

create table tb_produto(
	id bigint auto_increment primary key,
    nome varchar(20) not null,
    valor bigint not null,
    certificado Boolean,
    carga varchar(15),
    cat_id bigint not null,
    
    foreign key (cat_id) references tb_categoria (id_cat)
);

insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Gestão financeira", 00.00, true, "3H", 1);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Formação pedagógica", 70.00, true, "45 Dias", 3);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("InovaçãoPósPandemia", 10.00, true, "2H", 5);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Controle de gastos", 00.00, true, "15 Dias", 1);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Ingles", 60.00, true, "120h", 2);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Hora da virada", 55.00, true, "30 Dias", 3);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Gestão de pessoas", 40.00, true, "8H", 4);
insert into tb_produto (nome, valor, certificado, carga, cat_id) values ("Criatividade", 15.00, true, "3H", 5);


select * from tb_produto where valor > 50.00;

select * from tb_produto where valor > 03.00 and valor < 60.00;

select * from tb_produto where nome like "%J%";

select * from tb_produto
	inner join tb_categoria on tb_categoria.id_cat = tb_produto.cat_id;
    
select tb_categoria.curso, tb_produto.nome from tb_produto
inner join tb_categoria on tb_categoria.id_cat = tb_produto.cat_id