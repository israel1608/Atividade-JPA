# Atividade-JPA
Mecanismo de persistência objeto-relacional exemplo de conexão entre o JPA e o BD H2 

## Participantes 
- ISRAEL COSTA
- FLÁVIA

## Entidades 
O projeto possui três entidades que são as classes (ou objetos de transferência) Aluno,Emprestimo,Publicacao
cada uma delas com seus devidos atributos afim de se relacionar com suas respectivas tabelas no BD H2 através do JPA comforme a atividade exigia 

## DAO
O package Dao é dividida em 3 partes a interface, implementação da interface e a classe para testes. Através dela que é possivel realizar as operações com os dados(incluir,alterar,excluir e consultar) por meio da Entidade gerenciadora(EntityManager) 

## SQL
Essa pasta possui alguns códigos necessários pra a criação e povoamento das tabelas 
CREATE TABLE Emprestimo (
    emprestimo_id INT PRIMARY KEY,
    aluno_id INT,
    codigoPub INT,
    data_emprestimo VARCHAR(255),
    FOREIGN KEY (aluno_id) REFERENCES Aluno (aluno_id),
    FOREIGN KEY (codigoPub) REFERENCES Publicacao (codigoPub)
);

CREATE TABLE Publicacao (
    codigoPub INT PRIMARY KEY,
    titulo VARCHAR(255),
    ano INT,
    autor VARCHAR(255),
    tipo VARCHAR(255)
);

CREATE TABLE Aluno (
    aluno_id INT PRIMARY KEY,
    matriculaAluno varchar(10) UNIQUE,
    nome VARCHAR(255)
);

## Util
Possui uma classe auxiliar para geração de id aleatórios e outra para guardar data e hora com maior precisão

## META-INF
Onde fica as configurações de persistência 


