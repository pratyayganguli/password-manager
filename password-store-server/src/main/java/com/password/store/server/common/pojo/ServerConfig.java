package com.password.store.server.common.pojo;

/**
 * @author Pratyay Ganguli
 */

public class ServerConfig {
    private int port;
    private String host;

    public ServerConfig(int port, String host) {
        this.port = port;
        this.host = host;
    }

    public int getPort() {
        return port;
    }

    public String getHost() {
        return host;
    }
}
