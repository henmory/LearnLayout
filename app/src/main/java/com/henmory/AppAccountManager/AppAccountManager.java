package com.henmory.AppAccountManager;
/**
 * Created by dan on 16/3/11.
 */
public class AppAccountManager {

    private String appAccount; //account
    private String appPassword; //password

    public String getAppPassword() {
        return appPassword;
    }

    public void setAppPassword(String appPassword) {
        this.appPassword = appPassword;
    }

    public String getAppAccount() {
        return appAccount;
    }

    public void setAppAccount(String appAccount) {
        this.appAccount = appAccount;
    }


    public boolean loginAppAccount(String account, String password) {
        if ((account.length() == 0) || (0 == password.length()))
            return false;
        return true;
    }

    public boolean logoutAppAccount() {
        return true;
    }

    public boolean registerAppAccount() {
        return true;
    }

    public boolean modifyAppPassword(String newPassword) {
        return true;
    }

    public boolean forgetAppPassword() {
        return true;
    }
    public boolean saveAppPassword(String account, String password){
        return true;
    }
}
