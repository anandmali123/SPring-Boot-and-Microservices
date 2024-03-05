package rest_api.exception_handling_in_restapi.Global_Handler;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import rest_api.exception_handling_in_restapi.ExceptionInf;
import rest_api.exception_handling_in_restapi.NoDataFoundException;

@RestControllerAdvice
public class AppExceptionHandler {
    @ExceptionHandler(value= NoDataFoundException.class)
    public ResponseEntity<ExceptionInf> handleNdfe(NoDataFoundException nfe){
        ExceptionInf exception = new ExceptionInf();

        exception.setCode("SBI002");
        exception.setMsg(nfe.getMessage());

        return new ResponseEntity<>(exception, HttpStatus.BAD_REQUEST);

    }

    @ExceptionHandler(value= ArithmeticException.class)
    public ResponseEntity<ExceptionInf> handleAE(ArithmeticException ae){
        ExceptionInf exception = new ExceptionInf();
        exception.setMsg(ae.getMessage());
        exception.setCode("SBI123");


        return new ResponseEntity<>(exception, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
