package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.internal.AuthenticationEndpoint;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.auth.BasicAuthenticationDetails;
import com.xy1m.model.auth.Token;

import java.util.Objects;

public class AuthenticationServiceImpl implements AuthenticationService {

    private final AuthenticationEndpoint endpoint;

    public AuthenticationServiceImpl(AuthenticationEndpoint endpoint) {
        this.endpoint = endpoint;
    }

    @Override
    public Authentication generateAuthentication(String username, String password) throws APIException {
        BasicAuthenticationDetails details = new BasicAuthenticationDetails(username, password);
        return new Authentication(details, endpoint.getAuthToken(details.getBasicBase64Encoded()));
    }

    @Override
    public Authentication authenticate(String accessToken) {
        Objects.requireNonNull(accessToken, "access token is null");
        Token token = new Token();
        token.setAccessToken(accessToken);
        return new Authentication(null, token);
    }
}
