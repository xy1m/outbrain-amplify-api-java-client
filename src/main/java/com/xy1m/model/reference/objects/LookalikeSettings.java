package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.reference.types.LookalikeSegmentStatus;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "seedSegment",
        "similarity",
        "lookalikeSegmentStatus",
        "subSegments",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class LookalikeSettings {
    @JsonProperty("seedSegment")
    private SeedSegment seedSegment;
    @JsonProperty("similarity")
    private BigDecimal similarity;
    @JsonProperty("lookalikeSegmentStatus")
    private LookalikeSegmentStatus lookalikeSegmentStatus;
    @JsonProperty("subSegments")
    private List<SubSegment> subSegments;

    public SeedSegment getSeedSegment() {
        return seedSegment;
    }

    public void setSeedSegment(SeedSegment seedSegment) {
        this.seedSegment = seedSegment;
    }

    public BigDecimal getSimilarity() {
        return similarity;
    }

    public void setSimilarity(BigDecimal similarity) {
        this.similarity = similarity;
    }

    public LookalikeSegmentStatus getLookalikeSegmentStatus() {
        return lookalikeSegmentStatus;
    }

    public void setLookalikeSegmentStatus(LookalikeSegmentStatus lookalikeSegmentStatus) {
        this.lookalikeSegmentStatus = lookalikeSegmentStatus;
    }

    public List<SubSegment> getSubSegments() {
        return subSegments;
    }

    public void setSubSegments(List<SubSegment> subSegments) {
        this.subSegments = subSegments;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("LookalikeSettings{");
        sb.append("seedSegment=").append(seedSegment);
        sb.append(", similarity=").append(similarity);
        sb.append(", lookalikeSegmentStatus=").append(lookalikeSegmentStatus);
        sb.append(", subSegments=").append(subSegments);
        sb.append('}');
        return sb.toString();
    }
}
