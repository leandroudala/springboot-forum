package app.udala.forum.controller.form;

import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;

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

	public UsernamePasswordAuthenticationToken converter() {
		return new UsernamePasswordAuthenticationToken(this.email, this.senha);
	}

}
