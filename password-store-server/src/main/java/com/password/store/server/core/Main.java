package com.password.store.server.core;

import com.password.store.server.rest.HTTPServer;

/**
 * @author Pratyay Ganguli
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        HTTPServer server = new HTTPServer(7002);
        server.start();
        Thread.sleep(60000);
        System.out.println("Server alive since : " + server.aliveSince());
    }
}
