package com.xy1m.service;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.xy1m.Amplify;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.serialization.SerializationMapperCreator;
import com.xy1m.model.auth.Authentication;
import com.xy1m.model.resource.PromotedLink;
import com.xy1m.model.resource.PromotedLinkResponse;
import com.xy1m.model.resource.PromotedLinks;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import java.util.List;

public class PromotedLinkServiceImplTest {
    private static Amplify amplify;
    private static Authentication auth;
    private static ObjectMapper objectMapper;

    @BeforeClass
    public static void setUp() {
        amplify = Amplify.builder()
                .setDebug(true)
                .build();

        String accessToken = "***";

        auth = amplify.getAuthenticationService().authenticate(accessToken);
        objectMapper = SerializationMapperCreator.createObjectMapper(new SerializationConfig());
    }

    @Test
    @Ignore
    public void getById() {
        String promotedLinkId = "***";

        PromotedLink promotedLink = amplify
                .getPromotedLinkService()
                .get(auth, promotedLinkId);

        System.out.println(promotedLink);
    }

    @Test
    @Ignore
    public void getByIdWithFilters() {
        String promotedLinkId = "***";

        PromotedLink promotedLink = amplify
                .getPromotedLinkService()
                .get(auth, promotedLinkId, 100, 100);

        System.out.println(promotedLink);
    }

    @Test
    @Ignore
    public void getByCampaignId() {
        String campaignId = "***";
        PromotedLinks promotedLinks = amplify
                .getPromotedLinkService()
                .getByCampaign(auth, campaignId, Maps.newHashMap());

        System.out.println(promotedLinks);
    }

    @Test
    @Ignore
    public void create() {
        String campaignId = "***";

        PromotedLink promotedLink = new PromotedLink();
        promotedLink.setUrl(""); //mandatory
        promotedLink.setEnabled(true); //mandatory
        promotedLink.setText(""); //optional
        promotedLink.setImageUrl(""); //optional
        promotedLink.setSectionName(""); //optional


        promotedLink = amplify
            .getPromotedLinkService()
            .create(auth, campaignId, promotedLink);

        System.out.println(promotedLink);
    }

    @Test
    @Ignore
    public void updateStatusAll() {
        List<String> promotedLinksId = Lists.newArrayList("");

        boolean success = amplify
                .getPromotedLinkService()
                .updateStatus(auth, promotedLinksId, true);

        System.out.println(success);
    }

    @Test
    @Ignore
    public void createAll() {
        String campaignId = "***";

        List<PromotedLink> promotedLinks = Lists.newArrayList();

        PromotedLink promotedLink = new PromotedLink();
        promotedLink.setUrl(""); //mandatory
        promotedLink.setEnabled(true); //mandatory
        promotedLink.setText(""); //optional
        promotedLink.setImageUrl(""); //optional
        promotedLink.setSectionName(""); //optional
        promotedLinks.add(promotedLink);

        List<PromotedLinkResponse> createdLinks = amplify
                .getPromotedLinkService()
                .create(auth, campaignId, promotedLinks);

        System.out.println(createdLinks);
    }
}
