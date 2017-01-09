package com.katbutler.livetags.model.instagram.common

import com.google.gson.annotations.SerializedName

/**
 * [Pagination] represents the pagination object in Instagram responses that are paged

 * Created by katrinabutler on 2017-01-08.
 */
class Pagination {

    @SerializedName("next_max_tag_id")
    var nextMaxTagId: String? = null

    @SerializedName("deprecation_warning")
    var deprecationWarning: String? = null

    @SerializedName("next_max_id")
    var nextMaxId: String? = null

    @SerializedName("next_min_id")
    var nextMinId: String? = null

    @SerializedName("min_tag_id")
    var minTagId: String? = null

    @SerializedName("next_url")
    var nextUrl: String? = null


}
