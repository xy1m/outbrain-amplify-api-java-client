package com.xy1m.model.campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.reference.objects.OperationStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "operationStatus",
        "id",
        "campaign"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SingleCampaignUpdateResponse {
    @JsonProperty("operationStatus")
    private OperationStatus operationStatus;
    @JsonProperty("id")
    private String id;
    @JsonProperty("campaign")
    private Campaign campaign;

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Campaign getCampaign() {
        return campaign;
    }

    public void setCampaign(Campaign campaign) {
        this.campaign = campaign;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SingleCampaignUpdateResponse{");
        sb.append("operationStatus=").append(operationStatus);
        sb.append(", id='").append(id).append('\'');
        sb.append(", campaign=").append(campaign);
        sb.append('}');
        return sb.toString();
    }
}
