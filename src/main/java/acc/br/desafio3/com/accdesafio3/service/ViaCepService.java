package acc.br.desafio3.com.accdesafio3.service;

import acc.br.desafio3.com.accdesafio3.model.Estudante;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ViaCepService {

    public Estudante obterEnderecoPorCep(String cep) {
        String url = "https://viacep.com.br/ws/" + cep + "/json/";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, Estudante.class);
    }

	public Estudante findAdressByCep(String cep) {
		return null;
	}
}
