package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.internal.PromotedLinkEndpoint;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Enabled;
import com.xy1m.model.resource.PromotedLink;
import com.xy1m.model.resource.PromotedLinkResponse;
import com.xy1m.model.resource.PromotedLinks;

import java.util.List;
import java.util.Map;

public class PromotedLinkServiceImpl implements PromotedLinkService{
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
    public void updateStatus(Authentication auth, List<String> promotedLinks, Boolean enabled) {
        String accessToken = auth.getToken().getAccessToken();
        endpoint.updateStatus(accessToken, promotedLinks, new Enabled(enabled));
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
