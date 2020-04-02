package com.xy1m.amplify.model.auth;

import java.util.Base64;

public class BasicAuthenticationDetails extends AuthenticationDetails {

    private final String username;
    private final String password;

    public BasicAuthenticationDetails(String username, String password) {
        super(GrantType.BASIC_AUTHENTICATION);
        this.username = username;
        this.password = password;
    }

    public String getBasicBase64Encoded() {
        return "Basic " + getBase64Encoded();
    }

    public String getBase64Encoded() {
        return Base64.getEncoder().encodeToString((username + ":" + password).getBytes());
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("BasicAuthenticationDetails{");
        sb.append("basic='").append(getBase64Encoded()).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
