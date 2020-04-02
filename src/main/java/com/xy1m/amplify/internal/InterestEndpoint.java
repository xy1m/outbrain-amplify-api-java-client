package com.xy1m.amplify.internal;

import com.xy1m.amplify.model.ResultsInterest;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.resource.InterestTargeting;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

public interface InterestEndpoint {
    @GET(Paths.API_PATH_PREFIX + "/interests/search")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsInterest<InterestTargeting> search(@Header("OB-TOKEN-V1") String accessToken,
                                              @Query("term") String term,
                                              @Query("limit") Integer limit) throws APIException;

    @GET(Paths.API_PATH_PREFIX + "/interests/all")
    @Headers("ContentAddRequest-Type: application/json")
    ResultsInterest<InterestTargeting> getAll(@Header("OB-TOKEN-V1") String accessToken) throws APIException;

}
