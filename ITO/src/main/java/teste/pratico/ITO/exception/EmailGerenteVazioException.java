package teste.pratico.ITO.exception;

public class EmailGerenteVazioException extends RuntimeException{
      public EmailGerenteVazioException() {
        super("O email do gerente não pode estar vazio.");
    }
}
