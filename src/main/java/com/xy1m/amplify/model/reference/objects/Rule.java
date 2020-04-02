package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.PixelRuleType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pattern",
        "pixelRuleType"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Rule {
    @JsonProperty("pattern")
    private String pattern;
    @JsonProperty("pixelRuleType")
    private PixelRuleType pixelRuleType;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }

    public PixelRuleType getPixelRuleType() {
        return pixelRuleType;
    }

    public void setPixelRuleType(PixelRuleType pixelRuleType) {
        this.pixelRuleType = pixelRuleType;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Rule{");
        sb.append("pattern='").append(pattern).append('\'');
        sb.append(", pixelRuleType=").append(pixelRuleType);
        sb.append('}');
        return sb.toString();
    }
}
