package com.lemavos.mcf.exception;

import java.util.Map;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException;

@RestControllerAdvice
@RestControllerAdvice
public class GlobalExceptionHandler {

    // ❗ Captura erros do seu validator
    @ExceptionHandler(IllegalArgumentException.class)
    public ResponseEntity<?> handleIllegalArgument(IllegalArgumentException ex) {
        return ResponseEntity.badRequest().body(
                Map.of(
                        "error", "Invalid Argument",
                        "message", ex.getMessage()
                )
        );
    }

    // ❗ Captura erro de tipo inválido do Spring (ex.: b=abc)
    @ExceptionHandler(MethodArgumentTypeMismatchException.class)
    public ResponseEntity<?> handleTypeMismatch(MethodArgumentTypeMismatchException ex) {

        return ResponseEntity.badRequest().body(
                Map.of(
                        "error", "Invalid Parameter",
                        "message", "Parameter '" + ex.getName()
                                + "' must be a valid " + ex.getRequiredType().getSimpleName() + "."
                )
        );
    }

    // ❗ Captura quando parâmetro obrigatório falta
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public ResponseEntity<?> handleMissing(MissingServletRequestParameterException ex) {

        return ResponseEntity.badRequest().body(
                Map.of(
                        "error", "Missing Parameter",
                        "message", "Parameter '" + ex.getParameterName() + "' is required."
                )
        );
    }
}

