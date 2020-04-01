package com.xy1m.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.Amplify;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.GeoLocation;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class GeoServiceImplTest {

    private static Amplify amplify;
    private static Authentication auth;
    private static ObjectMapper objectMapper;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        amplify = Amplify.builder().build();
        auth = amplify.getAuthenticationService().authenticate("***");
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void search() throws JsonProcessingException {
        List<GeoLocation> geos = amplify.getGeoService().search(auth, "United", 6);
        System.out.println(objectMapper.writeValueAsString(geos));
    }
}