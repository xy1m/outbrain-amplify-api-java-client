package com.xy1m.amplify.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "onAir",
        "reason"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class OnAirStatus {
    private Boolean onAir;
    private String reason;

    @JsonProperty("onAir")
    public Boolean getOnAir() {
        return onAir;
    }

    public void setOnAir(Boolean onAir) {
        this.onAir = onAir;
    }

    @JsonProperty("reason")
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        return "OnAirStatus{" +
                "onAir=" + onAir +
                ", reason='" + reason + '\'' +
                '}';
    }
}
