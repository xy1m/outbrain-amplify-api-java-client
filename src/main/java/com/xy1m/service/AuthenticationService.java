package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Authentication;


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
