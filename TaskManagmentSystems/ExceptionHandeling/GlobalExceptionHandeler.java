package com.Task.TaskManagmentSystems.ExceptionHandeling;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class GlobalExceptionHandeler {
    //For the Validation Errors
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<Map<String,String>> handleValidationError(MethodArgumentNotValidException ex){
        Map<String,String > rsp=new HashMap<>();
        ex.getBindingResult().getAllErrors().forEach((objectError -> {
            String fieldname=((FieldError)objectError).getField();
            String message= objectError.getDefaultMessage();
            rsp.put(fieldname,message);
        }));
        return new ResponseEntity<>(rsp, HttpStatus.BAD_REQUEST);
    }
}

