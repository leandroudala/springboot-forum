package app.udala.forum.repository;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.ActiveProfiles;

import app.udala.forum.modelo.Curso;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@ActiveProfiles("test")
class CursoRepositoryTest {
	
	@Autowired
	private CursoRepository repository;
	
	@Autowired
	private TestEntityManager em;
	
	@Test
	void buscarCursoPorNome() {
		String nomeCurso = "HTML5";
		Curso html5 = new Curso();
		html5.setNome(nomeCurso);
		html5.setCategoria("programação");
		em.persist(html5);
		
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNotNull(curso);
		Assert.assertEquals(nomeCurso, curso.getNome());
	}

	@Test
	void buscarCursoInexistente() {
		String nomeCurso = "CSS3";
		Curso curso = repository.findByNome(nomeCurso);
		Assert.assertNull(curso);
	}
}
