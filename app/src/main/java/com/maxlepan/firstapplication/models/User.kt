package com.maxlepan.firstapplication.models

data class User(
    val id:String,
    val userName:String,
    val profilePictureUrl:String,
    val followers:List<User>,
    val following:List<User>,
    val posts:List<Post>,
    val description:String
)
