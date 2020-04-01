package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.GeoLocation;

import java.util.List;


public interface GeoService {
    List<GeoLocation> search(Authentication auth, String term, Integer limit) throws APIException;
}
