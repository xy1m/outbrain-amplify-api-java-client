package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.CampaignOptimizationType;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "optimizationType",
        "maxCpcBidPercentage",
        "conversions",
        "experimentEnabled",
        "controlGroupPercentage",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignOptimization {
    @JsonProperty("optimizationType")
    private CampaignOptimizationType optimizationType;
    @JsonProperty("maxCpcBidPercentage")
    private BigDecimal maxCpcBidPercentage;
    @JsonProperty("conversions")
    private List<String> conversions;
    @JsonProperty("experimentEnabled")
    private Boolean experimentEnabled;
    @JsonProperty("controlGroupPercentage")
    private BigDecimal controlGroupPercentage;

    public CampaignOptimizationType getOptimizationType() {
        return optimizationType;
    }

    public void setOptimizationType(CampaignOptimizationType optimizationType) {
        this.optimizationType = optimizationType;
    }

    public BigDecimal getMaxCpcBidPercentage() {
        return maxCpcBidPercentage;
    }

    public void setMaxCpcBidPercentage(BigDecimal maxCpcBidPercentage) {
        this.maxCpcBidPercentage = maxCpcBidPercentage;
    }

    public List<String> getConversions() {
        return conversions;
    }

    public void setConversions(List<String> conversions) {
        this.conversions = conversions;
    }

    public Boolean getExperimentEnabled() {
        return experimentEnabled;
    }

    public void setExperimentEnabled(Boolean experimentEnabled) {
        this.experimentEnabled = experimentEnabled;
    }

    public BigDecimal getControlGroupPercentage() {
        return controlGroupPercentage;
    }

    public void setControlGroupPercentage(BigDecimal controlGroupPercentage) {
        this.controlGroupPercentage = controlGroupPercentage;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CampaignOptimization{");
        sb.append("optimizationType=").append(optimizationType);
        sb.append(", maxCpcBidPercentage=").append(maxCpcBidPercentage);
        sb.append(", conversions=").append(conversions);
        sb.append(", experimentEnabled=").append(experimentEnabled);
        sb.append(", controlGroupPercentage=").append(controlGroupPercentage);
        sb.append('}');
        return sb.toString();
    }
}
