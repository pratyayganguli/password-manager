package com.password.store.server.rest;

import com.sun.net.httpserver.HttpServer;
import java.net.InetSocketAddress;
import java.time.LocalDateTime;
import java.util.logging.Logger;

/**
 * @author Pratyay Ganguli
 */

public class HTTPServer {
    private InetSocketAddress address;
    private HttpServer server;
    private static String serverAliveSince;
    private int port;
    private Logger logger = Logger.getLogger(HTTPServer.class.getName());

    public HTTPServer(int port) {
        this.port = port;
        address = new InetSocketAddress(port);
        try{
            server = HttpServer.create(address, 1);
        }
        catch (Exception e){
            System.out.println(e.getCause());
        }
    }

    public void start(){
        try{
            server.start();
            logger.info("Server started on " + port);
            serverAliveSince = LocalDateTime.now().toString();
        }
        catch (Exception e){
            logger.info(e.getCause().toString());
        }
    }

    void restart(){
        stop();
        start();
    }

    void stop(){
        server.stop(5);
    }

    public String aliveSince(){
        return serverAliveSince;
    }

    boolean health(){
        if(serverAliveSince != null){
            return true;
        }
        return false;
    }
}
