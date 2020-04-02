package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "targetingCampaignsPerSegment",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TargetingCampaignsResponse {
    @JsonProperty("targetingCampaignsPerSegment")
    private List<TargetingCampaign> targetingCampaignsPerSegment;

    public List<TargetingCampaign> getTargetingCampaignsPerSegment() {
        return targetingCampaignsPerSegment;
    }

    public void setTargetingCampaignsPerSegment(List<TargetingCampaign> targetingCampaignsPerSegment) {
        this.targetingCampaignsPerSegment = targetingCampaignsPerSegment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TargetingCampaignsResponse{");
        sb.append("targetingCampaignsPerSegment=").append(targetingCampaignsPerSegment);
        sb.append('}');
        return sb.toString();
    }
}
