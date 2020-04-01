package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.campaign.Campaign;


public interface CampaignService {
    Campaign get(Authentication auth, String id) throws APIException;

    Campaign get(Authentication auth, String id, String extraFields) throws APIException;

    Campaign update(Authentication auth, Campaign campaign) throws APIException;

    Campaign update(Authentication auth, Campaign campaign, String extraFields) throws APIException;

    Campaign create(Authentication auth, Campaign campaign) throws APIException;

    Campaign create(Authentication auth, Campaign campaign, String extraFields) throws APIException;
}
