INSERT INTO USUARIO(nome, email, senha) VALUES ('Aluno', 'aluno@email.com', '123456');

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação'), ('HTML5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES
('Dúvida', 'Erro ao criar projeto', '2020-10-16 17:59:00', 'NAO_RESPONDIDO', 1, 1),
('Dúvida 2', 'Projeto não compila', '2020-10-15 12:59:59', 'NAO_RESPONDIDO', 1, 1),
('Dúvida 3', 'Tag HTML', '2020-10-15 14:32:25', 'NAO_RESPONDIDO', 1, 2);
