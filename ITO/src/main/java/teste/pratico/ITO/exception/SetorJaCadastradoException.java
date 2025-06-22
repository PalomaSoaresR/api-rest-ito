package teste.pratico.ITO.exception;

public class SetorJaCadastradoException extends RuntimeException {
    public SetorJaCadastradoException(String message) {
        super("O setor já está cadastrado.");
    }
}
