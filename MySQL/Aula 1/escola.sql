create database escola;

use escola;

create table tb_estudante(
	id bigint(5) auto_increment,
    nome varchar(20) not null,
    idade bigint,
    nota bigint,
    presente boolean,
    primary key (id)
    );
    
insert into tb_estudante (nome, idade, nota, presente) values ("Cassio", 11, 7, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Fagner", 10, 8, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Joao Vitor", 8, 9, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Paulinho", 11, 4, 0);
insert into tb_estudante (nome, idade, nota, presente) values ("Renato A", 12, 9, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Giuliano", 10, 5, 0);
insert into tb_estudante (nome, idade, nota, presente) values ("Jo", 13, 5, 1);
insert into tb_estudante (nome, idade, nota, presente) values ("Cantillo", 9, 7, 0);
    
select * from tb_estudante where nota > 7;

select * from tb_estudante where nota < 7;

update tb_estudante set nome = "Roger G"
	where id = 7;