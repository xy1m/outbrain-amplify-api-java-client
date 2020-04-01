package com.xy1m.model.reference;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({

})
@JsonIgnoreProperties(ignoreUnknown = true)
public class OnAirStatus {
    private Boolean onAir;
    private String reason;
}
