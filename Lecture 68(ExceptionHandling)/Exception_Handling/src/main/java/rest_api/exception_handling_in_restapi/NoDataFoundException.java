package rest_api.exception_handling_in_restapi;

public class NoDataFoundException extends RuntimeException{
    public NoDataFoundException(String msg){
        super(msg);
    }
}
