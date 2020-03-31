package com.xy1m.model.auth;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "OB-TOKEN-V1"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Token {
    @JsonProperty("OB-TOKEN-V1")
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Token{");
        sb.append("obTokenV1='").append(accessToken).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
