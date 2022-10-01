package com.password.store.server.client.db;

import javax.sql.RowSet;

/**
 * @author Pratyay Ganguli
 */
public interface PostgresDBClient {
    Integer store();
    RowSet read();
    Integer delete();
}
