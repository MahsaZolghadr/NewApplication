
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Responses__ {

    @SerializedName("200")
    @Expose
    private _200__ _200;
    @SerializedName("401")
    @Expose
    private _401__ _401;

    public _200__ get200() {
        return _200;
    }

    public void set200(_200__ _200) {
        this._200 = _200;
    }

    public _401__ get401() {
        return _401;
    }

    public void set401(_401__ _401) {
        this._401 = _401;
    }

}
