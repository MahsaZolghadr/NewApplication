
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Paths {

    @SerializedName("/?t")
    @Expose
    private T t;
    @SerializedName("/?i")
    @Expose
    private I i;
    @SerializedName("/?s")
    @Expose
    private S s;

    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public I getI() {
        return i;
    }

    public void setI(I i) {
        this.i = i;
    }

    public S getS() {
        return s;
    }

    public void setS(S s) {
        this.s = s;
    }

}
