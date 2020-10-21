package app.udala.forum.controller.form;

public class LoginForm {
	private String email;
	private String senha;

	public final void setEmail(String email) {
		this.email = email;
	}

	public final void setSenha(String senha) {
		this.senha = senha;
	}

	public final String getEmail() {
		return email;
	}

	public final String getSenha() {
		return senha;
	}

}
