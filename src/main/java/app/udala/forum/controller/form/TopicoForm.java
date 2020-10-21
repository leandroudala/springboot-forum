package app.udala.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import app.udala.forum.modelo.Curso;
import app.udala.forum.modelo.Topico;
import app.udala.forum.repository.CursoRepository;

public class TopicoForm {
	@NotNull
	@NotEmpty
	@Length(min = 5)
	private String titulo;

	@NotNull
	@NotEmpty
	@Length(min = 10)
	private String mensagem;

	@NotNull
	@NotEmpty
	private String nomeCurso;

	public final String getTitulo() {
		return titulo;
	}

	public final void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public final String getMensagem() {
		return mensagem;
	}

	public final void setMensagem(String mensagem) {
		this.mensagem = mensagem;
	}

	public final String getNomeCurso() {
		return nomeCurso;
	}

	public final void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}

	public Topico converter(CursoRepository repository) {
		Curso curso = repository.findByNome(nomeCurso);
		return new Topico(titulo, mensagem, curso);
	}

}
