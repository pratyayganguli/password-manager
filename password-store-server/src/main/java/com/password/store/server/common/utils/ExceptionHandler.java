package com.password.store.server.common.utils;

import com.password.store.server.common.pojo.Messages;

import java.io.IOException;

/**
 * @author Pratyay Ganguli
 */

public class ExceptionHandler {

    public String getMessage(Throwable t){
        if(t instanceof NullPointerException){
            return Messages.NULL_POINTER_MESSAGE;
        }
        else if(t instanceof IOException){
            return Messages.IOExceptionMessage;
        }
        else if(t instanceof ClassNotFoundException){
            return Messages.IOExceptionMessage;
        }
        else{
            return t.getMessage();
        }
    }
}
