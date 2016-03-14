package com.henmory.NetworkManager;

/**
 * Created by dan on 16/3/11.
 */
public class NetworkManager {

    private final static String serverId = "132.4.2.2";
    private final static String port = "8080";

    public static String getPort() {
        return port;
    }

    public static String getServerId() {
        return serverId;
    }

    public boolean requestServer(String str){
        return  true;
    }
}
