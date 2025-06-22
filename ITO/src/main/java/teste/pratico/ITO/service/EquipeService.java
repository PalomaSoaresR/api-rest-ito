package teste.pratico.ITO.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import teste.pratico.ITO.entity.Equipe;
import teste.pratico.ITO.exception.SetorJaCadastradoException;
import teste.pratico.ITO.repository.EquipeRepository;

@Service
public class EquipeService {

    @Autowired
    private EquipeRepository equipeRepository;

    public Equipe cadastrarEquipe(Equipe equipe) {
        if (equipeRepository.existsBySetor(equipe.getSetor())) {
            throw new SetorJaCadastradoException(null);
        }
        return equipeRepository.save(equipe);
    }

    public List<Equipe> listarEquipes() {
        return equipeRepository.findAll();
    }
    
}
