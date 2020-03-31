package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Token;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface AuthenticationEndpoint {

    @GET(Paths.API_PATH_PREFIX + "/login")
    Token getAuthToken(@Header("Authorization") String auth) throws APIException;
}
