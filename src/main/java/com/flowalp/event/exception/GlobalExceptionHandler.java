package com.flowalp.event.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    @ExceptionHandler(DuplicateIdException.class)
    public ResponseEntity<String> handleDuplicateIdException(DuplicateIdException ex) {
        return ResponseEntity.status(HttpStatus.CONFLICT)
                             .body("Errore: " + ex.getMessage());
    }

    @ExceptionHandler(IdGenerationException.class)
    public ResponseEntity<String> handleIdGenerationException(IdGenerationException ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Errore nella generazione dell'ID: " + ex.getMessage());
    }

    @ExceptionHandler(Exception.class)
    public ResponseEntity<String> handleGenericException(Exception ex) {
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR)
                             .body("Si è verificato un errore: " + ex.getMessage());
    }
}
