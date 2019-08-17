
package com.zolghadr.newapplication.MovieSearch;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Get__ {

    @SerializedName("tags")
    @Expose
    private List<String> tags = null;
    @SerializedName("summary")
    @Expose
    private String summary;
    @SerializedName("operationId")
    @Expose
    private String operationId;
    @SerializedName("parameters")
    @Expose
    private List<Parameter__> parameters = null;
    @SerializedName("responses")
    @Expose
    private Responses__ responses;
    @SerializedName("security")
    @Expose
    private List<Security___> security = null;

    public List<String> getTags() {
        return tags;
    }

    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getOperationId() {
        return operationId;
    }

    public void setOperationId(String operationId) {
        this.operationId = operationId;
    }

    public List<Parameter__> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter__> parameters) {
        this.parameters = parameters;
    }

    public Responses__ getResponses() {
        return responses;
    }

    public void setResponses(Responses__ responses) {
        this.responses = responses;
    }

    public List<Security___> getSecurity() {
        return security;
    }

    public void setSecurity(List<Security___> security) {
        this.security = security;
    }

}
