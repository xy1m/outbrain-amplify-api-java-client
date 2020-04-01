package com.xy1m.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.xy1m.Amplify;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.campaign.Campaign;
import com.xy1m.model.reference.types.CampaignObjective;
import com.xy1m.model.reference.objects.Targeting;
import com.xy1m.model.reference.types.Platform;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.math.BigDecimal;
import java.util.Arrays;

public class CampaignServiceImplTest {
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
    public void get() {
        Campaign campaign = amplify.getCampaignService().get(auth, "003e2ab0ce0abe32a3f576b8e4b85c855f");
        System.out.println(campaign);
    }

    @Test
    @Ignore
    public void update() {
        Campaign payload = new Campaign();
        payload.setId("00c63c1885fecc9dfa6a5bdbe9ac692de5");
        payload.setEnabled(false);
        payload.setName("George Test Campaign via SDK update");
        Campaign result = amplify.getCampaignService().update(auth, payload);
        System.out.println(result);
    }

    @Test
    @Ignore
    public void create() {
        Campaign payload = new Campaign();
        payload.setObjective(CampaignObjective.Traffic);
        payload.setName("George Test Campaign via SDK");
        payload.setEnabled(false);
        payload.setBudgetId("00a4903f01e6d848e7cf34b3f42dbc199b");
        payload.setCpc(BigDecimal.valueOf(0.5));

        Targeting targeting = new Targeting();
        targeting.setPlatform(Arrays.asList(Platform.DESKTOP));
        payload.setTargeting(targeting);
        Campaign result = amplify.getCampaignService().create(auth, payload);
        System.out.println(result);
    }
}