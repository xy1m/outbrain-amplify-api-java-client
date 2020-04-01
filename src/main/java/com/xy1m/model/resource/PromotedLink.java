package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

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
    "documentID",
    "onAirStatus",
    "cpcAdjustment"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotedLink {
    private String id;
    private String campaignId;
    private String text;
    private LocalDateTime lastModified;
    private LocalDateTime creationTime;
    private String url;
    private String sectionName;
    private ApprovalStatus approvalStatus;
    private String imageUrl;
    private String cachedImageUrl;
    private Boolean enabled;
    private Boolean archived;
    private String documentLanguage;
    private String baseUrl;
    private String documentID;
    private OnAirStatus onAirStatus;
    private BigDecimal cpcAdjustment;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCampaignId() {
        return campaignId;
    }

    public void setCampaignId(String campaignId) {
        this.campaignId = campaignId;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }

    public ApprovalStatus getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(ApprovalStatus approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getCachedImageUrl() {
        return cachedImageUrl;
    }

    public void setCachedImageUrl(String cachedImageUrl) {
        this.cachedImageUrl = cachedImageUrl;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getDocumentLanguage() {
        return documentLanguage;
    }

    public void setDocumentLanguage(String documentLanguage) {
        this.documentLanguage = documentLanguage;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    public void setBaseUrl(String baseUrl) {
        this.baseUrl = baseUrl;
    }

    public String getDocumentID() {
        return documentID;
    }

    public void setDocumentID(String documentID) {
        this.documentID = documentID;
    }

    public OnAirStatus getOnAirStatus() {
        return onAirStatus;
    }

    public void setOnAirStatus(OnAirStatus onAirStatus) {
        this.onAirStatus = onAirStatus;
    }

    public BigDecimal getCpcAdjustment() {
        return cpcAdjustment;
    }

    public void setCpcAdjustment(BigDecimal cpcAdjustment) {
        this.cpcAdjustment = cpcAdjustment;
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "status",
            "reasons",
            "isEditable"
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class ApprovalStatus {
        private ApprovalReviewStatus status;
        private List<String> reasons;
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
    }

    public enum ApprovalReviewStatus {
        Approved,
        Pending,
        Rejected
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonPropertyOrder({
            "onAir",
            "reason"
    })
    @JsonIgnoreProperties(ignoreUnknown = true)
    public static class OnAirStatus {
        private Boolean onAir;
        private String reason;
    }
}
