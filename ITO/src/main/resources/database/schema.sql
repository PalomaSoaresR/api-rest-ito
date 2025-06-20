CREATE DATABASE empresa;

CREATE TABLE equipe (
    equipe_id SERIAL PRIMARY KEY,
    equipe_nome VARCHAR(100) NOT NULL,
    equipe_setor VARCHAR(100) NOT NULL 
    )

CREATE TABLE funcionario (
    fun_id SERIAL PRIMARY KEY,
    fun_nome VARCHAR(100) NOT NULL,
    fun_cargo VARCHAR(100) NOT NULL,
    fun_email VARCHAR(100) NOT NULL,
    equipe_id INT NOT NULL,
    FOREIGN KEY (equipe_id) REFERENCES equipe(id)
)