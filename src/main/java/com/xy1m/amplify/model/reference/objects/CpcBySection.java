package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "sectionId",
        "sectionName",
        "publisherId",
        "cpcAdjustment",
        "campaignId",
        "sectionId",
        "creationTime",
        "lastModified"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CpcBySection {
    @JsonProperty("sectionId")
    private String sectionId;
    @JsonProperty("sectionName")
    private String sectionName;
    @JsonProperty("publisherId")
    private String publisherId;
    @JsonProperty("cpcAdjustment")
    private BigDecimal cpcAdjustment;
    @JsonProperty("campaignId")
    private String campaignId;
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @JsonProperty("lastModified")
    private LocalDateTime lastModified;

    public String getSectionId() {
        return sectionId;
    }

    public void setSectionId(String sectionId) {
        this.sectionId = sectionId;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public BigDecimal getCpcAdjustment() {
        return cpcAdjustment;
    }

    public void setCpcAdjustment(BigDecimal cpcAdjustment) {
        this.cpcAdjustment = cpcAdjustment;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CpcBySection{");
        sb.append("sectionId='").append(sectionId).append('\'');
        sb.append(", sectionName='").append(sectionName).append('\'');
        sb.append(", publisherId='").append(publisherId).append('\'');
        sb.append(", cpcAdjustment=").append(cpcAdjustment);
        sb.append(", campaignId='").append(campaignId).append('\'');
        sb.append(", creationTime=").append(creationTime);
        sb.append(", lastModified=").append(lastModified);
        sb.append('}');
        return sb.toString();
    }
}
