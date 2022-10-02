package com.password.store.server.common.utils;

import java.util.logging.Logger;

/**
 * @author Pratyay Ganguli
 */

public class JSONFileReader {
    private String pathToFile;
    private String fileContent;
    private SystemFileReaderImpl fileReader;

    private static Logger logger = Logger.getLogger(JSONFileReader.class.getName());

    public JSONFileReader(String pathToFile){
        this.fileReader = new SystemFileReaderImpl();
        this.pathToFile = pathToFile;
        this.fileContent = fileReader.readFile(pathToFile).getType().toString();
    }

    public boolean isJSON(String JSONStringContent){
        try {
            for(char c: JSONStringContent.toCharArray()){
                if (c != '{'){
                    return false;
                }

                if(c == '{'){

                }
            }

        }
        catch (Exception e){
            logger.info(new ExceptionHandler().getMessage(e));
        }
        return false;
    }
}
