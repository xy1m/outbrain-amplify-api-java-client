package com.xy1m.amplify.service;

import com.xy1m.amplify.model.ResultsInterest;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.internal.InterestEndpoint;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.resource.InterestTargeting;

public class InterestServiceImpl implements InterestService {

    private final Boolean performValidations;
    private final InterestEndpoint endpoint;

    public InterestServiceImpl(Boolean performValidations, InterestEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsInterest<InterestTargeting> search(Authentication auth, String term, Integer limit) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.search(accessToken, term, limit);
    }

    @Override
    public ResultsInterest<InterestTargeting> getAll(Authentication auth) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getAll(accessToken);
    }
}
