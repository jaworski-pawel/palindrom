package cgm.com.exception;

public class TooShortPhraseException extends RuntimeException {
    public TooShortPhraseException() {
        super("phrase must have at least 3 characters");
    }
}
