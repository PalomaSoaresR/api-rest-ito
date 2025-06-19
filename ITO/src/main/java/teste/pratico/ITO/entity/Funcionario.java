package teste.pratico.ITO.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "funcionario")
public class Funcionario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "fun_id")
    private Long id;

    @Column(name = "fun_nome")
    private String nome;

    @Column(name = "fun_cargo")
    private String cargo;

    @Column(name = "fun_email")
    private String email;

    @ManyToOne(optional = false) 
    @JoinColumn(name = "equipe_id", nullable = false) 
    private Equipe equipe;

}
