package com.password.store.server.common.utils;

import com.password.store.server.common.pojo.Messages;
import com.password.store.server.common.pojo.Response;
import java.io.FileReader;

/**
 * @author Pratyay Ganguli
 */

public class SystemFileReaderImpl implements SystemFileReader {
    @Override
    public Response<Boolean> readFile(String pathToFile) {
        String content = "";
        int count = 0;
        try{
            FileReader reader = new FileReader(pathToFile);
            if(reader.ready()){
                while(reader.read() != -1){
                    count++;
                }
                reader = new FileReader(pathToFile);
                char [] charArray = new char[count];
                reader.read(charArray);
                content = new String(charArray);
            }
        }
        catch (Exception exception){
            return new Response(
                    new ExceptionHandler().getMessage(exception),
                    false
            );
        }
        return new Response(Messages.SUCCESS_MESSAGE, content);
    }

    @Override
    public Response readXML(String pathToFile) {
        return null;
    }

    @Override
    public Response readYAML(String pathToFile) {
        return null;
    }
}
