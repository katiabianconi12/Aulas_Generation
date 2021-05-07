SELECT * FROM db_farmacia_do_bem.tb_categoria;

INSERT INTO db_farmacia_do_bem.tb_categoria (generico, cosmetico, suplemento)
VALUES 
('antibioticos', 'maquiagem', 'queimadores_de_gorduras'),
('pomadas', 'hidratantes', 'omega_3');

UPDATE tb_categoria
SET suplemento = 'bcaa'
WHERE idtb_categoria = 1;

SELECT * FROM db_farmacia_do_bem.tb_produto;

INSERT INTO db_farmacia_do_bem.tb_produto (remedio, maquiagem, emagrecedor, fralda, preco, fk_tb_categoria)
VALUES 
('amoxilina', 'base_rosto', 'queimadores_de_gorduras', 'pompom', '55','1'),
('ampicilina', 'batom', 'body_gold', 'pampers', '60','2'),
('xaropes', 'sombra_olhos', 'meratol', 'turma_da_monica', '70','1');

SELECT *FROM tb_produto
WHERE preco > 50;

SELECT *FROM tb_produto
WHERE preco BETWEEN 3 AND 60;

SELECT *FROM tb_produto
WHERE maquiagem LIKE 'B%';

SELECT *FROM db_farmacia_do_bem.tb_categoria
INNER JOIN db_farmacia_do_bem.tb_produto
ON tb_categoria.idtb_categoria = tb_produto.fk_tb_categoria;

SELECT *FROM db_farmacia_do_bem.tb_categoria
INNER JOIN db_farmacia_do_bem.tb_produto
ON tb_categoria.idtb_categoria = tb_produto.fk_tb_categoria
WHERE tb_categoria.cosmetico LIKE "maquiagem";