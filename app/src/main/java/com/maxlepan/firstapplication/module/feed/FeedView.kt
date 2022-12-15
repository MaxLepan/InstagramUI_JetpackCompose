package com.maxlepan.firstapplication.module.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel
import com.maxlepan.firstapplication.Greeting
import com.maxlepan.firstapplication.ui.theme.FirstApplicationTheme

@Composable
fun FeedView() {
    val feedViewModel = viewModel<FeedViewModel>()

    Column (
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.Black)
    ) {
        FeedStories(feedViewModel)

        FeedPostList(feedViewModel)
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FeedView()
}