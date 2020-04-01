package com.xy1m.model.resource;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.xy1m.model.reference.types.GeoLocationType;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "id",
        "geoType",
        "name",
        "cannonicalName",
        "parent"
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class GeoLocation {
    private String id;
    private GeoLocationType geoType;
    private String name;
    private String canonicalName;
    private GeoLocation parent;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GeoLocationType getGeoType() {
        return geoType;
    }

    public void setGeoType(GeoLocationType geoType) {
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

    public GeoLocation getParent() {
        return parent;
    }

    public void setParent(GeoLocation parent) {
        this.parent = parent;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GeoLocation{");
        sb.append("id='").append(id).append('\'');
        sb.append(", geoType=").append(geoType);
        sb.append(", name='").append(name).append('\'');
        sb.append(", canonicalName='").append(canonicalName).append('\'');
        sb.append(", parent=").append(parent);
        sb.append('}');
        return sb.toString();
    }
}
