//package com.ejemplo_uno.excepcion;
//
//import java.time.LocalDateTime;
//import java.util.HashMap;
//import java.util.Map;
//
//import org.springframework.dao.DataIntegrityViolationException;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.context.request.WebRequest;
//import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;
//
//
//@ControllerAdvice
//public class GlobalExcepcionHandler extends ResponseEntityExceptionHandler{
//
//	@ExceptionHandler(ResourceNotFoundExcepcion.class)
//    public ResponseEntity<Object> handleResourceNotFoundException(ResourceNotFoundExcepcion ex, WebRequest request) {
//        Map<String, Object> body = new HashMap<>();
//        body.put("timestamp", LocalDateTime.now());
//        body.put("message", "Recurso no encontrado");
//
//        return new ResponseEntity<>(body, HttpStatus.NOT_FOUND);
//    }
//
//    // Manejo de excepciones generales
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<Object> handleGlobalException(Exception ex, WebRequest request) {
//        Map<String, Object> body = new HashMap<>();
//        body.put("timestamp", LocalDateTime.now());
//        body.put("message", "Ocurrió un error interno");
//
//        return new ResponseEntity<>(body, HttpStatus.INTERNAL_SERVER_ERROR);
//    }
//
//    // Manejo de excepciones específicas, por ejemplo, DataIntegrityViolationException
//    @ExceptionHandler(DataIntegrityViolationException.class)
//    public ResponseEntity<Object> handleDataIntegrityViolationException(DataIntegrityViolationException ex, WebRequest request) {
//        Map<String, Object> body = new HashMap<>();
//        body.put("timestamp", LocalDateTime.now());
//        body.put("message", "Violación de integridad de datos");
//
//        return new ResponseEntity<>(body, HttpStatus.CONFLICT);
//    }
//	
//	
//}
