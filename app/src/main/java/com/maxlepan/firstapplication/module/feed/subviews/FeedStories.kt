package com.maxlepan.firstapplication.module.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FeedStories() {
    val feedViewModel = viewModel<FeedViewModel>()

    Column (
        Modifier
            .fillMaxWidth()
            .background(Color.Blue)
            .padding(20.dp)) {
        Text(text = "Stories")
    }
}

@Preview(showBackground = true)
@Composable
fun FeedStoriesPreview() {
    FeedStories()
}