package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.internal.GeoEndpoint;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Geo;

import java.util.List;

public class GeoServiceImpl implements GeoService {

    private final Boolean performValidations;
    private final GeoEndpoint endpoint;

    public GeoServiceImpl(Boolean performValidations, GeoEndpoint endpoint) {
        this.performValidations = performValidations;
        this.endpoint = endpoint;
    }

    @Override
    public List<Geo> search(Authentication auth, String term, Integer limit) throws APIException {
        String accessToken = auth.getToken().getAccessToken();
        return endpoint.search(accessToken, term, limit);
    }
}
