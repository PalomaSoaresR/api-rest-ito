package teste.pratico.ITO.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import teste.pratico.ITO.entity.Funcionario;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
    boolean existsByEmail(String email);

}
