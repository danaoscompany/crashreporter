package com.dn.crashreporter;

import java.io.Serializable;

public class Info implements Serializable {
    private String title;
    private String userName;

    public static class Builder {
        Info info;

        public Builder() {
            info = new Info();
        }

        public Builder setReportTitle(String title) {
            info.title = title;
            return this;
        }

        public Builder setUserName(String userName) {
            info.userName = userName;
            return this;
        }

        public Info build() {
            return info;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getUserName() {
        return userName;
    }
}
