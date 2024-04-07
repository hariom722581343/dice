package Exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import twitter4j.TwitterException;

@ControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(TwitterException.class)
    public ResponseEntity<String> handleTwitterException(TwitterException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("Error occurred while accessing Twitter API: " + ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body("An unexpected error occurred: " + ex.getMessage());
    }
}
