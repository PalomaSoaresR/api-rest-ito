package teste.pratico.ITO.exception;

public class SetorJaCadastradoException extends RuntimeException {
    public SetorJaCadastradoException(String setor) {
        super("O setor " + setor + " já está cadastrado.");
    }
}
