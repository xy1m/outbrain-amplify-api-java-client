package com.xy1m.amplify.model.budget;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.types.BudgetType;
import com.xy1m.amplify.model.reference.types.PacingType;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "shared",
        "amount",
        "currency",
        "amountRemaining",
        "amountSpent",
        "creationTime",
        "lastModified",
        "startDate",
        "endDate",
        "runForever",
        "type",
        "pacing",
        "dailyTarget",
        "maximumAmount"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Budget {
    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("shared")
    private Boolean shared;
    @JsonProperty("amount")
    private BigDecimal amount;
    @JsonProperty("currency")
    private String currency;
    @JsonProperty("amountRemaining")
    private BigDecimal amountRemaining;
    @JsonProperty("amountSpent")
    private BigDecimal amountSpent;
    @JsonProperty("creationTime")
    private LocalDateTime creationTime;
    @JsonProperty("lastModified")
    private LocalDateTime lastModified;
    @JsonProperty("startDate")
    private LocalDate startDate;
    @JsonProperty("endDate")
    private LocalDate endDate;
    @JsonProperty("runForever")
    private Boolean runForever;
    @JsonProperty("type")
    private BudgetType type;
    @JsonProperty("pacing")
    private PacingType pacing;
    @JsonProperty("dailyTarget")
    private BigDecimal dailyTarget;
    @JsonProperty("maximumAmount")
    private BigDecimal maximumAmount;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Boolean getShared() {
        return shared;
    }

    public void setShared(Boolean shared) {
        this.shared = shared;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public BigDecimal getAmountRemaining() {
        return amountRemaining;
    }

    public void setAmountRemaining(BigDecimal amountRemaining) {
        this.amountRemaining = amountRemaining;
    }

    public BigDecimal getAmountSpent() {
        return amountSpent;
    }

    public void setAmountSpent(BigDecimal amountSpent) {
        this.amountSpent = amountSpent;
    }

    public LocalDateTime getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(LocalDateTime creationTime) {
        this.creationTime = creationTime;
    }

    public LocalDateTime getLastModified() {
        return lastModified;
    }

    public void setLastModified(LocalDateTime lastModified) {
        this.lastModified = lastModified;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public Boolean getRunForever() {
        return runForever;
    }

    public void setRunForever(Boolean runForever) {
        this.runForever = runForever;
    }

    public BudgetType getType() {
        return type;
    }

    public void setType(BudgetType type) {
        this.type = type;
    }

    public PacingType getPacing() {
        return pacing;
    }

    public void setPacing(PacingType pacing) {
        this.pacing = pacing;
    }

    public BigDecimal getDailyTarget() {
        return dailyTarget;
    }

    public void setDailyTarget(BigDecimal dailyTarget) {
        this.dailyTarget = dailyTarget;
    }

    public BigDecimal getMaximumAmount() {
        return maximumAmount;
    }

    public void setMaximumAmount(BigDecimal maximumAmount) {
        this.maximumAmount = maximumAmount;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Budget{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", shared=").append(shared);
        sb.append(", amount=").append(amount);
        sb.append(", currency='").append(currency).append('\'');
        sb.append(", amountRemaining=").append(amountRemaining);
        sb.append(", amountSpent=").append(amountSpent);
        sb.append(", creationTime=").append(creationTime);
        sb.append(", lastModified=").append(lastModified);
        sb.append(", startDate=").append(startDate);
        sb.append(", endDate=").append(endDate);
        sb.append(", runForever=").append(runForever);
        sb.append(", type=").append(type);
        sb.append(", pacing=").append(pacing);
        sb.append(", dailyTarget=").append(dailyTarget);
        sb.append(", maximumAmount=").append(maximumAmount);
        sb.append('}');
        return sb.toString();
    }
}
