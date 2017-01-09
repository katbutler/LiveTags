package com.katbutler.livetags.model.instagram.common

import com.google.gson.annotations.SerializedName

/**
 * Created by katrinabutler on 2017-01-08.
 */

class Location {

    @SerializedName("latitude")
    var latitude: Double? = null

    @SerializedName("longitude")
    var longitude: Double? = null

    @SerializedName("id")
    var id: Long? = null


    override fun toString(): String {
        return String.format("[%f, %f]", latitude, longitude)
    }
}
