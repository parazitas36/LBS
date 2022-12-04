package com.example.lbs

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import com.example.lbs.api.ApiCalls
import com.example.lbs.databinding.ActivityMainBinding
import com.example.lbs.utils.Constants.Companion.BASE_URL
import okhttp3.*
import java.io.IOException

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var textView: TextView = findViewById(R.id.text_view);
        var button = findViewById(R.id.feth_btn) as Button
        button.setOnClickListener({
                button.text = "Clicked"
                var result = ApiCalls().getData("vartotojai")
        })
    }
}