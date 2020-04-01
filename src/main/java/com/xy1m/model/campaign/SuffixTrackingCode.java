package com.xy1m.model.campaign;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "promoted_link_id",
        "campaign_id",
        "section_id",
        "section_name",
        "source_id",
        "publisher_id",
        "publisher_name",
        "ob_click_id"
})
public class SuffixTrackingCode {
    @JsonProperty("promoted_link_id")
    private String promotedLinkId;
    @JsonProperty("campaign_id")
    private String campaignId;
    @JsonProperty("section_id")
    private String section_id;
    @JsonProperty("section_name")
    private String sectionName;
    @JsonProperty("source_id")
    private String sourceId;
    @JsonProperty("publisher_id")
    private String publisherId;
    @JsonProperty("publisher_name")
    private String publisherName;
    @JsonProperty("ob_click_id")
    private String obClickId;

    public String getPromotedLinkId() {
        return promotedLinkId;
    }

    public void setPromotedLinkId(String promotedLinkId) {
        this.promotedLinkId = promotedLinkId;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getSection_id() {
        return section_id;
    }

    public void setSection_id(String section_id) {
        this.section_id = section_id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getPublisherId() {
        return publisherId;
    }

    public void setPublisherId(String publisherId) {
        this.publisherId = publisherId;
    }

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    public String getObClickId() {
        return obClickId;
    }

    public void setObClickId(String obClickId) {
        this.obClickId = obClickId;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SuffixTrackingCode{");
        sb.append("promotedLinkId='").append(promotedLinkId).append('\'');
        sb.append(", campaignId='").append(campaignId).append('\'');
        sb.append(", section_id='").append(section_id).append('\'');
        sb.append(", sectionName='").append(sectionName).append('\'');
        sb.append(", sourceId='").append(sourceId).append('\'');
        sb.append(", publisherId='").append(publisherId).append('\'');
        sb.append(", publisherName='").append(publisherName).append('\'');
        sb.append(", obClickId='").append(obClickId).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
