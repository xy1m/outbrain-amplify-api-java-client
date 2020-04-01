package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "promotedLinks",
        "count",
        "totalCount"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotedLinks {
    private List<PromotedLink> promotedLinks;
    private Integer count;
    private Integer totalCount;

    @JsonProperty("promotedLinks")
    public List<PromotedLink> getPromotedLinks() {
        return promotedLinks;
    }

    public void setPromotedLinks(List<PromotedLink> promotedLinks) {
        this.promotedLinks = promotedLinks;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @JsonProperty("totalCount")
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public String toString() {
        return "PromotedLinks{" +
                "promotedLinks=" + promotedLinks +
                ", count=" + count +
                ", totalCount=" + totalCount +
                '}';
    }
}
