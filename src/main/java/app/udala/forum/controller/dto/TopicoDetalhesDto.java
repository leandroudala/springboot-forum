package app.udala.forum.controller.dto;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import app.udala.forum.modelo.StatusTopico;
import app.udala.forum.modelo.Topico;

public class TopicoDetalhesDto {
	private Long id;
	private String titulo;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;
	private StatusTopico status;
	private List<RespostaDto> respostas;

	public TopicoDetalhesDto(Topico topico) {
		super();
		this.id = topico.getId();
		this.titulo = topico.getTitulo();
		this.mensagem = topico.getMensagem();
		this.dataCriacao = topico.getDataCriacao();
		this.nomeAutor = topico.getAutor().getNome();
		this.status = topico.getStatus();
		this.respostas = new ArrayList<>();
		this.respostas.addAll(topico.getRespostas().stream().map(RespostaDto::new).collect(Collectors.toList()));
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

	public final String getNomeAutor() {
		return nomeAutor;
	}

	public final StatusTopico getStatus() {
		return status;
	}

	public final List<RespostaDto> getRespostas() {
		return respostas;
	}

}
