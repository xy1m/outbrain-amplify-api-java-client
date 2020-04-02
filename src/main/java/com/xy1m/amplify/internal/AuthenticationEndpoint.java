package com.xy1m.amplify.internal;

import com.xy1m.amplify.model.auth.Token;
import com.xy1m.amplify.exceptions.APIException;
import retrofit2.http.GET;
import retrofit2.http.Header;

public interface AuthenticationEndpoint {

    @GET(Paths.API_PATH_PREFIX + "/login")
    Token getAuthToken(@Header("Authorization") String auth) throws APIException;
}
