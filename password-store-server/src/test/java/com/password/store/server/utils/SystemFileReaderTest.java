package com.password.store.server.utils;

import com.password.store.server.common.pojo.Response;
import com.password.store.server.common.utils.SystemFileReaderImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class SystemFileReaderTest {
    private SystemFileReaderImpl systemFileReader;
    public SystemFileReaderTest(){
        systemFileReader = new SystemFileReaderImpl();
    }

    @Test
    public void readFile(){
        Response response = systemFileReader.readFile(
                "C:\\personal\\password-manager\\password-manager\\password-store-server\\src\\test\\java\\com\\password\\store\\server\\utils\\snigdha.txt"
        );
        Assertions.assertEquals("Hello", response.getType());
    }

}
