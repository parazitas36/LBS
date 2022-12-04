package com.example.lbs.api

import com.example.lbs.models.User
import com.example.lbs.utils.Constants
import okhttp3.*
import java.io.IOException

class ApiCalls {
    fun getData(endpoint:String){
        var client = OkHttpClient()

        var request = Request.Builder()
            .url(Constants.BASE_URL + endpoint)
            .get()
            .build();

        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {
                var body = response?.body?.string();
            }

            override fun onFailure(call: Call, e: IOException) {
                e.printStackTrace()
            }
        })
    }
}