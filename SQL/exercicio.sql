CREATE TABLE clientes (
    id INT PRIMARY KEY,
    nome VARCHAR(255),
    email VARCHAR(255),
    telefone VARCHAR(20),
    idade INT
);


INSERT INTO clientes (id, nome, email, telefone, idade) VALUES
    (1, 'João Silva', 'joao.silva@email.com', '11999999999', 30),
    (2, 'Maria Santos', 'maria.santos@email.com', '11888888888', 25),
    (3, 'Pedro Oliveira', 'pedro.oliveira@email.com', '11777777777', 40),
    (4, 'Ana Rodrigues', 'ana.rodrigues@email.com', '11666666666', 35),
    (5, 'Carlos Ferreira', 'carlos.ferreira@email.com', '11555555555', 28);

-- Criando a tabela produtos
CREATE TABLE produtos (
    codigo INT PRIMARY KEY,
    nome VARCHAR(255),
    preco DECIMAL(10,2),
    quantidade INT
);


INSERT INTO produtos (codigo, nome, preco, quantidade) VALUES
    (1, 'Camiseta', 29.99, 50),
    (2, 'Calça Jeans', 99.90, 30),
    (3, 'Tênis', 129.99, 20);


CREATE TABLE itens (
    id INT PRIMARY KEY,
    codigo_produto INT,
    id_cliente INT,
    quantidade INT,
    FOREIGN KEY (codigo_produto) REFERENCES produtos(codigo),
    FOREIGN KEY (id_cliente) REFERENCES clientes(id)
);


INSERT INTO itens (id, codigo_produto, id_cliente, quantidade) VALUES
    (1, 1, 1, 2),
    (2, 2, 2, 1),
    (3, 3, 3, 1),
    (4, 1, 4, 3),
    (5, 2, 5, 2);


CREATE VIEW ClientesComCompras AS
SELECT 
    c.id,
    c.nome,
    COUNT(i.id) AS quantidade_compras
FROM 
    clientes c
LEFT JOIN 
    itens i ON c.id = i.id_cliente
GROUP BY
    c.id, c.nome
ORDER BY
    quantidade_compras DESC;
Use code with caution.
SQL


CREATE VIEW ProdutosMaisVendidos AS
SELECT 
    p.codigo,
    p.nome,
    SUM(i.quantidade) AS quantidade_vendida
FROM 
    produtos p
JOIN 
    itens i ON p.codigo = i.codigo_produto
GROUP BY
    p.codigo, p.nome
ORDER BY
    quantidade_vendida DESC;
select *from produtos