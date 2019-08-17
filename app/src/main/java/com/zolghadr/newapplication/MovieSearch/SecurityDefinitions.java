
package com.zolghadr.newapplication.MovieSearch;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SecurityDefinitions {

    @SerializedName("APIKeyQueryParam")
    @Expose
    private APIKeyQueryParam aPIKeyQueryParam;

    public APIKeyQueryParam getAPIKeyQueryParam() {
        return aPIKeyQueryParam;
    }

    public void setAPIKeyQueryParam(APIKeyQueryParam aPIKeyQueryParam) {
        this.aPIKeyQueryParam = aPIKeyQueryParam;
    }

}
