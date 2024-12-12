package  acc.br.desafio3.service;

import acc.br.desafio3.com.accdesafio3.model.Estudante;
import acc.br.desafio3.com.accdesafio3.repository.EstudanteRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;

@DataJpaTest
public class EstudanteServiceTest {

    @Autowired
    private EstudanteRepository estudanteRepository;

    @Test
    public void quandoEstudanteSalvoEntãoDeveExistir() {
        Estudante estudante = new Estudante("João Silva", LocalDate.of(2000, 1, 1), "Rua A", "Engenharia", null, null, null, null, null);
        estudanteRepository.save(estudante);
        assertThat(estudanteRepository.findById(estudante.getId())).isPresent();
    }
}
