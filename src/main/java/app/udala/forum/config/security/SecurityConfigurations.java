package app.udala.forum.config.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@EnableWebSecurity
@Configuration
public class SecurityConfigurations extends WebSecurityConfigurerAdapter {

	// Authentication config (access control, login)
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	}

	// Authorization config (URL, access profile)
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers(HttpMethod.GET, "/topics").permitAll()
			.antMatchers(HttpMethod.GET, "/topics/*").permitAll();
	}

	// Static files config (css, js, images, etc.)
	@Override
	public void configure(WebSecurity web) throws Exception {
	}
}
