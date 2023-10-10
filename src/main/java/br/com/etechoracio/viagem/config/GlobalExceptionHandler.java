package br.com.etechoracio.viagem.config;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class GlobalExceptionHandler {

    private record ErrorResponse(String error, LocalDateTime dateTime) {};
}
