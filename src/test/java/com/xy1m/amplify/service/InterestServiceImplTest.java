package com.xy1m.amplify.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.amplify.Amplify;
import com.xy1m.amplify.internal.config.SerializationConfig;
import com.xy1m.amplify.internal.serialization.SerializationMapperCreator;
import com.xy1m.amplify.model.ResultsInterest;
import com.xy1m.amplify.model.auth.Authentication;
import com.xy1m.amplify.model.resource.InterestTargeting;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class InterestServiceImplTest {
    private static Amplify amplify;
    private static Authentication auth;
    private static ObjectMapper objectMapper;

    /**
     * Token expires in 24 hours so testing is ok
     */
    @BeforeClass
    public static void setUp() {
        amplify = Amplify.builder().build();
        auth = amplify.getAuthenticationService().authenticate("MTU4NDgzMDk1MDY5MzoxYTA3Y2I0YTBiYjI0MzA5MWNiMGE3ODNlMjNkZDNiYmNkYjYzODlhY2VhYTVjMzdmYzA1MTU5YjcwN2U3YTIyNjM2M2JhNGI1ZmRlYmYyNGUyNDk4OTg4M2FkNzAxMjE5Njg2OGVlMzkwOTY5NDI2NGU5OWVmMTkwNzU1YWI4MTE1OTZhZjdjMTg1ZTg4YzM2MjVjMDMyOWIxMTg1YjJmMmU4ZWQ2MzYzMGQxOTUzOTkxYjg1YjMxYmU5NDJmODRiN2FkNmE1Mjk5YTFiMzE1NmFlNWQ0NDY2MGZiYjU2YmVjNjU5OWRlNjQ2YTM0MTU5MDFhZTIxYTQyYzIyOWE4MzI5ZTE2NjMzZTViMzFmNDRjZmFiYzRiMzE2YTFhN2E1ODE5NzMxNTNiNzViMGQ2YTY5MjAyMzZiOTRmYzMwNGU5YjZlM2UxZDYyODA4MDc2YzViZjRjN2IwNTUxYTE2ZGYxZWM0ZGZkZTkzY2NkNjcwZDM2MWY1NWNhMWVjNjA4NjYyOWU5NTE2NjBhMjAwODk3ZTMyNDBjNzE1ZmFkYzMyZDUyYjI5NThhYjM5MDczNjBlYjkxMTY1ZmFiODM1ZmVmODUxNDRiODVjZjVmOTIzMGZkM2JmMTQ3YWRiYjllMmM1ZDBiZmEzMThlYjc0NThiN2IzZjQwNjczNjczMDp7ImNhbGxlckFwcGxpY2F0aW9uIjoiQW1lbGlhIiwiaXBBZGRyZXNzIjoiNzEuMjAyLjQ0LjEyMCIsImJ5cGFzc0FwaUF1dGgiOiJmYWxzZSIsInVzZXJOYW1lIjoiaW5Qb3dlcmVkIiwidXNlcklkIjoiMTAyOTQxMjIiLCJkYXRhU291cmNlVHlwZSI6Ik1ZX09CX0NPTSJ9OjNiMTM0ZGZmNzBkNmQyZTM3ZGU0Zjc5ODc5NjcwNGUzMGZlNjUwZmZkZWNkNDFjNWI0Mjk3YWI2ZjliMjQ1ODkxZDIwMzEwMmVmMTQ0ZTdkNzA2OWVkOTIzYTNiMTljNGFhYzM5ZTRiZDE4NDExOGYzMGQwMjczYTk4MjA0MTAw");
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void search() throws JsonProcessingException {
        ResultsInterest<InterestTargeting> interests = amplify.getInterestService().search(auth, "Credit", 6);
        System.out.println(objectMapper.writeValueAsString(interests));
    }

    @Test
    @Ignore
    public void getAll() throws JsonProcessingException {
        ResultsInterest<InterestTargeting> interests = amplify.getInterestService().getAll(auth);
        System.out.println(objectMapper.writeValueAsString(interests));
    }
}