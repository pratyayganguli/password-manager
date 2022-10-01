package com.password.store.server.common.pojo;

/**
 * @author Pratyay Ganguli
 */

public class Response<T> {
    T type;
    private String message;
    public Response(String message, T type) {
        this.type = type;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getType() {
        return type;
    }

    public void setType(T type) {
        this.type = type;
    }
}
