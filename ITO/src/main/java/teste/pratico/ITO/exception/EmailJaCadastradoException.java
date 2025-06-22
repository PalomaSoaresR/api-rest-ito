package teste.pratico.ITO.exception;

public class EmailJaCadastradoException extends RuntimeException {

    public EmailJaCadastradoException(String message) {
        super("Este email já está sendo utilizado.");
    }
    
}
