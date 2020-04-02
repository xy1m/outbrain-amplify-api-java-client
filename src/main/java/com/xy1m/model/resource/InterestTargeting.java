package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "canBeTargeted",
        "reachEstimationCount",
        "subConcepts"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class InterestTargeting {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("canBeTargeted")
    private Boolean canBeTargeted;
    @JsonProperty("reachEstimationCount")
    private Long reachEstimationCount;
    @JsonProperty("subConcepts")
    private List<InterestTargeting> subConcepts;

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

    public Boolean getCanBeTargeted() {
        return canBeTargeted;
    }

    public void setCanBeTargeted(Boolean canBeTargeted) {
        this.canBeTargeted = canBeTargeted;
    }

    public Long getReachEstimationCount() {
        return reachEstimationCount;
    }

    public void setReachEstimationCount(Long reachEstimationCount) {
        this.reachEstimationCount = reachEstimationCount;
    }

    public List<InterestTargeting> getSubConcepts() {
        return subConcepts;
    }

    public void setSubConcepts(List<InterestTargeting> subConcepts) {
        this.subConcepts = subConcepts;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("InterestTargeting{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", canBeTargeted=").append(canBeTargeted);
        sb.append(", reachEstimationCount=").append(reachEstimationCount);
        sb.append(", subConcepts=").append(subConcepts);
        sb.append('}');
        return sb.toString();
    }
}
