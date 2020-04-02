package com.xy1m.amplify.service;

import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.resource.GeoLocation;

import java.util.List;


public interface GeoService {
    List<GeoLocation> search(Authentication auth, String term, Integer limit) throws APIException;
}
