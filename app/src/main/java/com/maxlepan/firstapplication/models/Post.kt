package com.maxlepan.firstapplication.models

data class Post(
    val id:String,
    val author:User,
    val imageUrl: String,
    val publishedDate:String,
    val description:String,
    val likes:List<String>,
    val comments:List<String>,
    val identifications:List<String>,
)
