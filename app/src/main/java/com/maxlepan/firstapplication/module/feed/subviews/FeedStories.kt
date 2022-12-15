package com.maxlepan.firstapplication.module.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.text.style.TextOverflow
import androidx.lifecycle.viewmodel.compose.viewModel
import com.maxlepan.firstapplication.ui.components.RoundedImage
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment

@Composable
fun FeedStories(feedViewModel: FeedViewModel) {
    val stories = feedViewModel.stories.collectAsState()

    Row (
        Modifier
            .fillMaxWidth()
            .background(Color.Black)
            .padding(20.dp)
            .horizontalScroll(rememberScrollState())
    ) {
        stories.value.forEach { user ->
            Column (
                horizontalAlignment = CenterHorizontally,
                modifier = Modifier
                    .padding(10.dp, 0.dp)
                    ) {
                RoundedImage(author = user, size = 70.dp)
                Text(
                    user.userName,
                    color = Color.White,
                    modifier = Modifier
                        .width(70.dp),
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedStoriesPreview() {
    FeedStories(FeedViewModel())
}