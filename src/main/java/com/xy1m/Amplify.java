package com.xy1m;

import com.xy1m.internal.AuthenticationEndpoint;
import com.xy1m.internal.CommunicationFactory;
import com.xy1m.internal.GeoEndpoint;
import com.xy1m.internal.InterestEndpoint;
import com.xy1m.internal.config.CommunicationConfig;
import com.xy1m.internal.config.SerializationConfig;
import com.xy1m.internal.factories.AmplifyEndpointsFactory;
import com.xy1m.internal.factories.AmplifyEndpointsRetrofitFactory;
import com.xy1m.service.AuthenticationService;
import com.xy1m.service.AuthenticationServiceImpl;
import com.xy1m.service.GeoService;
import com.xy1m.service.GeoServiceImpl;
import com.xy1m.service.InterestService;
import com.xy1m.service.InterestServiceImpl;

public class Amplify {
    private static Amplify instance = Amplify.builder().build();
    private final AuthenticationService authenticationService;
    private final GeoService geoService;
    private final InterestService interestService;

    private Amplify(AuthenticationService authenticationService,
                    GeoService geoService,
                    InterestService interestService) {
        this.authenticationService = authenticationService;
        this.geoService = geoService;
        this.interestService = interestService;
    }

    public AuthenticationService getAuthenticationService() {
        return authenticationService;
    }

    public GeoService getGeoService() {
        return geoService;
    }

    public InterestService getInterestService() {
        return interestService;
    }

    public static Amplify getInstance() {
        return instance;
    }

    public static AmplifyBuilder builder() {
        return new AmplifyBuilder();
    }

    public static class AmplifyBuilder {
        private static final String DEFAULT_HOST = "https://api.outbrain.com/";
        private static final String DEFAULT_AUTH_HOST = "https://api.outbrain.com/";
        private static final String DEFAULT_USER_AGENT = "Amplify API Java Client";
        private static final String VERSION = "v1.0";
        private static final int DEFAULT_MAX_IDLE_CONNECTIONS = 5;
        private static final long DEFAULT_KEEP_ALIVE_DURATION_MILLIS = 300_000L;
        private static final SerializationConfig DEFAULT_SERIALIZATION_CONFIG = new SerializationConfig();

        private String baseUrl = DEFAULT_HOST;
        private String authBaseUrl = DEFAULT_AUTH_HOST;
        private String userAgent = DEFAULT_USER_AGENT;
        private long writeTimeoutMillis = 0L;
        private long connectionTimeoutMillis = 0L;
        private long readTimeoutMillis = 0L;
        private int maxIdleConnections = DEFAULT_MAX_IDLE_CONNECTIONS;
        private long keepAliveDurationMillis = DEFAULT_KEEP_ALIVE_DURATION_MILLIS;
        private boolean performClientValidations = true;
        private boolean debug = false;
        private boolean organizeDynamicColumns = true;
        private SerializationConfig serializationConfig = DEFAULT_SERIALIZATION_CONFIG;

        public AmplifyBuilder setBaseUrl(String baseUrl) {
            this.baseUrl = baseUrl;
            return this;
        }

        public AmplifyBuilder setAuthBaseUrl(String authBaseUrl) {
            this.authBaseUrl = authBaseUrl;
            return this;
        }

        public AmplifyBuilder setUserAgent(String userAgent) {
            this.userAgent = userAgent;
            return this;
        }

        public AmplifyBuilder setConnectionTimeoutMillis(Long connectionTimeoutMillis) {
            this.connectionTimeoutMillis = connectionTimeoutMillis;
            return this;
        }

        public AmplifyBuilder setReadTimeoutMillis(Long readTimeoutMillis) {
            this.readTimeoutMillis = readTimeoutMillis;
            return this;
        }

        public AmplifyBuilder setWriteTimeoutMillis(Long writeTimeoutMillis) {
            this.writeTimeoutMillis = writeTimeoutMillis;
            return this;
        }

        public AmplifyBuilder setMaxIdleConnections(Integer maxIdleConnections) {
            this.maxIdleConnections = maxIdleConnections;
            return this;
        }

        public AmplifyBuilder setKeepAliveDurationMillis(Long keepAliveDurationMillis) {
            this.keepAliveDurationMillis = keepAliveDurationMillis;
            return this;
        }

        public AmplifyBuilder setPerformClientValidations(Boolean performClientValidations) {
            this.performClientValidations = performClientValidations;
            return this;
        }

        public AmplifyBuilder setDebug(Boolean debug) {
            this.debug = debug;
            return this;
        }

        public AmplifyBuilder setOrganizeDynamicColumns(Boolean organizeDynamicColumns) {
            this.organizeDynamicColumns = organizeDynamicColumns;
            return this;
        }

        public AmplifyBuilder setSerializationConfig(SerializationConfig serializationConfig) {
            this.serializationConfig = serializationConfig;
            return this;
        }

        public Amplify build() {
            String finalUserAgent = String.format("RevContent/%s (%s)", VERSION, userAgent);
            CommunicationConfig config = new CommunicationConfig(baseUrl, authBaseUrl, connectionTimeoutMillis,
                    readTimeoutMillis, writeTimeoutMillis, maxIdleConnections, keepAliveDurationMillis,
                    finalUserAgent, debug);
            CommunicationFactory communicator = new CommunicationFactory(config, serializationConfig);
            AmplifyEndpointsFactory endpointsFactory = new AmplifyEndpointsRetrofitFactory(communicator);
            return new Amplify(
                    new AuthenticationServiceImpl(endpointsFactory.createAuthEndpoint(AuthenticationEndpoint.class)) {},
                    new GeoServiceImpl(performClientValidations,
                            endpointsFactory.createAuthEndpoint(GeoEndpoint.class)) {},
                    new InterestServiceImpl(performClientValidations,
                            endpointsFactory.createAuthEndpoint(InterestEndpoint.class)) {}
            );
        }
    }
}
