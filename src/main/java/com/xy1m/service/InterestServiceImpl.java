package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.internal.InterestEndpoint;
import com.xy1m.model.ResultsInterest;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Interest;

public class InterestServiceImpl implements InterestService {

    private final Boolean performValidations;
    private final InterestEndpoint endpoint;

    public InterestServiceImpl(Boolean performValidations, InterestEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public ResultsInterest<Interest> search(Authentication auth, String term, Integer limit) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.search(accessToken, term, limit);
    }

    @Override
    public ResultsInterest<Interest> getAll(Authentication auth) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.getAll(accessToken);
    }
}
