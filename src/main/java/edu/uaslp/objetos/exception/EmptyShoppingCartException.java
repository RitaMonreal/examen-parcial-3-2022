package edu.uaslp.objetos.exception;

public class EmptyShoppingCartException extends RuntimeException{
    public EmptyShoppingCartException(String exc){
        super(exc);
    }
}