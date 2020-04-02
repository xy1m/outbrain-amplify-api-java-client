package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.CampaignOnAirReason;

import java.math.BigDecimal;
import java.time.LocalDate;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "campaignOnAir",
        "onAirReason",
        "amountSpent",
        "onAirModificationTime",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class LiveStatus {
    @JsonProperty("campaignOnAir")
    private Boolean campaignOnAir;
    @JsonProperty("onAirReason")
    private CampaignOnAirReason onAirReason;
    @JsonProperty("amountSpent")
    private BigDecimal amountSpent;
    @JsonProperty("onAirModificationTime")
    private LocalDate onAirModificationTime;

    public Boolean getCampaignOnAir() {
        return campaignOnAir;
    }

    public void setCampaignOnAir(Boolean campaignOnAir) {
        this.campaignOnAir = campaignOnAir;
    }

    public CampaignOnAirReason getOnAirReason() {
        return onAirReason;
    }

    public void setOnAirReason(CampaignOnAirReason onAirReason) {
        this.onAirReason = onAirReason;
    }

    public BigDecimal getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(BigDecimal amountSpent) {
        this.amountSpent = amountSpent;
    }

    public LocalDate getOnAirModificationTime() {
        return onAirModificationTime;
    }

    public void setOnAirModificationTime(LocalDate onAirModificationTime) {
        this.onAirModificationTime = onAirModificationTime;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LiveStatus{");
        sb.append("campaignOnAir=").append(campaignOnAir);
        sb.append(", onAirReason=").append(onAirReason);
        sb.append(", amountSpent=").append(amountSpent);
        sb.append(", onAirModificationTime=").append(onAirModificationTime);
        sb.append('}');
        return sb.toString();
    }
}
