package app.udala.forum.controller.dto;

import java.time.LocalDateTime;

import app.udala.forum.modelo.Resposta;

public class RespostaDto {
	private Long id;
	private String mensagem;
	private LocalDateTime dataCriacao;
	private String nomeAutor;

	public RespostaDto(Resposta resposta) {
		super();
		this.mensagem = resposta.getMensagem();
		this.dataCriacao = resposta.getDataCriacao();
		this.nomeAutor = resposta.getAutor().getNome();
	}

	public final Long getId() {
		return id;
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

}
