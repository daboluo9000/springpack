package com.johnson.spring.profile;

public class EnvBean {

    private String env;

    public EnvBean(String env) {
        this.env = env;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }
}
