package com.xy1m.amplify.model.reference.objects;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pc_id",
        "cid",
        "pc_id",
        "did",
        "aid",
        "doc_title",
        "ad_title",
        "time_stamp"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrackingPixel {
    @JsonProperty("pc_id")
    private String uuid;
    @JsonProperty("cid")
    private String cid;
    @JsonProperty("pc_id")
    private String pcId;
    @JsonProperty("did")
    private String did;
    @JsonProperty("aid")
    private String aid;
    @JsonProperty("doc_title")
    private String docTitle;
    @JsonProperty("ad_title")
    private String adTitle;
    @JsonProperty("time_stamp")
    private long timestamp;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }

    public String getPcId() {
        return pcId;
    }

    public void setPcId(String pcId) {
        this.pcId = pcId;
    }

    public String getDid() {
        return did;
    }

    public void setDid(String did) {
        this.did = did;
    }

    public String getAid() {
        return aid;
    }

    public void setAid(String aid) {
        this.aid = aid;
    }

    public String getDocTitle() {
        return docTitle;
    }

    public void setDocTitle(String docTitle) {
        this.docTitle = docTitle;
    }

    public String getAdTitle() {
        return adTitle;
    }

    public void setAdTitle(String adTitle) {
        this.adTitle = adTitle;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TrackingPixel{");
        sb.append("uuid='").append(uuid).append('\'');
        sb.append(", cid='").append(cid).append('\'');
        sb.append(", pcId='").append(pcId).append('\'');
        sb.append(", did='").append(did).append('\'');
        sb.append(", aid='").append(aid).append('\'');
        sb.append(", docTitle='").append(docTitle).append('\'');
        sb.append(", adTitle='").append(adTitle).append('\'');
        sb.append(", timestamp=").append(timestamp);
        sb.append('}');
        return sb.toString();
    }
}
