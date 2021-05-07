SELECT * FROM db_cursodaminhavida.tb_categoria;

INSERT INTO db_cursodaminhavida.tb_categoria (curso_online, curso_presencial, curso_particular)
VALUES 
('basico', 'basico', 'basico'),
('intermediario', 'intermediario', 'intermediario'),
('avançado', 'avançado', 'avançado'),
('fluente', 'fluente', 'fluente');

SELECT * FROM db_cursodaminhavida.tb_curso;

INSERT INTO db_cursodaminhavida.tb_curso (ingles, espanhol, frances, portugues, valor, fk_tb_categoria)
VALUES 
('conversação', 'conversação', 'conversação', 'conversação', '500', 1),
('exercicos', 'exercicos', 'exercicos', 'exercicos', '200', 2),
('materiais', 'materiais', 'materiais', 'materiais', '300', 3),                                      
('cultura_da_lingua', 'cultura_da_lingua', 'cultura_da_lingua', 'cultura_da_lingua', '150', 4);

SELECT *FROM tb_curso
WHERE valor > 200;

SELECT *FROM tb_curso
WHERE valor BETWEEN 100 AND 300;

SELECT *FROM tb_curso
WHERE ingles LIKE 'c%';

SELECT *FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.fk_tb_categoria = tb_categoria.idtb_categora;

SELECT *FROM tb_curso
INNER JOIN tb_categoria
ON tb_curso.fk_tb_categoria = tb_categoria.idtb_categora
WHERE tb_curso.espanhol LIKE 'materiais';



