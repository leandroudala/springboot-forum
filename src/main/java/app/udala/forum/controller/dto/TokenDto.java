package app.udala.forum.controller.dto;

public class TokenDto {
	private String token;
	private String tipo;

	public TokenDto(String token, String tipo) {
		this.token = token;
		this.tipo = tipo;
	}

	public final String getToken() {
		return token;
	}

	public final String getTipo() {
		return tipo;
	}

}
