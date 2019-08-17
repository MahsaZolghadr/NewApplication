
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class I {

    @SerializedName("get")
    @Expose
    private Get_ get;

    public Get_ getGet() {
        return get;
    }

    public void setGet(Get_ get) {
        this.get = get;
    }

}
