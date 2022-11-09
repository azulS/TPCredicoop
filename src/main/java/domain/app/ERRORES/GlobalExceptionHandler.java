//package domain.app.ERRORES;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.ResponseBody;
//import org.springframework.web.bind.annotation.ResponseStatus;
//
//@ControllerAdvice
//public class GlobalExceptionHandler {
//    @ExceptionHandler(PubliRepetidaException.class)
//    @ResponseBody //poner el resultado en el body
//    @ResponseStatus(HttpStatus.CONFLICT)
//    String PubliRepetida(PubliRepetidaException ex){
//        return "la publicacion" +ex.getNombrePublicacion() + "ya existe";
//    }
//}
