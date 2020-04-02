package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "bySection"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Bids {
    @JsonProperty("bySection")
    private List<CpcBySection> bySection;

    public List<CpcBySection> getBySection() {
        return bySection;
    }

    public void setBySection(List<CpcBySection> bySection) {
        this.bySection = bySection;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Bids{");
        sb.append("bySection=").append(bySection);
        sb.append('}');
        return sb.toString();
    }
}
