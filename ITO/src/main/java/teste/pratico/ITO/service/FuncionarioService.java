package teste.pratico.ITO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.pratico.ITO.entity.Equipe;
import teste.pratico.ITO.entity.Funcionario;
import teste.pratico.ITO.exception.EmailGerenteVazioException;
import teste.pratico.ITO.repository.EquipeRepository;
import teste.pratico.ITO.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;
    @Autowired
    private EquipeRepository equipeRepository;

    public Funcionario cadastrarFuncionario(Funcionario novofuncionario) {
        Equipe equipe = equipeRepository.findById(novofuncionario.getEquipe().getId())
                .orElseThrow(() -> new RuntimeException("Equipe não encontrada"));
        if ("Gerente".equalsIgnoreCase(novofuncionario.getCargo()) &&
                (novofuncionario.getEmail() == null || novofuncionario.getEmail().isBlank())) {
            throw new EmailGerenteVazioException();
        }
        Funcionario funcionario = new Funcionario();
        funcionario.setNome(novofuncionario.getNome());
        funcionario.setCargo(novofuncionario.getCargo());
        funcionario.setEmail(novofuncionario.getEmail());
        funcionario.setEquipe(equipe);

        return funcionarioRepository.save(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarioRepository.findAll();
    }
}
