package com.xy1m.model.reporting;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.reference.types.BlockStatus;
import com.xy1m.model.reference.types.BlockTypes;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "name",
        "blockStatus",
        "blockTypes",
        "url",
        "isOen"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Publisher {
    private String id;
    private String name;
    private BlockStatus blockStatus;
    private BlockTypes blockTypes;
    private String url;
    private Boolean isOen;

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

    public BlockStatus getBlockStatus() {
        return blockStatus;
    }

    public void setBlockStatus(BlockStatus blockStatus) {
        this.blockStatus = blockStatus;
    }

    public BlockTypes getBlockTypes() {
        return blockTypes;
    }

    public void setBlockTypes(BlockTypes blockTypes) {
        this.blockTypes = blockTypes;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Boolean getOen() {
        return isOen;
    }

    public void setOen(Boolean oen) {
        isOen = oen;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Publisher{");
        sb.append("id='").append(id).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", blockStatus=").append(blockStatus);
        sb.append(", blockTypes=").append(blockTypes);
        sb.append(", url='").append(url).append('\'');
        sb.append(", isOen=").append(isOen);
        sb.append('}');
        return sb.toString();
    }
}
