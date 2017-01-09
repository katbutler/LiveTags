package com.katbutler.livetags.model.instagram.common

import com.google.gson.annotations.SerializedName

/**
 * Created by katrinabutler on 2017-01-08.
 */
class User {

    var id: String? = null

    var username: String? = null

    @SerializedName("full_name")
    var fullName: String? = null

    @SerializedName("profile_picture")
    var profilePicUrl: String? = null


    override fun toString(): String {
        return "{" + arrayOf(id, username, fullName, profilePicUrl).map { it?.toString() ?: "None" }.joinToString(", ") + "}"
    }
}