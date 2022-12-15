package com.maxlepan.firstapplication.module.feed

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.maxlepan.firstapplication.models.Post
import com.maxlepan.firstapplication.models.User
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class FeedViewModel:ViewModel() {

    private val _postList = MutableStateFlow<List<Post>>(listOf())
    val postList = _postList.asStateFlow()

    private val _title = MutableStateFlow<String>("")
    val title = _title.asStateFlow()

    private val _stories = MutableStateFlow<List<User>>(listOf())
    val stories = _stories.asStateFlow()

    private val defaultUser1:User = User(
                                "0",
                                "SquarePants_SpongeBob",
                                "https://www.numerama.com/wp-content/uploads/2019/01/sponge-bob-mocking.png",
                                listOf(),
                                listOf(),
                                listOf(),
                                "i like cats"
                            )

    private val defaultUser2:User = User(
                                "1",
                                "MrCrabs",
                                "https://media.tenor.com/cbekJnhykHoAAAAC/spongebob-squarepants-mr-krabs.gif",
                                listOf(),
                                listOf(),
                                listOf(),
                                "i like money"
                            )

    private val defaultUser3:User = User(
                                "2",
                                "Ptrk.Strfsh",
                                "https://pyxis.nymag.com/v1/imgs/0f9/f96/029acbf4c6d8c67e138e1eb06a277204bf-05-patrick.rsquare.w700.jpg",
                                listOf(),
                                listOf(),
                                listOf(),
                                "i like rocks"
                            )

    init {
        getPosts()
        getStories()
    }

    fun getPosts() {
        viewModelScope.launch {
            _postList.emit(
                listOf(
                    Post(
                        "0",
                        defaultUser1,
                        "https://cataas.com/cat/meme",
                        "10-10-2022",
                        "Petites vacances",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "1",
                        defaultUser1,
                        "https://cataas.com/cat",
                        "10-10-2022",
                        "Cool cat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "1",
                        defaultUser2,
                        "https://cataas.com/cat",
                        "10-10-2022",
                        "Cool cat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser3,
                        "https://cataas.com/cat/meme",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser1,
                        "https://cataas.com/cat/meme",
                        "10-10-2022",
                        "J'aime mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser1,
                        "https://cataas.com/cat",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser2,
                        "https://cataas.com/cat",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser2,
                        "https://cataas.com/cat",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser3,
                        "https://cataas.com/cat/meme",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),
                    Post(
                        "0",
                        defaultUser3,
                        "https://cataas.com/cat/meme",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),Post(
                        "0",
                        defaultUser1,
                        "https://cataas.com/cat/meme",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    ),Post(
                        "0",
                        defaultUser1,
                        "https://cataas.com/cat",
                        "10-10-2022",
                        "Autres vacances avec mon chat",
                        listOf(),
                        listOf(),
                        listOf()
                    )
                )
            )
        }
    }

    fun getStories() {
        viewModelScope.launch {
            _stories.emit(
                listOf(
                    defaultUser1,
                    defaultUser2,
                    defaultUser3,
                    defaultUser2,
                    defaultUser3,
                    defaultUser1,
                    defaultUser2,
                    defaultUser1
                )
            )
        }
    }

}