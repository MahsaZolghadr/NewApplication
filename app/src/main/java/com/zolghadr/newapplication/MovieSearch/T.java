
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class T {

    @SerializedName("get")
    @Expose
    private Get get;

    public Get getGet() {
        return get;
    }

    public void setGet(Get get) {
        this.get = get;
    }

}
