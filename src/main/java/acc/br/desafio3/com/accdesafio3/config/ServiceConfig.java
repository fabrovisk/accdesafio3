package acc.br.desafio3.com.accdesafio3.config;

import acc.br.desafio3.com.accdesafio3.model.Estudante;
import acc.br.desafio3.com.accdesafio3.service.ViaCepService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ServiceConfig {

    @Bean
    public ViaCepService viaCepService() {
        return new ViaCepService() {
            @Override
            public Estudante findAdressByCep(String cep) {
                return null;
            }
        };
    }
}
