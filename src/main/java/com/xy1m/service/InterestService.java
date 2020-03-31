package com.xy1m.service;

import com.xy1m.exceptions.APIException;
import com.xy1m.model.ResultsInterest;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.Interest;


public interface InterestService {
    ResultsInterest<Interest> search(Authentication auth, String term, Integer limit) throws APIException;

    ResultsInterest<Interest> getAll(Authentication auth) throws APIException;
}
