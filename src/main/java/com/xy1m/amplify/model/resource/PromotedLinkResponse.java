package com.xy1m.amplify.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.amplify.model.reference.objects.OperationStatus;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "operationStatus",
        "url",
        "promotedLink"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class PromotedLinkResponse {
    private OperationStatus operationStatus;
    private String url;
    private PromotedLink promotedLink;

    public OperationStatus getOperationStatus() {
        return operationStatus;
    }

    public void setOperationStatus(OperationStatus operationStatus) {
        this.operationStatus = operationStatus;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public PromotedLink getPromotedLink() {
        return promotedLink;
    }

    public void setPromotedLink(PromotedLink promotedLink) {
        this.promotedLink = promotedLink;
    }

    @Override
    public String toString() {
        return "PromotedLinkResponse{" +
                "operationStatus=" + operationStatus +
                ", url='" + url + '\'' +
                ", promotedLink=" + promotedLink +
                '}';
    }
}
