package org.obp.settings;

public class ModelParams {
    String host;
    String consumerKey;
    String consumerSecret;
    String login;
    String password;

    public ModelParams(String host, String consumerKey, String consumerSecret, String login, String password) {
        this.host = host;
        this.consumerKey = consumerKey;
        this.consumerSecret = consumerSecret;
        this.login = login;
        this.password = password;
    }

    public String getHost() {
        return host;
    }

    public String getConsumerKey() {
        return consumerKey;
    }

    public String getConsumerSecret() {
        return consumerSecret;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }
}
