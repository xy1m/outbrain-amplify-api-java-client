package com.xy1m.model.campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy1m.annotations.ReadOnly;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Campaign {
    private String id;
    private String name;
    private String marketerId;
    private Boolean enabled;
    private BigDecimal cpc;
    @ReadOnly
    private BigDecimal minimumCpc;
    @ReadOnly
    private String currenty;
    private Boolean autoArchived;
    private Targeting targeting;
    private List<String> feeds;
    private Integer autoExpireationOfPromotedLinks;
    private ContentType contentType;
    @ReadOnly
    private Budget budget;
    @JsonProperty("budgetId")
    private String budgetId;
    private SuffixTrackingCode suffixTrackingCode;
    private PreixTrackingCode preixTrackingCode;
    private String lastModified;
    private String creationTime;
    private LiveStatus liveStatus;
    private Boolean cpcPerAdEnabled;
    private BlockedSites campaignBlockedSites;
    private String startHour;
    private List<TrackingPixel> trackingPixels;
    private List<Bid> bids;
    private Optimization campaignOptimization;
    private OnAirType onAirType;
    private SchedulingRules scheduling;
    private Objective objective;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarketerId() {
        return marketerId;
    }

    public void setMarketerId(String marketerId) {
        this.marketerId = marketerId;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public BigDecimal getCpc() {
        return cpc;
    }

    public void setCpc(BigDecimal cpc) {
        this.cpc = cpc;
    }

    public BigDecimal getMinimumCpc() {
        return minimumCpc;
    }

    public void setMinimumCpc(BigDecimal minimumCpc) {
        this.minimumCpc = minimumCpc;
    }

    public String getCurrenty() {
        return currenty;
    }

    public void setCurrenty(String currenty) {
        this.currenty = currenty;
    }

    public Boolean getAutoArchived() {
        return autoArchived;
    }

    public void setAutoArchived(Boolean autoArchived) {
        this.autoArchived = autoArchived;
    }

    public Targeting getTargeting() {
        return targeting;
    }

    public void setTargeting(Targeting targeting) {
        this.targeting = targeting;
    }

    public List<String> getFeeds() {
        return feeds;
    }

    public void setFeeds(List<String> feeds) {
        this.feeds = feeds;
    }

    public Integer getAutoExpireationOfPromotedLinks() {
        return autoExpireationOfPromotedLinks;
    }

    public void setAutoExpireationOfPromotedLinks(Integer autoExpireationOfPromotedLinks) {
        this.autoExpireationOfPromotedLinks = autoExpireationOfPromotedLinks;
    }

    public ContentType getContentType() {
        return contentType;
    }

    public void setContentType(ContentType contentType) {
        this.contentType = contentType;
    }

    public Budget getBudget() {
        return budget;
    }

    public void setBudget(Budget budget) {
        this.budget = budget;
    }

    public String getBudgetId() {
        return budgetId;
    }

    public void setBudgetId(String budgetId) {
        this.budgetId = budgetId;
    }


    public SuffixTrackingCode getSuffixTrackingCode() {
        return suffixTrackingCode;
    }

    public void setSuffixTrackingCode(SuffixTrackingCode suffixTrackingCode) {
        this.suffixTrackingCode = suffixTrackingCode;
    }

    public PreixTrackingCode getPreixTrackingCode() {
        return preixTrackingCode;
    }

    public void setPreixTrackingCode(PreixTrackingCode preixTrackingCode) {
        this.preixTrackingCode = preixTrackingCode;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(String creationTime) {
        this.creationTime = creationTime;
    }

    public LiveStatus getLiveStatus() {
        return liveStatus;
    }

    public void setLiveStatus(LiveStatus liveStatus) {
        this.liveStatus = liveStatus;
    }

    public Boolean getCpcPerAdEnabled() {
        return cpcPerAdEnabled;
    }

    public void setCpcPerAdEnabled(Boolean cpcPerAdEnabled) {
        this.cpcPerAdEnabled = cpcPerAdEnabled;
    }

    public BlockedSites getCampaignBlockedSites() {
        return campaignBlockedSites;
    }

    public void setCampaignBlockedSites(BlockedSites campaignBlockedSites) {
        this.campaignBlockedSites = campaignBlockedSites;
    }

    public String getStartHour() {
        return startHour;
    }

    public void setStartHour(String startHour) {
        this.startHour = startHour;
    }

    public List<TrackingPixel> getTrackingPixels() {
        return trackingPixels;
    }

    public void setTrackingPixels(List<TrackingPixel> trackingPixels) {
        this.trackingPixels = trackingPixels;
    }

    public List<Bid> getBids() {
        return bids;
    }

    public void setBids(List<Bid> bids) {
        this.bids = bids;
    }

    public Optimization getCampaignOptimization() {
        return campaignOptimization;
    }

    public void setCampaignOptimization(Optimization campaignOptimization) {
        this.campaignOptimization = campaignOptimization;
    }

    public OnAirType getOnAirType() {
        return onAirType;
    }

    public void setOnAirType(OnAirType onAirType) {
        this.onAirType = onAirType;
    }

    public SchedulingRules getScheduling() {
        return scheduling;
    }

    public void setScheduling(SchedulingRules scheduling) {
        this.scheduling = scheduling;
    }

    public Objective getObjective() {
        return objective;
    }

    public void setObjective(Objective objective) {
        this.objective = objective;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Campaign{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", marketerId='").append(marketerId).append('\'');
        sb.append(", enabled=").append(enabled);
        sb.append(", cpc=").append(cpc);
        sb.append(", minimumCpc=").append(minimumCpc);
        sb.append(", currenty='").append(currenty).append('\'');
        sb.append(", autoArchived=").append(autoArchived);
        sb.append(", targeting=").append(targeting);
        sb.append(", feeds=").append(feeds);
        sb.append(", autoExpireationOfPromotedLinks=").append(autoExpireationOfPromotedLinks);
        sb.append(", contentType=").append(contentType);
        sb.append(", budget=").append(budget);
        sb.append(", budgetId='").append(budgetId).append('\'');
        sb.append(", suffixTrackingCode=").append(suffixTrackingCode);
        sb.append(", preixTrackingCode=").append(preixTrackingCode);
        sb.append(", lastModified='").append(lastModified).append('\'');
        sb.append(", creationTime='").append(creationTime).append('\'');
        sb.append(", liveStatus=").append(liveStatus);
        sb.append(", cpcPerAdEnabled=").append(cpcPerAdEnabled);
        sb.append(", campaignBlockedSites=").append(campaignBlockedSites);
        sb.append(", startHour='").append(startHour).append('\'');
        sb.append(", trackingPixels=").append(trackingPixels);
        sb.append(", bids=").append(bids);
        sb.append(", campaignOptimization=").append(campaignOptimization);
        sb.append(", onAirType=").append(onAirType);
        sb.append(", scheduling=").append(scheduling);
        sb.append(", objective=").append(objective);
        sb.append('}');
        return sb.toString();
    }
}
