package com.maxlepan.firstapplication.module.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maxlepan.firstapplication.models.Post
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FeedViewModel:ViewModel() {

    private val _postList = MutableStateFlow<List<Post>>(listOf())
    val postList = _postList.asStateFlow()

    private val _title = MutableStateFlow<String>("")
    var title = _title.asStateFlow()

    fun getPosts() {

        viewModelScope.launch {
            _postList.emit(
                listOf(
                    Post(
                        "0",
                        "Jacques",
                        "img.png",
                        "10-10-2022",
                        "Petites vacances",
                        listOf(),
                        listOf(),
                        listOf()
                    )
                )
            )
        }
    }

}