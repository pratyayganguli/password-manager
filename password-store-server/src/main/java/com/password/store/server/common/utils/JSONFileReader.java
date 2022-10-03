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

    public Boolean checkBraces(String jsonContent){
       try {
           char[] jsonContentArr = jsonContent.toCharArray();
           int conditionCounter = 0;

           for (int i = 0; i < jsonContentArr.length; i++) {
               if (i == 0 && jsonContentArr[i] == '{') {
                   conditionCounter++;
               }

               if (i == jsonContentArr.length - 1 && jsonContentArr[i] == '}') {
                   conditionCounter++;
               }

               if (conditionCounter == 2) {
                   return true;
               }
           }
       }

       catch (Exception e){
           logger.info(new ExceptionHandler().getMessage(e));
       }
        return false;
    }

    public Boolean checkProp(String jsonContent){
        try{
            char [] jsonContentArr = jsonContent.toCharArray();
            int conditionCount = 0;
            int quoteCount = 0;
            int j = 1;

            for (int i = 1; i < jsonContentArr.length - 1; i++) {

                if(i == 1 && jsonContentArr[i] == '"') {
                    conditionCount++;
                }

                if(jsonContentArr[j] == '"'){
                    quoteCount++;
                    while( j < jsonContentArr.length-1){
                        if(jsonContentArr[j+1] == '"'){
                            quoteCount++;
                            break;
                        }
                        j++;
                    }
                }

                if((jsonContentArr[i] == ':' && jsonContentArr[i-1] == '"')){
                    conditionCount++;
                }

                if(jsonContentArr[i] == ','){
                    if(jsonContentArr[i+1] == '"'){
                        conditionCount++;
                    }
                }

                if(conditionCount >= 2 && quoteCount % 2 == 0){
                    return true;
                }
            }
        }

        catch (Exception e){
            logger.info(new ExceptionHandler().getMessage(e));
        }
        return false;
    }
}
