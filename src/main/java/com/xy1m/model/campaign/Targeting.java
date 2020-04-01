package com.xy1m.model.campaign;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.xy1m.model.reference.Browser;
import com.xy1m.model.reference.CustomAudience;
import com.xy1m.model.reference.OperatingSystem;
import com.xy1m.model.reference.Platform;
import com.xy1m.model.resource.Interest;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class Targeting {
    @JsonProperty("platform")
    private List<Platform> platform;
    @JsonProperty("locations")
    private List<String> locations;
    @JsonProperty("excludeAdBlockUsers")
    private Boolean excludeAdBlockUsers;
    @JsonProperty("customAudience")
    private CustomAudience customAudience;
    @JsonProperty("useExtendedNetworkTraffic")
    private Boolean useExtendedNetworkTraffic;
    @JsonProperty("browsers")
    private List<Browser> browsers;
    @JsonProperty("operatingSystems")
    private List<OperatingSystem> operatingSystems;
    @JsonProperty("interests")
    private List<Interest> interests;

    public List<Platform> getPlatform() {
        return platform;
    }

    public void setPlatform(List<Platform> platform) {
        this.platform = platform;
    }

    public List<String> getLocations() {
        return locations;
    }

    public void setLocations(List<String> locations) {
        this.locations = locations;
    }

    public Boolean getExcludeAdBlockUsers() {
        return excludeAdBlockUsers;
    }

    public void setExcludeAdBlockUsers(Boolean excludeAdBlockUsers) {
        this.excludeAdBlockUsers = excludeAdBlockUsers;
    }

    public CustomAudience getCustomAudience() {
        return customAudience;
    }

    public void setCustomAudience(CustomAudience customAudience) {
        this.customAudience = customAudience;
    }

    public Boolean getUseExtendedNetworkTraffic() {
        return useExtendedNetworkTraffic;
    }

    public void setUseExtendedNetworkTraffic(Boolean useExtendedNetworkTraffic) {
        this.useExtendedNetworkTraffic = useExtendedNetworkTraffic;
    }

    public List<Browser> getBrowsers() {
        return browsers;
    }

    public void setBrowsers(List<Browser> browsers) {
        this.browsers = browsers;
    }

    public List<OperatingSystem> getOperatingSystems() {
        return operatingSystems;
    }

    public void setOperatingSystems(List<OperatingSystem> operatingSystems) {
        this.operatingSystems = operatingSystems;
    }

    public List<Interest> getInterests() {
        return interests;
    }

    public void setInterests(List<Interest> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Targeting{");
        sb.append("platform=").append(platform);
        sb.append(", locations=").append(locations);
        sb.append(", excludeAdBlockUsers=").append(excludeAdBlockUsers);
        sb.append(", customAudience=").append(customAudience);
        sb.append(", useExtendedNetworkTraffic=").append(useExtendedNetworkTraffic);
        sb.append(", browsers=").append(browsers);
        sb.append(", operatingSystems=").append(operatingSystems);
        sb.append(", interests=").append(interests);
        sb.append('}');
        return sb.toString();
    }
}
