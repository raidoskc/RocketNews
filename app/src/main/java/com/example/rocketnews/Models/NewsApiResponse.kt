package com.example.rocketnews.Models

data class NewsApiResponse(
    var status: String,
    var totalResults: String,
    var articles: NewsHeadLines
)
