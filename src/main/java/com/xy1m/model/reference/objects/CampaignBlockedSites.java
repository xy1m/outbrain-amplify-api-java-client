package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "blockedPublishers",
        "blockedSections",
        "marketerBlockedSites"
})
public class CampaignBlockedSites {
    private List<String> blockedPublishers;
    private List<String> blockedSections;
    private MarketerBlockedSites marketerBlockedSites;

    public List<String> getBlockedPublishers() {
        return blockedPublishers;
    }

    public void setBlockedPublishers(List<String> blockedPublishers) {
        this.blockedPublishers = blockedPublishers;
    }

    public List<String> getBlockedSections() {
        return blockedSections;
    }

    public void setBlockedSections(List<String> blockedSections) {
        this.blockedSections = blockedSections;
    }

    public MarketerBlockedSites getMarketerBlockedSites() {
        return marketerBlockedSites;
    }

    public void setMarketerBlockedSites(MarketerBlockedSites marketerBlockedSites) {
        this.marketerBlockedSites = marketerBlockedSites;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CampaignBlockedSites{");
        sb.append("blockedPublishers=").append(blockedPublishers);
        sb.append(", blockedSections=").append(blockedSections);
        sb.append(", marketerBlockedSites=").append(marketerBlockedSites);
        sb.append('}');
        return sb.toString();
    }
}
