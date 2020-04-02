package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;
import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "similarity",
        "subSegments",
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class UpdateLookalikeSettings {
    @JsonProperty("similarity")
    private BigDecimal similarity;
    @JsonProperty("subSegments")
    private List<SubSegment> subSegments;

    public BigDecimal getSimilarity() {
        return similarity;
    }

    public void setSimilarity(BigDecimal similarity) {
        this.similarity = similarity;
    }

    public List<SubSegment> getSubSegments() {
        return subSegments;
    }

    public void setSubSegments(List<SubSegment> subSegments) {
        this.subSegments = subSegments;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("UpdateLookalikeSettings{");
        sb.append("similarity=").append(similarity);
        sb.append(", subSegments=").append(subSegments);
        sb.append('}');
        return sb.toString();
    }
}
