package com.xy1m.service;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import com.xy1m.exceptions.APIException;
import com.xy1m.internal.CampaignEndpoint;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.campaign.Campaign;
import com.xy1m.model.campaign.MultipleCampaignsResponse;
import com.xy1m.model.campaign.SingleCampaignUpdateResponse;
import com.xy1m.model.reference.types.FetchType;
import com.xy1m.model.resource.GeoLocation;

import java.util.List;
import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.logging.log4j.util.Strings.isNotBlank;


public class CampaignServiceImpl implements CampaignService {
    private final Set<String> extraFieldSet = Sets.newHashSet("CustomAudience", "Locations", "InterestsTargeting",
            "BidBySections",
            "CampaignBlockedSites", "PlatformTargeting", "CampaignOptimization", "Scheduling");
    private final Boolean performValidations;
    private final CampaignEndpoint endpoint;

    public CampaignServiceImpl(Boolean performValidations, CampaignEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public Campaign get(Authentication auth, String id, String extraFields) throws APIException {
        if (performValidations) {
            if (isNotBlank(extraFields)) {
                List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
                for (String extra : extraFieldList) {
                    checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
                }
            }
            checkArgument(id != null, "Id required");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.get(accessToken, id, extraFields);
    }

    @Override
    public Campaign update(Authentication auth, Campaign campaign, String extraFields) throws APIException {
        if (performValidations) {
            if (isNotBlank(extraFields)) {
                List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
                for (String extra : extraFieldList) {
                    checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
                }
            }
            checkArgument(campaign != null, "Campaign required");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.update(accessToken, campaign.getId(), extraFields, campaign);
    }

    @Override
    public Campaign create(Authentication auth, Campaign campaign, String extraFields) throws APIException {
        if (performValidations) {
            if (isNotBlank(extraFields)) {
                List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
                for (String extra : extraFieldList) {
                    checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
                }
            }
            checkArgument(campaign != null, "Campaign required");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.create(accessToken, extraFields, campaign);
    }

    @Override
    public List<SingleCampaignUpdateResponse> batchUpdate(Authentication auth, String extraFields, List<Campaign> campaigns) {
        if (performValidations) {
            if (isNotBlank(extraFields)) {
                List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
                for (String extra : extraFieldList) {
                    checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
                }
            }
            checkArgument(campaigns != null && !campaigns.isEmpty(), "Campaigns required");
            checkArgument(campaigns.size() <= 25, "Update up to 25 campaigns once");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.batchUpdate(accessToken, extraFields, campaigns);
    }

    @Override
    public MultipleCampaignsResponse batchGet(Authentication auth, List<String> ids, String extraFields) {
        if (performValidations) {
            checkArgument(ids != null && !ids.isEmpty(), "Ids required");
            checkArgument(ids.size() <= 50, "Retrieve up to 50 campaigns once");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.batchGet(accessToken, Joiner.on(",").join(ids), extraFields);
    }

    @Override
    public MultipleCampaignsResponse getByBudgetId(Authentication auth, String budgetId) {
        if (performValidations) {
            checkArgument(budgetId != null, "budgetId required");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getByBudgetId(accessToken, budgetId);
    }

    @Override
    public MultipleCampaignsResponse getByMarketerId(Authentication auth,
                                                     String marketerId,
                                                     Boolean includeArchived,
                                                     FetchType fetch,
                                                     String extraFields,
                                                     Integer limit,
                                                     Integer offset) {
        if (performValidations) {
            checkArgument(marketerId != null, "marketerId required");
            checkArgument(limit <= 50, "Max limit is 50");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getByMarketerId(accessToken, marketerId, includeArchived, fetch, extraFields, limit, offset);
    }

    @Override
    public List<GeoLocation> getGeoLocationsByCampaignId(Authentication auth, String campaignId) {
        if (performValidations) {
            checkArgument(campaignId != null, "campaignId required");
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getGeoLocationsByCampaignId(accessToken, campaignId);
    }
}
