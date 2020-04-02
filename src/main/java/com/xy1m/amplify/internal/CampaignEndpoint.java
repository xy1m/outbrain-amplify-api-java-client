package com.xy1m.amplify.internal;

import com.xy1m.amplify.model.campaign.Campaign;
import com.xy1m.amplify.model.resource.GeoLocation;
import com.xy1m.amplify.model.campaign.MultipleCampaignsResponse;
import com.xy1m.amplify.model.campaign.SingleCampaignUpdateResponse;
import com.xy1m.amplify.model.reference.types.FetchType;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

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

    @PUT(Paths.API_PATH_PREFIX + "/campaigns")
    @Headers("Content-Type: application/json")
    List<SingleCampaignUpdateResponse> batchUpdate(@Header("OB-TOKEN-V1") String accessToken,
                                                   @Query("extraFields") String extraFields,
                                                   @Body List<Campaign> campaigns);

    @GET(Paths.API_PATH_PREFIX + "/campaigns/{ids}")
    @Headers("Content-Type: application/json")
    MultipleCampaignsResponse batchGet(@Header("OB-TOKEN-V1") String accessToken,
                                       @Path("ids") String ids,
                                       @Query("extraFields") String extraFields);

    @GET(Paths.API_PATH_PREFIX + "/budgets/{budgetId}/campaigns")
    @Headers("Content-Type: application/json")
    MultipleCampaignsResponse getByBudgetId(@Header("OB-TOKEN-V1") String accessToken,
                                            @Path("budgetId") String budgetId);

    @GET(Paths.API_PATH_PREFIX + "/marketers/{marketerId}/campaigns")
    @Headers("Content-Type: application/json")
    MultipleCampaignsResponse getByMarketerId(@Header("OB-TOKEN-V1") String accessToken,
                                              @Path("marketerId") String marketerId,
                                              @Query("includeArchived") Boolean includeArchived,
                                              @Query("fetch") FetchType fetch,
                                              @Query("extraFields") String extraFields,
                                              @Query("limit") Integer limit,
                                              @Query("offset") Integer offset);

    @GET(Paths.API_PATH_PREFIX + "/campaigns/{campaignId}/locations")
    @Headers("Content-Type: application/json")
    List<GeoLocation> getGeoLocationsByCampaignId(@Header("OB-TOKEN-V1") String accessToken,
                                                  @Path("campaignId") String campaignId);

}
