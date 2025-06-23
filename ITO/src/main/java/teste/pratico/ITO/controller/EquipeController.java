package teste.pratico.ITO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import teste.pratico.ITO.entity.Equipe;
import teste.pratico.ITO.service.EquipeService;

@RestController
@RequestMapping(value = "/equipes")
public class EquipeController {

    @Autowired
    private EquipeService equipeService;

    @GetMapping
    public List<Equipe> listarEquipes() {
        return equipeService.listarEquipes();
    }

    @PostMapping
    public ResponseEntity<String> cadastrarEquipe(@RequestBody Equipe equipe) {
        equipeService.cadastrarEquipe(equipe);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Equipe cadastrada com sucesso!");
    }

}
