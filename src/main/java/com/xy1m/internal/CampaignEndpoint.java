package com.xy1m.internal;

import com.xy1m.model.campaign.Campaign;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface CampaignEndpoint {

    @GET(Paths.API_PATH_PREFIX + "/campaigns/{id}")
    @Headers("Content-Type: application/json")
    Campaign get(@Header("OB-TOKEN-V1") String accessToken,
                 @Path("id") String id,
                 @Query("extraFields") String extraFields);

    @PUT(Paths.API_PATH_PREFIX + "/campaigns/{id}")
    @Headers("Content-Type: application/json")
    Campaign update(@Header("OB-TOKEN-V1") String accessToken,
                    @Path("id") String id,
                    @Query("extraFields") String extraFields,
                    @Body Campaign campaign);

    @POST(Paths.API_PATH_PREFIX + "/campaigns")
    @Headers("Content-Type: application/json")
    Campaign create(@Header("OB-TOKEN-V1") String accessToken,
                    @Query("extraFields") String extraFields,
                    @Body Campaign campaign);
}
