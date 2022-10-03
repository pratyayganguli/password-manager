package com.password.store.server.utils;

import com.password.store.server.common.utils.JSONFileReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class TestJSONFileReader {

    @Test
    public void checkBraces(){
        //FIXME: Failiure case
        /*
        Assertions.assertEquals(
                false,
                new JSONFileReader("/var/logs").checkBraces("{hello"));

         */

        //FIXME: Success case
        Assertions.assertEquals(
                true,
                new JSONFileReader("/var/logs").checkBraces("{}")
        );
    }

    @Test
    public void checkProp(){
        System.out.println("{\"name\":\"Pratyay\"}");
        Assertions.assertEquals(
                true,
                new JSONFileReader("/var/logs")
                        .checkProp("{\"name:\":\"Pratyay\"}")

        );
    }
}
