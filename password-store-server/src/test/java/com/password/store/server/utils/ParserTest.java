package com.password.store.server.utils;

import com.password.store.server.common.pojo.Response;
import com.password.store.server.common.utils.ResponseParser;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.logging.Logger;

/**
 * @author Pratyay Ganguli
 */

public class ParserTest {
    @Test
    public void JSONparseTest(){
        Logger logger = Logger.getLogger(ParserTest.class.getName());
        Response response = new Response("Hello", "Some String");
        logger.info(ResponseParser.JSONparser(response));
    }
}
