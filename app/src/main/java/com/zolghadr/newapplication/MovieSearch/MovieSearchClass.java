
package com.zolghadr.newapplication.MovieSearch;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class MovieSearchClass {

    @SerializedName("swagger")
    @Expose
    private String swagger;
    @SerializedName("info")
    @Expose
    private Info info;
    @SerializedName("host")
    @Expose
    private String host;
    @SerializedName("basePath")
    @Expose
    private String basePath;
    @SerializedName("tags")
    @Expose
    private List<Tag> tags = null;
    @SerializedName("schemes")
    @Expose
    private List<String> schemes = null;
    @SerializedName("security")
    @Expose
    private List<Security> security = null;
    @SerializedName("paths")
    @Expose
    private Paths paths;
    @SerializedName("securityDefinitions")
    @Expose
    private SecurityDefinitions securityDefinitions;
    @SerializedName("externalDocs")
    @Expose
    private ExternalDocs externalDocs;

    public String getSwagger() {
        return swagger;
    }

    public void setSwagger(String swagger) {
        this.swagger = swagger;
    }

    public Info getInfo() {
        return info;
    }

    public void setInfo(Info info) {
        this.info = info;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getBasePath() {
        return basePath;
    }

    public void setBasePath(String basePath) {
        this.basePath = basePath;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }

    public List<String> getSchemes() {
        return schemes;
    }

    public void setSchemes(List<String> schemes) {
        this.schemes = schemes;
    }

    public List<Security> getSecurity() {
        return security;
    }

    public void setSecurity(List<Security> security) {
        this.security = security;
    }

    public Paths getPaths() {
        return paths;
    }

    public void setPaths(Paths paths) {
        this.paths = paths;
    }

    public SecurityDefinitions getSecurityDefinitions() {
        return securityDefinitions;
    }

    public void setSecurityDefinitions(SecurityDefinitions securityDefinitions) {
        this.securityDefinitions = securityDefinitions;
    }

    public ExternalDocs getExternalDocs() {
        return externalDocs;
    }

    public void setExternalDocs(ExternalDocs externalDocs) {
        this.externalDocs = externalDocs;
    }

}
