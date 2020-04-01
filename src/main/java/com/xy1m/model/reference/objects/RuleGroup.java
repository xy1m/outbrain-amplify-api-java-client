package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "rules"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class RuleGroup {
    private List<Rule> rules;

    public List<Rule> getRules() {
        return rules;
    }

    public void setRules(List<Rule> rules) {
        this.rules = rules;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RuleGroup{");
        sb.append("rules=").append(rules);
        sb.append('}');
        return sb.toString();
    }
}
