package com.example.rocketnews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.rocketnews.Models.NewsApiResponse
import com.example.rocketnews.Models.RetrofitClient
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class AllNewsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_news)


        RetrofitClient.instance.TopHeadlines("gr", "bfc316f9f24d42ad82c4ef5b8440994f")
            .enqueue(object : Callback<NewsApiResponse> {
                override fun onFailure(call: Call<NewsApiResponse>, t: Throwable) {
                    Toast.makeText(this@AllNewsActivity, "wrong", Toast.LENGTH_LONG).show()
                }

                override fun onResponse(call: Call<NewsApiResponse>, response: Response<NewsApiResponse>) {
                    Toast.makeText(this@AllNewsActivity, "Ok", Toast.LENGTH_LONG).show()
                }
            })

    }
}