
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Info {

    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("version")
    @Expose
    private String version;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("termsOfService")
    @Expose
    private String termsOfService;
    @SerializedName("contact")
    @Expose
    private Contact contact;
    @SerializedName("license")
    @Expose
    private License license;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTermsOfService() {
        return termsOfService;
    }

    public void setTermsOfService(String termsOfService) {
        this.termsOfService = termsOfService;
    }

    public Contact getContact() {
        return contact;
    }

    public void setContact(Contact contact) {
        this.contact = contact;
    }

    public License getLicense() {
        return license;
    }

    public void setLicense(License license) {
        this.license = license;
    }

}
