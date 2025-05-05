
CREATE DATABASE db_java;

USE db_java;

CREATE TABLE departamento (
	idDepartamento int NOT NULL auto_increment,
	nome varchar (45) NOT NULL,
	sigla varchar (45) NOT NULL,
	primary key (idDepartamento)
);

CREATE TABLE FUNCIONARIO(
	idFuncionario int NOT NULL,
    nome varchar(45) NOT NULL,
    matricula int NOT NULL,
    departamento_FK int,
    constraint FK_Departamento foreign key (departamento_FK) references departamento (idDepartamento)
);

INSERT INTO departamento (nome, sigla)values
("Desenvolvimento", "DEV"),
("Qualidade", "QA"),
("Engenharia", "ENG");

INSERT INTO funcionario (idFuncionario, nome, matricula, departamento_FK)values
(1, "Maria", 2513, 3),
(2, "João", 3640, 1),
(3, "Marta", 1010, 2);

select * from funcionario;