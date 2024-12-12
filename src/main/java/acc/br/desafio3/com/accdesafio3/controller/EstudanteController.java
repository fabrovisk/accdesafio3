package acc.br.desafio3.com.accdesafio3.controller;

import acc.br.desafio3.com.accdesafio3.model.Estudante;
import acc.br.desafio3.com.accdesafio3.repository.EstudanteRepository;
import acc.br.desafio3.com.accdesafio3.service.ViaCepService;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/estudante")
public class EstudanteController {

    private final ViaCepService viaCepService;
    private final EstudanteRepository estudanteRepository;

    public EstudanteController(ViaCepService viaCepService, EstudanteRepository estudanteRepository) {
        this.viaCepService = viaCepService;
        this.estudanteRepository = estudanteRepository;
    }

    @GetMapping("/novo")
    public String novoEstudante(Model model) {
        model.addAttribute("estudante", new Estudante());
        return "studentRegistration";
    }

    @PostMapping("/salvar")
    public String salvarEstudante(@ModelAttribute Estudante estudante) {
        estudanteRepository.save(estudante);
        return "redirect:/studentList";
    }

    
        @GetMapping("/lista")
        public String listarEstudantes(Model model) {
            List<Estudante> estudantes = estudanteRepository.findAll();
            model.addAttribute("estudantes", estudantes);
            return "studentList"; 
        }
    
}
