package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "subSegments",
        "eligibleForLookalikeSegment"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubSegmentsMetadata {
    @JsonProperty("subSegments")
    private List<SubSegment> subSegments;
    @JsonProperty("eligibleForLookalikeSegment")
    private Boolean eligibleForLookalikeSegment;

    public List<SubSegment> getSubSegments() {
        return subSegments;
    }

    public void setSubSegments(List<SubSegment> subSegments) {
        this.subSegments = subSegments;
    }

    public Boolean getEligibleForLookalikeSegment() {
        return eligibleForLookalikeSegment;
    }

    public void setEligibleForLookalikeSegment(Boolean eligibleForLookalikeSegment) {
        this.eligibleForLookalikeSegment = eligibleForLookalikeSegment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SubSegmentsMetadata{");
        sb.append("subSegments=").append(subSegments);
        sb.append(", eligibleForLookalikeSegment=").append(eligibleForLookalikeSegment);
        sb.append('}');
        return sb.toString();
    }
}
