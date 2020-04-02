package com.xy1m.amplify.model.reference.types;

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
    @JsonProperty("onAir")
    private Boolean onAir;
    @JsonProperty("reason")
    private String reason;

    public Boolean getOnAir() {
        return onAir;
    }

    public void setOnAir(Boolean onAir) {
        this.onAir = onAir;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OnAirStatus{");
        sb.append("onAir=").append(onAir);
        sb.append(", reason='").append(reason).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
