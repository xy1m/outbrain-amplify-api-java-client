package com.xy1m.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Maps;
import com.xy1m.Amplify;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.PromotedLink;
import com.xy1m.model.resource.PromotedLinks;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class PromotedLinkServiceImplTest {
    private static Amplify amplify;
    private static Authentication auth;
    private static ObjectMapper objectMapper;

    @BeforeClass
    public static void setUp() {
        amplify = Amplify.builder()
                .setDebug(true)
                .build();

        String accessToken = "MTU4NDgzMDk1MDY5MzoxYTA3Y2I0YTBiYjI0MzA5MWNiMGE3ODNlMj" +
                "NkZDNiYmNkYjYzODlhY2VhYTVjMzdmYzA1MTU5YjcwN2U3YTIyNjM2M2JhNGI1ZmRlY" +
                "mYyNGUyNDk4OTg4M2FkNzAxMjE5Njg2OGVlMzkwOTY5NDI2NGU5OWVmMTkwNzU1YWI4MTE1OTZhZ" +
                "jdjMTg1ZTg4YzM2MjVjMDMyOWIxMTg1YjJmMmU4ZWQ2MzYzMGQxOTUzOTkxYjg1YjMxYmU5NDJmODRiN2FkNm" +
                "E1Mjk5YTFiMzE1NmFlNWQ0NDY2MGZiYjU2YmVjNjU5OWRlNjQ2YTM0MTU5MDFhZTIxYTQyYzIyOWE4Mz" +
                "I5ZTE2NjMzZTViMzFmNDRjZmFiYzRiMzE2YTFhN2E1ODE5NzMxNTNiNzViMGQ2YTY5MjAyMzZiOTRmYzMwNGU5Yj" +
                "ZlM2UxZDYyODA4MDc2YzViZjRjN2IwNTUxYTE2ZGYxZWM0ZGZkZTkzY2NkNjcwZDM2MWY1NWNhMWVjNjA4NjYyOWU5NTE2Nj" +
                "BhMjAwODk3ZTMyNDBjNzE1ZmFkYzMyZDUyYjI5NThhYjM5MDczNjBlYjkxMTY1ZmFiODM1ZmVmODUxNDRiODVjZjVmOTIz" +
                "MGZkM2JmMTQ3YWR" +
                "iYjllMmM1ZDBiZmEzMThlYjc0NThiN2IzZjQwNjczNjczMDp7ImNhbGxlckFwcGxpY2F0aW9uIjoiQW1lb" +
                "GlhIiwiaXBBZGRyZXNzIjo" +
                "iNzEuMjAyLjQ0LjEyMCIsImJ5cGFzc0FwaUF1dGgiOiJmYWxzZSIsInVzZXJOYW1lIjoiaW5Qb3dlcmVkIiwidX" +
                "NlcklkIjoiMTAyOTQxMjIiLCJkYXRhU291cmNlVHlwZSI6Ik1ZX09CX0NPTSJ9OjNiMTM0ZGZmNzBkNmQyZTM3ZGU0Zjc5O" +
                "Dc5NjcwNGUzMGZlNjUwZmZkZWNkNDFjNWI0Mjk3YWI2ZjliMjQ1ODkxZDIwMzEwMmVmMTQ0ZTdkNzA2OWVkOTIz" +
                "YTNiMTljNGFhYzM5ZTRiZDE4NDExOGYzMGQwMjczYTk4MjA0MTAw";

        auth = amplify.getAuthenticationService().authenticate(accessToken);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    public void getById() {
        String promotedLinkId = "00c45e3a9f0289cd0087c6f338ab336d89";

        PromotedLink promotedLink = amplify
                .getPromotedLinkService()
                .get(auth, promotedLinkId);

        System.out.println(promotedLink);
    }

    @Test
    @Ignore
    public void getByCampaignId() {
        String campaignId = "003e2ab0ce0abe32a3f576b8e4b85c855f";
        PromotedLinks promotedLinks = amplify
                .getPromotedLinkService()
                .getByCampaign(auth, campaignId, Maps.newHashMap());

        System.out.println(promotedLinks);
    }
}
