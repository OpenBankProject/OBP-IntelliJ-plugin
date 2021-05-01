package org.obp.settings;

public class ModelParams {
    String host;
    String consumerKey;

    String login;
    String password;

    public ModelParams(String host, String consumerKey, String login, String password) {
        this.host = host;
        this.consumerKey = consumerKey;

        this.login = login;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public String getConsumerKey() {
        return consumerKey;
    }


    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
