package com.password.store.server.common.utils;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.password.store.server.common.pojo.Response;

import java.lang.reflect.Type;

/**
 * @author Pratyay Ganguli
 */

public class ResponseParser {

    private ResponseParser(){

    }

    public static String JSONparser(Response response){
        if(response != null){
            GsonBuilder builder = new GsonBuilder();
            Gson gson = builder.create();
            return gson.toJson(response);
        }
        throw new NullPointerException("Response is null");
    }

    public static String XMLparser(){
        return null;
    }
}
