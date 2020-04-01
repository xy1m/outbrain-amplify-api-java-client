package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "inactiveReason"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SegmentAvailability {
    @JsonProperty("status")
    private String status;
    @JsonProperty("inactiveReason")
    private String inactiveReason;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getInactiveReason() {
        return inactiveReason;
    }

    public void setInactiveReason(String inactiveReason) {
        this.inactiveReason = inactiveReason;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SegmentAvailability{");
        sb.append("status='").append(status).append('\'');
        sb.append(", inactiveReason='").append(inactiveReason).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
