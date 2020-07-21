package eu.pstdio.appkey_rest_api.presentation.controller;

/**
 *
 * @author mib
 */
public interface AppKeyControllerApi <T> {
    T post(String json);
    T put(String json);
    T get(String json);
    T delete(String json);
    T getListFilterByOrderByFromUuidIdLimit(String json);
    T isValid(String json);
}
