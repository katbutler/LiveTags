package com.katbutler.livetags.model.instagram.common

import com.google.gson.Gson
import com.google.gson.annotations.SerializedName

/**
 * Created by katrinabutler on 2017-01-08.
 */

class Images {

    class Image {
        var url : String? = null
        var width : Int? = null
        var height : Int? = null
    }

    @SerializedName("low_resolution")
    var lowResImg: Image?  = null

    @SerializedName("thumbnail")
    var thumbnailImg: Image?  = null

    @SerializedName("standard_resolution")
    var standardResImg: Image?  = null

    override fun toString(): String {
        return Gson().toJson(this)
    }
}
