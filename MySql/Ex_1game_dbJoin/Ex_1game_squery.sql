SELECT * FROM db_generation_game_online.tb_classe;

INSERT INTO db_generation_game_online.tb_classe (atirador, espião, soldado)
VALUES
('atirador_elite', 'agente_infiltrado', 'militar'),
('atirador_profissional', 'agente_cia', 'fuzileiro'),
('atirador_campo', 'agente_britanico', 'artilheiro');

SELECT * FROM db_generation_game_online.tb_personagem; 

INSERT INTO db_generation_game_online.tb_personagem (feminino, masculino, neutro, outros, nivel, fk_tb_classe)
VALUES
('acessorios', 'acessorios', 'acessorios', 'acessorios', '1', 1),
('armas', 'revolver', 'facas', 'espingarda', '2', 2),
('traje', 'roupas', 'vestimenta', 'uniforme', '3', 3);

SELECT *FROM tb_personagem
WHERE nivel >2;

SELECT *FROM tb_personagem
WHERE nivel BETWEEN 1 AND 2;

SELECT *FROM tb_classe
WHERE atirador LIKE 'a%';

SELECT *FROM tb_personagem
INNER JOIN tb_classe
ON tb_personagem.fk_tb_classe = tb_classe.idtb_classe;

SELECT *FROM tb_personagem
INNER JOIN tb_classe
ON tb_personagem.fk_tb_classe = tb_classe.idtb_classe
WHERE tb_personagem.feminino LIKE "armas";

