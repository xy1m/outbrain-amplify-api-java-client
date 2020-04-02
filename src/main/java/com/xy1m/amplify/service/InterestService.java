package com.xy1m.amplify.service;

import com.xy1m.amplify.model.ResultsInterest;
import com.xy1m.amplify.exceptions.APIException;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.resource.InterestTargeting;


public interface InterestService {
    ResultsInterest<InterestTargeting> search(Authentication auth, String term, Integer limit) throws APIException;

    ResultsInterest<InterestTargeting> getAll(Authentication auth) throws APIException;
}
