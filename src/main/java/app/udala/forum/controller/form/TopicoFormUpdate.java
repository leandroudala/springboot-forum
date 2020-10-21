package app.udala.forum.controller.form;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import app.udala.forum.modelo.Topico;
import app.udala.forum.repository.TopicoRepository;

public class TopicoFormUpdate {
	@NotNull @NotEmpty @Length(min = 5)
	private String titulo;
	@NotNull @NotEmpty @Length(min = 10)
	private String mensagem;
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
	public Topico atualizar(Long id, TopicoRepository topicoRepository) {
		Topico topico = topicoRepository.getOne(id);
		topico.setTitulo(this.titulo);
		topico.setMensagem(this.mensagem);
		return topico;
	}
	
}
