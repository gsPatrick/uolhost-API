package br.com.patrick.exceptions;


import br.com.patrick.exceptions.dto.ExceptionDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.NoSuchElementException;

@RestControllerAdvice
public class ControllerExceptionHandler {

    @ExceptionHandler(NoSuchElementException.class)
    public ResponseEntity threatNoSuchElementException(NoSuchElementException exception){
        ExceptionDto dto = new ExceptionDto("O número de usuarios cadastrados excedeu o número limite", "400");
        return ResponseEntity.badRequest().body(dto);
    }

}
