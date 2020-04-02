package com.xy1m.amplify.model.reference.types;

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
    @JsonProperty("status")
    private ApprovalReviewStatus status;
    @JsonProperty("reasons")
    private List<String> reasons;
    @JsonProperty("isEditable")
    private Boolean isEditable;

    public ApprovalReviewStatus getStatus() {
        return status;
    }

    public void setStatus(ApprovalReviewStatus status) {
        this.status = status;
    }

    public List<String> getReasons() {
        return reasons;
    }

    public void setReasons(List<String> reasons) {
        this.reasons = reasons;
    }

    public Boolean getEditable() {
        return isEditable;
    }

    public void setEditable(Boolean editable) {
        isEditable = editable;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ApprovalStatus{");
        sb.append("status=").append(status);
        sb.append(", reasons=").append(reasons);
        sb.append(", isEditable=").append(isEditable);
        sb.append('}');
        return sb.toString();
    }
}
