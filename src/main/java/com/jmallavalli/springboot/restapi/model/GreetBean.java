package com.jmallavalli.springboot.restapi.model;

public class GreetBean {


    private String message;

    public GreetBean(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "GreetBean{" +
                "message='" + message + '\'' +
                '}';
    }
}
