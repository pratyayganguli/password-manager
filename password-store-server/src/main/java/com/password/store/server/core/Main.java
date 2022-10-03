package com.password.store.server.core;

import com.password.store.server.rest.HTTPServer;

import java.util.logging.Logger;

/**
 * @author Pratyay Ganguli
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Logger logger = Logger.getLogger(Main.class.getName());
        HTTPServer server = new HTTPServer(7002);
        server.start();
        Thread.sleep(60000);
        logger.info("Server alive since : " + server.aliveSince());
    }
}
