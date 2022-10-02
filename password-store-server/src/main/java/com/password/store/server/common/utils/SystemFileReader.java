package com.password.store.server.common.utils;

import com.password.store.server.common.pojo.Response;

/**
 * @author Pratyay Ganguli
 */

public interface SystemFileReader {
    Response readFile(String pathToFile);

}
