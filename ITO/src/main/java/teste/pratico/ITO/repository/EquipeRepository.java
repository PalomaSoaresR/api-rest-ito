package teste.pratico.ITO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.pratico.ITO.entity.Equipe;

public interface EquipeRepository extends JpaRepository<Equipe, Long> {
    boolean existsBySetor(String setor);
}
