package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.PromotedLink;
import com.xy1m.model.resource.PromotedLinkResponse;
import com.xy1m.model.resource.PromotedLinks;

import java.util.List;
import java.util.Map;

public interface PromotedLinkService {
    PromotedLink get(Authentication auth, String promotedLinkId) throws APIException;

    PromotedLink get(Authentication auth, String promotedLinkId, Integer imageWidth,
                              Integer imageHeight) throws APIException;

    PromotedLinks getByCampaign(Authentication auth, String campaignId, Map<String, String> params);

    boolean updateStatus(Authentication auth, List<String> promotedLinks, Boolean enabled);

    List<PromotedLinkResponse> updateAll(Authentication auth, String campaignId,
                                         List<PromotedLink> promotedLinks);

    PromotedLink create(Authentication auth, String campaignId, PromotedLink promotedLink) throws APIException;

    List<PromotedLinkResponse> create(Authentication auth, String campaignId, List<PromotedLink> promotedLinks)
            throws APIException;
}
