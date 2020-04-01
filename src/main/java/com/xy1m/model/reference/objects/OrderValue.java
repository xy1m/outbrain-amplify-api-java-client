package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.math.BigDecimal;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "value",
        "currency"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class OrderValue {
    private BigDecimal value;
    private String currency;

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("OrderValue{");
        sb.append("value=").append(value);
        sb.append(", currency='").append(currency).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
