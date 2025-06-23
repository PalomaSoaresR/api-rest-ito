package teste.pratico.ITO.exception;

public class EmailJaCadastradoException extends RuntimeException {

    public EmailJaCadastradoException(String email) {
        super("O email " + email + " já está sendo utilizado." );
    }
    
}
