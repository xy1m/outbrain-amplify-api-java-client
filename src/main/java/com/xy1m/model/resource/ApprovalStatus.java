package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "status",
        "reasons",
        "isEditable"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ApprovalStatus {
    private ApprovalReviewStatus status;
    private List<String> reasons;
    private Boolean isEditable;

    @JsonProperty("status")
    public ApprovalReviewStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalReviewStatus status) {
        this.status = status;
    }

    @JsonProperty("reasons")
    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    @JsonProperty("isEditable")
    public Boolean getEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    @Override
    public String toString() {
        return "ApprovalStatus{" +
                "status=" + status +
                ", reasons=" + reasons +
                ", isEditable=" + isEditable +
                '}';
    }
}
