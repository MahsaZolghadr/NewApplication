
package com.zolghadr.newapplication.MovieSearch;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Parameter {

    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("in")
    @Expose
    private String in;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("required")
    @Expose
    private Boolean required;
    @SerializedName("type")
    @Expose
    private String type;
    @SerializedName("enum")
    @Expose
    private List<String> _enum = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIn() {
        return in;
    }

    public void setIn(String in) {
        this.in = in;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getEnum() {
        return _enum;
    }

    public void setEnum(List<String> _enum) {
        this._enum = _enum;
    }

}
