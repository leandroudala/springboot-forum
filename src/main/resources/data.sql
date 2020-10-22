INSERT INTO USUARIO(nome, email, senha) VALUES ('Aluno', 'aluno@email.com', '$2a$10$zMhOcUjo7viZ5pzkeSQnQ.k/Ji7rLVu4mC4ayWdsXb9Rq5hDr5wdG');
INSERT INTO USUARIO(nome, email, senha) VALUES ('Moderador', 'moderador@email.com', '$2a$10$zMhOcUjo7viZ5pzkeSQnQ.k/Ji7rLVu4mC4ayWdsXb9Rq5hDr5wdG');

INSERT INTO PERFIL(id, nome) VALUES (1, 'ROLE_ALUNO'), (2, 'ROLE_MODERADOR');

INSERT INTO USUARIO_PERFIS(usuario_id, perfis_id) VALUES (1, 1), (2, 2);

INSERT INTO CURSO(nome, categoria) VALUES('Spring Boot', 'Programação'), ('HTML5', 'Front-end');

INSERT INTO TOPICO(titulo, mensagem, data_criacao, status, autor_id, curso_id) VALUES
('Dúvida', 'Erro ao criar projeto', '2020-10-16 17:59:00', 'NAO_RESPONDIDO', 1, 1),
('Dúvida 2', 'Projeto não compila', '2020-10-15 12:59:59', 'NAO_RESPONDIDO', 1, 1),
('Dúvida 3', 'Tag HTML', '2020-10-15 14:32:25', 'NAO_RESPONDIDO', 1, 2);
