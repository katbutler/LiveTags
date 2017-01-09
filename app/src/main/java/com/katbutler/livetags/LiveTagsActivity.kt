package com.katbutler.livetags

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.content.IntentFilter
import android.databinding.DataBindingUtil
import android.graphics.Bitmap
import android.os.AsyncTask
import android.support.v4.content.res.TypedArrayUtils
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.util.Log
import android.widget.ImageView

import com.android.volley.Request
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.katbutler.livetags.databinding.ActivityLiveTagsBinding
import com.katbutler.livetags.model.instagram.TagsRecentResp
import com.katbutler.livetags.model.instagram.common.InstaImage
import com.katbutler.livetags.net.GsonRequest
import java.io.BufferedInputStream
import java.util.*
import android.graphics.BitmapFactory




/**
 * am start -a android.intent.action.MAIN -c android.intent.category.IOT_LAUNCHER -c android.intent.category.DEFAULT
 */
class LiveTagsActivity : AppCompatActivity() {

    var binding: ActivityLiveTagsBinding? = null


    val broadcastReceiver = object : BroadcastReceiver() {
        override fun onReceive(context: Context, intent: Intent) {
            makeRequest()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_live_tags);
//        setContentView(R.layout.activity_live_tags)

        val intentFilter = IntentFilter()
        intentFilter.addAction("com.katbutler.livetags.action.RELOAD")

        registerReceiver(broadcastReceiver, intentFilter)

        makeRequest()
    }

    fun makeRequest() {
        val url = "https://api.instagram.com/v1/tags/wedventure/media/recent?access_token=" + ACCESS_TOKEN

        // Instantiate the RequestQueue.
        val queue = Volley.newRequestQueue(this)


        val recentReq = GsonRequest(
                Request.Method.GET, url, TagsRecentResp::class.java!!, null,
                Response.Listener<TagsRecentResp> { response ->
                    // Display the first 500 characters of the response string.

                    val images = response.data ?: arrayOf()
                    val sel = Random().nextInt(images.size)

                    val image = images.get(sel)

                    DisplayImageUrl(binding?.imageContainer!!).execute(image.images?.standardResImg?.url)

                    for (img in images) {
                        Log.d(TAG, "==========================")
                        Log.d(TAG, "Type: " + (img.type ?: "None"))
                        Log.d(TAG, "Filter: " + (img.filter ?: "None"))
                        Log.d(TAG, "Link: " + (img.link ?: "None"))
                        Log.d(TAG, "User: " + (img.user?.toString() ?: "None"))
                        Log.d(TAG, "Location: " + (img.location?.toString() ?: "None"))
                        Log.d(TAG, "Images: " + (img.images?.toString() ?: "None"))
                        Log.d(TAG, "Tags: " + TextUtils.join(", ", img.tags))
                    }
                    Log.d(TAG, "==========================")
                },
                Response.ErrorListener { error -> Log.d(TAG, "Error sending request: " + error.message) })

        // Add the request to the RequestQueue.
        queue.add(recentReq)
    }

    companion object {

        private val ACCESS_TOKEN = ""
        private val TAG = LiveTagsActivity::class.java!!.getSimpleName()
    }
}

open class DisplayImageUrl(imageView: ImageView) : AsyncTask<String, Void, Bitmap?>() {

    val mImageView = imageView

    override fun doInBackground(vararg urls: String?) : Bitmap? {
        val url = urls[0] ?: "";
        var mIcon11: Bitmap? = null
        try {
            val ins = java.net.URL(url).openStream()
            mIcon11 = BitmapFactory.decodeStream(ins)
        } catch (e: Exception) {
            Log.e("Error", e.message)
            e.printStackTrace()
        }

        return mIcon11
    }

    override fun onPostExecute(result: Bitmap?) {
        super.onPostExecute(result)

        mImageView.setImageBitmap(result)

    }
}
