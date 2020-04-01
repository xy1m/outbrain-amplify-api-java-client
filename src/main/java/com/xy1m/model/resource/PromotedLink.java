package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "id",
    "campaignId",
    "text",
    "lastModified",
    "creationTime",
    "url",
    "sectionName",
    "approvalStatus",
    "imageUrl",
    "cachedImageUrl",
    "enabled",
    "archived",
    "documentLanguage",
    "baseUrl",
    "documentId",
    "onAirStatus",
    "cpcAdjustment"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotedLink {
    private String id;
    private String campaignId;
    private String text;
    private String lastModified;
    private String creationTime;
    private String url;
    private String sectionName;
    private ApprovalStatus approvalStatus;
    private String imageUrl;
    private String cachedImageUrl;
    private Boolean enabled;
    private Boolean archived;
    private String documentLanguage;
    private String baseUrl;
    private String documentId;
    private OnAirStatus onAirStatus;
    private BigDecimal cpcAdjustment;

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("campaignId")
    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("lastModified")
    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    @JsonProperty("creationTime")
    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("sectionName")
    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    @JsonProperty("approvalStatus")
    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    @JsonProperty("imageUrl")
    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    @JsonProperty("cachedImageUrl")
    public String getCachedImageUrl() {
        return cachedImageUrl;
    }

    public void setCachedImageUrl(String cachedImageUrl) {
        this.cachedImageUrl = cachedImageUrl;
    }

    @JsonProperty("enabled")
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    @JsonProperty("archived")
    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @JsonProperty("documentLanguage")
    public String getDocumentLanguage() {
        return documentLanguage;
    }

    public void setDocumentLanguage(String documentLanguage) {
        this.documentLanguage = documentLanguage;
    }

    @JsonProperty("baseUrl")
    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    @JsonProperty("documentId")
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    @JsonProperty("onAirStatus")
    public OnAirStatus getOnAirStatus() {
        return onAirStatus;
    }

    public void setOnAirStatus(OnAirStatus onAirStatus) {
        this.onAirStatus = onAirStatus;
    }

    @JsonProperty("cpcAdjustment")
    public BigDecimal getCpcAdjustment() {
        return cpcAdjustment;
    }

    public void setCpcAdjustment(BigDecimal cpcAdjustment) {
        this.cpcAdjustment = cpcAdjustment;
    }

    @Override
    public String toString() {
        return "PromotedLink{" +
                "id='" + id + '\'' +
                ", campaignId='" + campaignId + '\'' +
                ", text='" + text + '\'' +
                ", lastModified=" + lastModified +
                ", creationTime=" + creationTime +
                ", url='" + url + '\'' +
                ", sectionName='" + sectionName + '\'' +
                ", approvalStatus=" + approvalStatus +
                ", imageUrl='" + imageUrl + '\'' +
                ", cachedImageUrl='" + cachedImageUrl + '\'' +
                ", enabled=" + enabled +
                ", archived=" + archived +
                ", documentLanguage='" + documentLanguage + '\'' +
                ", baseUrl='" + baseUrl + '\'' +
                ", documentId='" + documentId + '\'' +
                ", onAirStatus=" + onAirStatus +
                ", cpcAdjustment=" + cpcAdjustment +
                '}';
    }
}
