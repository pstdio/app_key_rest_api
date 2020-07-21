package eu.pstdio.app_key_rest_api.business.service;

import eu.pstdio.app_key_rest_api.model.AppKeyModelApi;
import java.util.List;

/**
 *
 * @author mib
 */
public interface AppKeyServiceApi {
    boolean post(String json);
    boolean put(String json);
    AppKeyModelApi get(String json);
    boolean delete(String json);
    List<AppKeyModelApi> getListFilterByOrderByFromUuidIdLimit(String json);
    boolean isValid(String json);
}
