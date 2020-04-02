package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class CustomAudience {
    @JsonProperty("includedSegments")
    private List<String> includedSegments;
    @JsonProperty("excludedSegments")
    private List<String> excludedSegments;

    public List<String> getIncludedSegments() {
        return includedSegments;
    }

    public void setIncludedSegments(List<String> includedSegments) {
        this.includedSegments = includedSegments;
    }

    public List<String> getExcludedSegments() {
        return excludedSegments;
    }

    public void setExcludedSegments(List<String> excludedSegments) {
        this.excludedSegments = excludedSegments;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CustomAudience{");
        sb.append("includedSegments=").append(includedSegments);
        sb.append(", excludedSegments=").append(excludedSegments);
        sb.append('}');
        return sb.toString();
    }
}
