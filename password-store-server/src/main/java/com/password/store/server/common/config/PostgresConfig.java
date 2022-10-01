package com.password.store.server.common.config;

/**
 * @author Pratyay Ganguli
 */

public class PostgresConfig {
    private int port;
    private String host;
    private String databaseName;
    private String password;

    public PostgresConfig(int port, String host, String databaseName, String password) {
        this.port = port;
        this.host = host;
        this.databaseName = databaseName;
        this.password = password;
    }

    public int getPort() {
        return port;
    }
    public String getHost() {
        return host;
    }

    public String getDatabaseName() {
        return databaseName;
    }

    public String getPassword() {
        return password;
    }
}
