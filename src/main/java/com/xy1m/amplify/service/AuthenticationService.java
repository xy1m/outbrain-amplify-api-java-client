package com.xy1m.amplify.service;

import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.exceptions.APIException;


public interface AuthenticationService {
    /**
     * @param username username
     * @param password password
     * @return Authentication with token details and access token
     * @throws APIException APIException
     */
    Authentication generateAuthentication(String username, String password) throws APIException;

    Authentication authenticate(String accessToken);
}
