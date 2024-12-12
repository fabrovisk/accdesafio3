-- Criação da tabela estudante
CREATE TABLE estudante (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(255) NOT NULL,
    data_nascimento DATE NOT NULL,
    curso VARCHAR(255) NOT NULL,
    cep VARCHAR(10),
    logradouro VARCHAR(255),
    complemento VARCHAR(255),
    bairro VARCHAR(255),
    localidade VARCHAR(255),
    uf VARCHAR(2)
);
