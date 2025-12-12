package com.example.demo.exception;

public class UserIdException extends RuntimeException{
    public UserIdException(int id){
        super(Integer.toString(id));
    }
}
