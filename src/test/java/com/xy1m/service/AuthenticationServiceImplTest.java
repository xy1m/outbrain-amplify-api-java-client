package com.xy1m.service;

import com.xy1m.Amplify;
import com.xy1m.model.auth.Authentication;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class AuthenticationServiceImplTest {

    private static Amplify amplify;
    private static Authentication auth;

    @BeforeClass
    public static void setUp() {
        amplify = Amplify.builder().build();
    }

    @Test
    @Ignore
    public void generateAuthentication() {
        String username = "inPowered";
        String password = "inPowered101!";
        auth = amplify.getAuthenticationService().generateAuthentication(username, password);
        System.out.println(auth.getToken().getAccessToken());
    }

}