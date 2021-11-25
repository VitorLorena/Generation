create database empresa;

use empresa;

create table tb_funcionaries(
    id bigint(5) auto_increment,
    nome varchar(20) not null,
    idade bigint,
    salario decimal(4),
    AnosEmpresa bigint,
    primary key (id)
    );
    
insert into tb_funcionaries (nome, idade, salario, AnosEmpresa) values ("Cassio", 34, 5000, 10);
insert into tb_funcionaries (nome, idade, salario, AnosEmpresa) values ("Fagner", 32, 4000, 8);
insert into tb_funcionaries (nome, idade, salario, AnosEmpresa) values ("Paulinho", 33, 1000, 1);
insert into tb_funcionaries (nome, idade, salario, AnosEmpresa) values ("Renato A", 33, 6000, 2);
insert into tb_funcionaries (nome, idade, salario, AnosEmpresa) values ("Giuliano", 29, 1800, 2);
insert into tb_funcionaries (nome, idade, salario, AnosEmpresa) values ("Cantillo", 27, 2400, 3);

select * from tb_funcionaries where salario > 2000;

select * from tb_funcionaries where salario > 2000;

update tb_funcionaries set nome = "Adson"
    where id = 5;

