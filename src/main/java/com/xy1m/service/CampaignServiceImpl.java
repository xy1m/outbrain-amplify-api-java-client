package com.xy1m.service;

import com.google.common.base.Splitter;
import com.google.common.collect.Sets;
import com.xy1m.exceptions.APIException;
import com.xy1m.internal.CampaignEndpoint;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.campaign.Campaign;

import java.util.List;
import java.util.Set;

import static com.google.common.base.Preconditions.checkArgument;
import static org.apache.logging.log4j.util.Strings.isNotBlank;


public class CampaignServiceImpl implements CampaignService {
    private final Set<String> extraFieldSet = Sets.newHashSet("CustomAudience", "Locations", "InterestsTargeting",
            "BidBySections",
            "BlockedSites", "PlatformTargeting", "CampaignOptimization", "Scheduling");
    private final Boolean performValidations;
    private final CampaignEndpoint endpoint;

    public CampaignServiceImpl(Boolean performValidations, CampaignEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public Campaign get(Authentication auth, String id) throws APIException {
        return get(auth, id, null);
    }

    @Override
    public Campaign get(Authentication auth, String id, String extraFields) throws APIException {
        if (performValidations && isNotBlank(extraFields)) {
            List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
            for (String extra : extraFieldList) {
                checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
            }
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.get(accessToken, id, extraFields);
    }

    @Override
    public Campaign update(Authentication auth, Campaign campaign) throws APIException {
        return update(auth, campaign, null);
    }

    @Override
    public Campaign update(Authentication auth, Campaign campaign, String extraFields) throws APIException {
        if (performValidations && isNotBlank(extraFields)) {
            List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
            for (String extra : extraFieldList) {
                checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
            }
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.update(accessToken, campaign.getId(), extraFields, campaign);
    }

    @Override
    public Campaign create(Authentication auth, Campaign campaign) throws APIException {
        return create(auth, campaign, null);
    }

    @Override
    public Campaign create(Authentication auth, Campaign campaign, String extraFields) throws APIException {
        if (performValidations && isNotBlank(extraFields)) {
            List<String> extraFieldList = Splitter.on(",").trimResults().splitToList(extraFields);
            for (String extra : extraFieldList) {
                checkArgument(extraFieldSet.contains(extra), "Extra Field is not supported: " + extra);
            }
        }
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.create(accessToken, extraFields, campaign);
    }
}
