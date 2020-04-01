package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.reference.types.Affinity;
import com.xy1m.model.reference.types.SubSegmentStatus;

import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "platform",
        "potentialReach",
        "status",
        "affinity",
        "lastUpdate"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class LookalikeSubSegment {
    @JsonProperty("country")
    private String country;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("potentialReach")
    private Long potentialReach;
    @JsonProperty("status")
    private SubSegmentStatus status;
    @JsonProperty("affinity")
    private Affinity affinity;
    @JsonProperty("lastUpdate")
    private LocalDateTime lastUpdate;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public Long getPotentialReach() {
        return potentialReach;
    }

    public void setPotentialReach(Long potentialReach) {
        this.potentialReach = potentialReach;
    }

    public SubSegmentStatus getStatus() {
        return status;
    }

    public void setStatus(SubSegmentStatus status) {
        this.status = status;
    }

    public Affinity getAffinity() {
        return affinity;
    }

    public void setAffinity(Affinity affinity) {
        this.affinity = affinity;
    }

    public LocalDateTime getLastUpdate() {
        return lastUpdate;
    }

    public void setLastUpdate(LocalDateTime lastUpdate) {
        this.lastUpdate = lastUpdate;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LookalikeSubSegment{");
        sb.append("country='").append(country).append('\'');
        sb.append(", platform='").append(platform).append('\'');
        sb.append(", potentialReach=").append(potentialReach);
        sb.append(", status=").append(status);
        sb.append(", affinity=").append(affinity);
        sb.append(", lastUpdate=").append(lastUpdate);
        sb.append('}');
        return sb.toString();
    }
}
