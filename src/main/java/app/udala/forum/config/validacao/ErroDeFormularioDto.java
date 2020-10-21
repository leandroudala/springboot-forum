package app.udala.forum.config.validacao;

public class ErroDeFormularioDto {
	private String campo;
	private String erro;

	public ErroDeFormularioDto(String campo, String erro) {
		this.campo = campo;
		this.erro = erro;
	}

	public final String getCampo() {
		return campo;
	}

	public final String getErro() {
		return erro;
	}

}
