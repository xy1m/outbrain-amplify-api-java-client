package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.SegmentType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "segmentId",
        "segmentType"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class SeedSegment {
    @JsonProperty("segmentId")
    private String segmentId;
    @JsonProperty("segmentType")
    private SegmentType segmentType;

    public String getSegmentId() {
        return segmentId;
    }

    public void setSegmentId(String segmentId) {
        this.segmentId = segmentId;
    }

    public SegmentType getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(SegmentType segmentType) {
        this.segmentType = segmentType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("SeedSegment{");
        sb.append("segmentId='").append(segmentId).append('\'');
        sb.append(", segmentType=").append(segmentType);
        sb.append('}');
        return sb.toString();
    }
}
