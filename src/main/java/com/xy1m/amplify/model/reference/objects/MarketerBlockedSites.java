package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "blockedPublishers",
        "blockedSections"
})
public class MarketerBlockedSites {
    private List<String> blockedPublishers;
    private List<String> blockedSections;


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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MarketerBlockedSites{");
        sb.append("blockedPublishers=").append(blockedPublishers);
        sb.append(", blockedSections=").append(blockedSections);
        sb.append('}');
        return sb.toString();
    }
}
