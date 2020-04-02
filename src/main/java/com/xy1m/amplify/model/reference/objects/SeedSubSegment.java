package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "platform",
        "size",
        "sizeInNetwork",
        "eligibleForLookalikeSubSegment"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeedSubSegment {
    @JsonProperty("country")
    private String country;
    @JsonProperty("platform")
    private String platform;
    @JsonProperty("size")
    private Long size;
    @JsonProperty("sizeInNetwork")
    private Long sizeInNetwork;
    @JsonProperty("eligibleForLookalikeSubSegment")
    private Boolean eligibleForLookalikeSubSegment;

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

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Long getSizeInNetwork() {
        return sizeInNetwork;
    }

    public void setSizeInNetwork(Long sizeInNetwork) {
        this.sizeInNetwork = sizeInNetwork;
    }

    public Boolean getEligibleForLookalikeSubSegment() {
        return eligibleForLookalikeSubSegment;
    }

    public void setEligibleForLookalikeSubSegment(Boolean eligibleForLookalikeSubSegment) {
        this.eligibleForLookalikeSubSegment = eligibleForLookalikeSubSegment;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SeedSubSegment{");
        sb.append("country='").append(country).append('\'');
        sb.append(", platform='").append(platform).append('\'');
        sb.append(", size=").append(size);
        sb.append(", sizeInNetwork=").append(sizeInNetwork);
        sb.append(", eligibleForLookalikeSubSegment=").append(eligibleForLookalikeSubSegment);
        sb.append('}');
        return sb.toString();
    }
}
