package app.udala.forum.controller.dto;

import java.time.LocalDateTime;

import org.springframework.data.domain.Page;

import app.udala.forum.modelo.Topico;

public class TopicoDto {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	public TopicoDto(Topico topico) {
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
	}
	
	public final Long getId() {
		return id;
	}
	public final String getTitulo() {
		return titulo;
	}
	public final String getMensagem() {
		return mensagem;
	}
	public final LocalDateTime getDataCriacao() {
		return dataCriacao;
	}

	public static Page<TopicoDto> converter(Page<Topico> topicos) {
		return topicos.map(TopicoDto::new);
	}

	
}
