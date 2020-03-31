package com.xy1m.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.Collection;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "interests",
        "count"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class ResultsInterest<T> {

    private Collection<T> interests;
    private int count;

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public Collection<T> getInterests() {
        return interests;
    }

    public void setInterests(Collection<T> interests) {
        this.interests = interests;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ResultsInterest{");
        sb.append("count=").append(count);
        sb.append(", interests=").append(interests);
        sb.append('}');
        return sb.toString();
    }
}
