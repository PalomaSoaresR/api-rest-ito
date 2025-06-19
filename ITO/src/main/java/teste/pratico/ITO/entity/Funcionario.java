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

    public Funcionario() {
    }

    public Funcionario(Long id, String nome, String cargo, String email, Equipe equipe) {
        this.id = id;
        this.nome = nome;
        this.cargo = cargo;
        this.email = email;
        this.equipe = equipe;
    }
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Equipe getEquipe() {
        return equipe;
    }

    public void setEquipe(Equipe equipe) {
        this.equipe = equipe;
    }

    
}
