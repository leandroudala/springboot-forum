package app.udala.forum.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import app.udala.forum.modelo.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
	Optional<Usuario> findByEmail(String email);
}
