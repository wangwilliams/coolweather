package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by gssd on 2018/11/21.
 */

public class Now {
    @SerializedName("tmp")
    public String Temperature;
    public class More{
        @SerializedName("txt")
        public String info;
    }
    @SerializedName("cond")
    public More more;
}
