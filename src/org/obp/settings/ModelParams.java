package org.obp.settings;

public class ModelParams {
    String host;
    String consumerKey;

    String log;
    String pas;

    public ModelParams() {
    }

    public ModelParams(String host, String consumerKey, String log, String pas) {
        this.host = host;
        this.consumerKey = consumerKey;

        this.log = log;
        this.pas = pas;
    }

    public String getHost() {
        return host;
    }

    public String getConsumerKey() {
        return consumerKey;
    }


    public String getLog() {
        return log;
    }

    public String getPas() {
        return pas;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public void setConsumerKey(String consumerKey) {
        this.consumerKey = consumerKey;
    }

    public void setLog(String log) {
        this.log = log;
    }

    public void setPas(String pas) {
        this.pas = pas;
    }

    public ModelParams copy() {
        return new ModelParams(host,consumerKey, log, pas);
    }
}
