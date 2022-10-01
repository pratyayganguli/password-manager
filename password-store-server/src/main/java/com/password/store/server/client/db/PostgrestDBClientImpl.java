package com.password.store.server.client.db;

import javax.sql.RowSet;

/**
 * @author Pratyay Ganguli
 */

public class PostgrestDBClientImpl implements PostgresDBClient{
    private PostgrestDBClientImpl postgrestDBClient;
    public PostgrestDBClientImpl(){
        postgrestDBClient = new PostgrestDBClientImpl();
    }

    @Override
    public Integer store() {
        return null;
    }
    @Override
    public RowSet read() {
        return null;
    }
    @Override
    public Integer delete() {
        return null;
    }
}
