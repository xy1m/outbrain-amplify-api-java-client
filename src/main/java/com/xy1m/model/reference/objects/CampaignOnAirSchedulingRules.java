package com.xy1m.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.time.DayOfWeek;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "startDay",
        "endDay",
        "startHour",
        "endHour"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class CampaignOnAirSchedulingRules {
    @JsonProperty("startDay")
    private DayOfWeek startDay;
    @JsonProperty("endDay")
    private DayOfWeek endDay;
    @JsonProperty("startHour")
    private Integer startHour;
    @JsonProperty("endHour")
    private Integer endHour;

    public DayOfWeek getStartDay() {
        return startDay;
    }

    public void setStartDay(DayOfWeek startDay) {
        this.startDay = startDay;
    }

    public DayOfWeek getEndDay() {
        return endDay;
    }

    public void setEndDay(DayOfWeek endDay) {
        this.endDay = endDay;
    }

    public Integer getStartHour() {
        return startHour;
    }

    public void setStartHour(Integer startHour) {
        this.startHour = startHour;
    }

    public Integer getEndHour() {
        return endHour;
    }

    public void setEndHour(Integer endHour) {
        this.endHour = endHour;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CampaignOnAirSchedulingRules{");
        sb.append("startDay=").append(startDay);
        sb.append(", endDay=").append(endDay);
        sb.append(", startHour=").append(startHour);
        sb.append(", endHour=").append(endHour);
        sb.append('}');
        return sb.toString();
    }
}
