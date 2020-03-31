package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Geo;

import java.util.List;


public interface GeoService {
    List<Geo> search(Authentication auth, String term, Integer limit) throws APIException;
}
