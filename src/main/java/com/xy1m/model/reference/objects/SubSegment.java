package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "country",
        "platform"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SubSegment {
    @JsonProperty("country")
    private String country;
    @JsonProperty("platform")
    private String platform;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SubSegment{");
        sb.append("country='").append(country).append('\'');
        sb.append(", platform='").append(platform).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
