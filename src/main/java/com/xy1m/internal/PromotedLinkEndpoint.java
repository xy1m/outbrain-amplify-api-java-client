package com.xy1m.internal;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.resource.Enabled;
import com.xy1m.model.resource.PromotedLink;
import com.xy1m.model.resource.PromotedLinkResponse;
import com.xy1m.model.resource.PromotedLinks;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Headers;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.QueryMap;

import java.util.List;
import java.util.Map;

public interface PromotedLinkEndpoint {
    @GET(Paths.API_PATH_PREFIX + "/promotedLinks/{id}")
    PromotedLink get(@Header("OB-TOKEN-V1") String accessToken, @Path("id") String promotedLinkId);

    @GET(Paths.API_PATH_PREFIX + "/promotedLinks/{id}")
    PromotedLink get(@Header("OB-TOKEN-V1") String accessToken,
                     @Path("id") String promotedLinkId,
                     @Query("promotedLinkImageWidth") Integer imageWidth,
                     @Query("promotedLinkImageHeight") Integer imageHeight);

    @GET(Paths.API_PATH_PREFIX + "/campaigns/{campaignId}/promotedLinks")
    PromotedLinks getByCampaign(@Header("OB-TOKEN-V1") String accessToken,
                                @Path("campaignId") String campaignId,
                                @QueryMap Map<String, String> params);

    @PUT(Paths.API_PATH_PREFIX + "/promotedLinks/{ids}")
    @Headers("Content-Type: application/json")
    void updateStatus(@Header("OB-TOKEN-V1") String accessToken,
                      @Path("ids") List<String> promotedLinkIds,
                      @Body Enabled enabled);

    @PUT(Paths.API_PATH_PREFIX + "/campaigns/{campaignId}/promotedLinks")
    @Headers("Content-Type: application/json")
    List<PromotedLinkResponse> updateAll(@Header("OB-TOKEN-V1") String accessToken,
                @Path("campaignId") String campaignId,
                @Body List<PromotedLink> promotedLinks);

    @POST(Paths.API_PATH_PREFIX + "/campaigns/{campaignId}/promotedLinks")
    @Headers("Content-Type: application/json")
    PromotedLink create(@Header("OB-TOKEN-V1") String accessToken,
                @Path("campaignId") String campaignId,
                @Body PromotedLink promotedLink) throws APIException;

    @POST(Paths.API_PATH_PREFIX + "/campaigns/{campaignId}/multiplePromotedLinks")
    @Headers("Content-Type: application/json")
    List<PromotedLinkResponse> create(@Header("OB-TOKEN-V1") String accessToken,
                                      @Path("campaignId") String campaignId,
                                      @Body List<PromotedLink> promotedLink) throws APIException;
}
