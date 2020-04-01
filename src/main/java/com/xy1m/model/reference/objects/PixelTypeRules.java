package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "ruleGroups"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PixelTypeRules {
    @JsonProperty("ruleGroups'")
    private List<RuleGroup> ruleGroups;

    public List<RuleGroup> getRuleGroups() {
        return ruleGroups;
    }

    public void setRuleGroups(List<RuleGroup> ruleGroups) {
        this.ruleGroups = ruleGroups;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PixelTypeRules{");
        sb.append("ruleGroups=").append(ruleGroups);
        sb.append('}');
        return sb.toString();
    }
}
