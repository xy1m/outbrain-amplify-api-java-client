package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "geoType",
        "name",
        "cannonicalName",
        "parent"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Geo {
    private String id;
    private GeoType geoType;
    private String name;
    private String canonicalName;
    private Geo parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GeoType getGeoType() {
        return geoType;
    }

    public void setGeoType(GeoType geoType) {
        this.geoType = geoType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCanonicalName() {
        return canonicalName;
    }

    public void setCanonicalName(String canonicalName) {
        this.canonicalName = canonicalName;
    }

    public Geo getParent() {
        return parent;
    }

    public void setParent(Geo parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Geo{");
        sb.append("id='").append(id).append('\'');
        sb.append(", geoType=").append(geoType);
        sb.append(", name='").append(name).append('\'');
        sb.append(", canonicalName='").append(canonicalName).append('\'');
        sb.append(", parent=").append(parent);
        sb.append('}');
        return sb.toString();
    }
}
