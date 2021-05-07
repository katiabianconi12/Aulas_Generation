SELECT * FROM db_pizzaria_legal.tb_categorias;

iNSERT INTO db_pizzaria_legal.tb_categorias (grande, pequena, media) 
VALUES 
("atum", "mussarela", "calabresa"),
("calabresa", "atum", "mussarela"),
("mussarela", "calabresa", "atum");

SELECT * FROM db_pizzaria_legal.tb_pizza;

iNSERT INTO db_pizzaria_legal.tb_pizza (preço, nome, sem_borda, com_borda, sabor, fk_categoria) 
VALUES 
('20', 'katia', 'com_borda', 'catupiry', 'meio_a_meio', 1),
('65', 'leo', 'com_borda', 'catupiry', 'inteira', 2),
('30', 'claudia', 'com_borda', 'cheddar', 'inteira', 3),
('50', 'claudia', 'com_borda', 'cheddar', 'inteira', 2),
('69', 'katia', 'sem_borda', 'sem_borda', 'meio_a_meio', 3);

SELECT *FROM tb_pizza
WHERE preço> 45;

SELECT *FROM tb_pizza
WHERE preço BETWEEN 29 AND 60;

SELECT *FROM tb_pizza
WHERE nome LIKE 'c%';

SELECT *FROM db_pizzaria_legal.tb_categorias
INNER JOIN db_pizzaria_legal.tb_pizza
ON tb_categorias.id_categoria = tb_pizza.fk_categoria;

SELECT *FROM db_pizzaria_legal.tb_categorias
INNER JOIN db_pizzaria_legal.tb_pizza
ON tb_categorias.id_categoria = tb_pizza.fk_categoria
WHERE tb_pizza.com_borda LIKE 'catupiry';