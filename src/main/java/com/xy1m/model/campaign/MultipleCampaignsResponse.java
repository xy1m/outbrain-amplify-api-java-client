package com.xy1m.model.campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "totalCount",
        "count",
        "campaigns"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class MultipleCampaignsResponse {
    @JsonProperty("totalCount")
    private Long totalCount;
    @JsonProperty("count")
    private Long count;
    @JsonProperty("campaigns")
    private List<Campaign> campaigns;

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public List<Campaign> getCampaigns() {
        return campaigns;
    }

    public void setCampaigns(List<Campaign> campaigns) {
        this.campaigns = campaigns;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MultipleCampaignsResponse{");
        sb.append("totalCount=").append(totalCount);
        sb.append(", count=").append(count);
        sb.append(", campaigns=").append(campaigns);
        sb.append('}');
        return sb.toString();
    }
}
