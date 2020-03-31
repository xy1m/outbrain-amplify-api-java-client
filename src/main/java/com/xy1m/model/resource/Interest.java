package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "canBeTargeted",
        "reachEstimationCount"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Interest {
    private String id;
    private String name;
    private Boolean canBeTargeted;
    private Long reachEstimationCount;

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

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Interest{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", canBeTargeted=").append(canBeTargeted);
        sb.append(", reachEstimationCount=").append(reachEstimationCount);
        sb.append('}');
        return sb.toString();
    }
}
