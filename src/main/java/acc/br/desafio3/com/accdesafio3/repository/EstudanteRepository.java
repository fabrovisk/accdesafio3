package acc.br.desafio3.com.accdesafio3.repository;

import acc.br.desafio3.com.accdesafio3.model.Estudante;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstudanteRepository extends JpaRepository<Estudante, Long> {
}
