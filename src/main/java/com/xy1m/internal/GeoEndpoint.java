package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.resource.Geo;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.Query;

import java.util.List;

public interface GeoEndpoint {
    @GET(Paths.API_PATH_PREFIX + "/locations/search")
    @Headers("ContentAddRequest-Type: application/json")
    List<Geo> search(@Header("OB-TOKEN-V1") String accessToken,
                     @Query("term") String term,
                     @Query("limit") Integer limit) throws APIException;
}
