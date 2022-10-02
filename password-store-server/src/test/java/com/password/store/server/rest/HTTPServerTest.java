package com.password.store.server.rest;

import org.junit.jupiter.api.Test;

/**
 * @author Pratyay Ganguli
 */

public class HTTPServerTest {
    private HTTPServer server;
    private final static int PORT = 7001;
    public HTTPServerTest(){
        server = new HTTPServer(PORT);
    }

    @Test
    void startServer(){
        server.start();
    }
    @Test
    void health(){

    }
    @Test
    void stopServer(){

    }
}
