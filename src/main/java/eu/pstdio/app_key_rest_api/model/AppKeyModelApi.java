package eu.pstdio.app_key_rest_api.model;

/**
 *
 * @author mib
 */
public interface AppKeyModelApi {
    String getUuid();
    void setUUid(String uuid);
    String getAppKey();
    void setAppKey(String appKey);
    boolean isDisabled();
    void setDisabled(boolean disabled);
    Long getLastEditTime();
    void setLastEditTime(Long lastEdittime);
    
}
