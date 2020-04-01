package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "reason"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class OperationStatus {
    @JsonProperty("status")
    private String status;
    @JsonProperty("reason")
    private String reason;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OperationStatus{");
        sb.append("status='").append(status).append('\'');
        sb.append(", reason='").append(reason).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
