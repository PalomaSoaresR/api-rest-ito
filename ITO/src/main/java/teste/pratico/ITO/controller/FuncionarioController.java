package teste.pratico.ITO.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.validation.Valid;
import teste.pratico.ITO.entity.Funcionario;
import teste.pratico.ITO.service.FuncionarioService;

@RestController
@CrossOrigin
@RequestMapping(value = "/funcionarios")
public class FuncionarioController {

    @Autowired
    private FuncionarioService funcionarioService;

    @GetMapping
    public List<Funcionario> listarFuncionarios() {
        return funcionarioService.listarFuncionarios();
    }

    @PostMapping
    public ResponseEntity<String> cadastrarFuncionario(@RequestBody @Valid Funcionario funcionario) {
        funcionarioService.cadastrarFuncionario(funcionario);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Funcionario cadastrado com sucesso!");
    }
    
}


