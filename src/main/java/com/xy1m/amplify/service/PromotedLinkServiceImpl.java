package com.xy1m.amplify.service;

import com.google.common.base.Joiner;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.resource.Enabled;
import com.xy1m.amplify.model.resource.PromotedLink;
import com.xy1m.amplify.model.resource.PromotedLinks;
import com.xy1m.amplify.internal.PromotedLinkEndpoint;
import com.xy1m.amplify.model.resource.PromotedLinkResponse;
import okhttp3.ResponseBody;

import java.util.List;
import java.util.Map;

public class PromotedLinkServiceImpl implements PromotedLinkService{
    public static final int HTTP_OK = 200;
    private final Boolean performValidations;
    private final PromotedLinkEndpoint endpoint;

    public PromotedLinkServiceImpl(Boolean performValidations, PromotedLinkEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public PromotedLink get(Authentication auth, String promotedLinkId) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.get(accessToken, promotedLinkId);
    }

    @Override
    public PromotedLink get(Authentication auth, String promotedLinkId, Integer imageWidth,
                            Integer imageHeight) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.get(accessToken, promotedLinkId, imageWidth, imageHeight);
    }

    @Override
    public PromotedLinks getByCampaign(Authentication auth, String campaignId, Map<String, String> params) {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getByCampaign(accessToken, campaignId, params);
    }

    @Override
    public boolean updateStatus(Authentication auth, List<String> promotedLinks, Boolean enabled) {
        String accessToken = auth.getToken().getAccessToken();
        ResponseBody responseBody = endpoint.updateStatus(accessToken, Joiner.on(",").join(promotedLinks)
                , new Enabled(enabled));
        return responseBody != null;
    }

    @Override
    public List<PromotedLinkResponse> updateAll(Authentication auth, String campaignId,
                                                List<PromotedLink> promotedLinks) {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.updateAll(accessToken, campaignId, promotedLinks);
    }

    @Override
    public PromotedLink create(Authentication auth, String campaignId, PromotedLink promotedLink) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.create(accessToken, campaignId, promotedLink);
    }

    @Override
    public List<PromotedLinkResponse> create(Authentication auth, String campaignId, List<PromotedLink> promotedLinks)
            throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.create(accessToken, campaignId, promotedLinks);
    }
}
