
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Responses_ {

    @SerializedName("200")
    @Expose
    private _200_ _200;
    @SerializedName("401")
    @Expose
    private _401_ _401;

    public _200_ get200() {
        return _200;
    }

    public void set200(_200_ _200) {
        this._200 = _200;
    }

    public _401_ get401() {
        return _401;
    }

    public void set401(_401_ _401) {
        this._401 = _401;
    }

}
