package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.campaign.Campaign;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "segmentId",
        "includedCampaigns",
        "excludedCampaigns"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TargetingCampaign {
    @JsonProperty("segmentId")
    private String segmentId;
    @JsonProperty("includedCampaigns")
    private List<Campaign> includedCampaigns;
    @JsonProperty("excludedCampaigns")
    private List<Campaign> excludedCampaigns;

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public List<Campaign> getIncludedCampaigns() {
        return includedCampaigns;
    }

    public void setIncludedCampaigns(List<Campaign> includedCampaigns) {
        this.includedCampaigns = includedCampaigns;
    }

    public List<Campaign> getExcludedCampaigns() {
        return excludedCampaigns;
    }

    public void setExcludedCampaigns(List<Campaign> excludedCampaigns) {
        this.excludedCampaigns = excludedCampaigns;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TargetingCampaign{");
        sb.append("segmentId='").append(segmentId).append('\'');
        sb.append(", includedCampaigns=").append(includedCampaigns);
        sb.append(", excludedCampaigns=").append(excludedCampaigns);
        sb.append('}');
        return sb.toString();
    }
}
