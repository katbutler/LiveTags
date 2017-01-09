package com.katbutler.livetags.model.instagram.common

import com.google.gson.annotations.SerializedName

/**
 * Created by katrinabutler on 2017-01-08.
 */

class InstaImage {

    var id: String? = null

    var attribution: String? = null

    var type: String? = null

    var tags: List<String>? = null

    var location: Location? = null

    var filter: String? = null

    var link: String? = null

    var images: Images? = null

    @SerializedName("user_has_liked")
    var userHasLiked: Boolean? = null

    var user: User? = null
    /*


"comments": {
"count": 5
},
"filter": "Normal",
"created_time": "1483831552",
"link": "https://www.instagram.com/p/BO-0Uj1BALR/",
"likes": {
"count": 63
},
"images": {
"low_resolution": {
"url": "https://scontent.cdninstagram.com/t51.2885-15/s320x320/e35/15802728_375063376197299_1009535700762099712_n.jpg?ig_cache_key=MTQyMjgwNDY0MzU3NDE4NjcwNQ%3D%3D.2",
"width": 320,
"height": 320
},
"thumbnail": {
"url": "https://scontent.cdninstagram.com/t51.2885-15/s150x150/e35/15802728_375063376197299_1009535700762099712_n.jpg?ig_cache_key=MTQyMjgwNDY0MzU3NDE4NjcwNQ%3D%3D.2",
"width": 150,
"height": 150
},
"standard_resolution": {
"url": "https://scontent.cdninstagram.com/t51.2885-15/s640x640/sh0.08/e35/15802728_375063376197299_1009535700762099712_n.jpg?ig_cache_key=MTQyMjgwNDY0MzU3NDE4NjcwNQ%3D%3D.2",
"width": 640,
"height": 640
}
},
"users_in_photo": [
{
"position": {
"y": 0.9333333333333333,
"x": 0.7946666666666666
},
"user": {
"username": "marinakoslow",
"profile_picture": "https://scontent.cdninstagram.com/t51.2885-19/s150x150/13126661_661934890613543_7941111_a.jpg",
"id": "10447101",
"full_name": "Marina Koslow"
}
}
],
"caption": {
"created_time": "1483831552",
"text": "Beautiful summer wedding shared with love! @marinakoslow this is gorgeous! #weddingvibes #wedventuremag #wedventure #weddingadventure #centraloregon #centraloregonweddings #bendlove #brideandgroom #oregonwedding #sayido #destinationwedding #summerwedding #destinationweddingphotographer #weddingdress #iloveyou #weddingphotography #weddingphotographer #adventure #thatsdarling #northwestisbest #stayandwander #love",
"from": {
"username": "wedventuremag",
"profile_picture": "https://scontent.cdninstagram.com/t51.2885-19/s150x150/14295601_529348443923564_6344137781089927168_a.jpg",
"id": "3423360686",
"full_name": "Wedventure Magazine"
},
"id": "17869718872046421"
},
"user_has_liked": false,
"id": "1422804643574186705_3423360686",
"user": {
"username": "wedventuremag",
"profile_picture": "https://scontent.cdninstagram.com/t51.2885-19/s150x150/14295601_529348443923564_6344137781089927168_a.jpg",
"id": "3423360686",
"full_name": "Wedventure Magazine"
}

     */


}
