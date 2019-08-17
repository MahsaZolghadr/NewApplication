
package com.zolghadr.newapplication.MovieSearch;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Get {

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
    private List<Parameter> parameters = null;
    @SerializedName("responses")
    @Expose
    private Responses responses;
    @SerializedName("security")
    @Expose
    private List<Security_> security = null;

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

    public List<Parameter> getParameters() {
        return parameters;
    }

    public void setParameters(List<Parameter> parameters) {
        this.parameters = parameters;
    }

    public Responses getResponses() {
        return responses;
    }

    public void setResponses(Responses responses) {
        this.responses = responses;
    }

    public List<Security_> getSecurity() {
        return security;
    }

    public void setSecurity(List<Security_> security) {
        this.security = security;
    }

}
