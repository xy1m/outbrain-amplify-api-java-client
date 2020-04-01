package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.reference.types.Provider;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "provider",
        "cost"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class DMP {
    @JsonProperty("provider")
    private Provider provider;
    @JsonProperty("cost")
    private BigDecimal cost;

    public Provider getProvider() {
        return provider;
    }

    public void setProvider(Provider provider) {
        this.provider = provider;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DMP{");
        sb.append("provider=").append(provider);
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}
