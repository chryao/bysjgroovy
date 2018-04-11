package com.imryao.bysjgroovy

public class User implements Serializable {
    private String account
    private String password
    private String id

    String getId() {
        return id
    }

    void setId(String id) {
        this.id = id
    }

    String getAccount() {
        return account
    }

    void setAccount(String account) {
        this.account = account
    }

    String getPassword() {
        return password
    }

    void setPassword(String password) {
        this.password = password
    }
}
