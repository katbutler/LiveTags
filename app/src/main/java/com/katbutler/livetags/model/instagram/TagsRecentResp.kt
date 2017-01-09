package com.katbutler.livetags.model.instagram

import com.katbutler.livetags.model.instagram.common.InstaImage
import com.katbutler.livetags.model.instagram.common.Pagination

/**
 * Created by katrinabutler on 2017-01-08.
 */

class TagsRecentResp {

    var pagination: Pagination? = null

    var meta: Map<String, String>? = null

    var data: Array<InstaImage>? = null
}
