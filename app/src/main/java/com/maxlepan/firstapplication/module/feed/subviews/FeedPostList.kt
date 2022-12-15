package com.maxlepan.firstapplication.module.feed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter


@Composable
fun FeedPostList(feedViewModel: FeedViewModel) {
    val postList = feedViewModel.postList.collectAsState()

    Column (
        Modifier
            .fillMaxHeight()
            .fillMaxWidth()
            .background(Color.Black)
            .padding(20.dp)) {
        Row (
            Modifier
                .fillMaxWidth()
                .padding(0.dp, 10.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                postList.value[0].author,
                color = Color.White,
                fontSize = 20.sp
            )
            Text(
                postList.value[0].publishedDate,
                color= Color.Gray
            )
        }
        Image(
            painter = rememberAsyncImagePainter(postList.value[0].imageUrl),
            contentDescription = postList.value[0].description,
            Modifier
                .fillMaxWidth()
                .height(400.dp)
                .background(Color.Gray)
        )
        Text(
            postList.value[0].description,
            Modifier.padding(0.dp, 10.dp),
            color= Color.White
        )
        Row (
            Modifier.padding(0.dp, 10.dp)
                ) {
            Text(
                postList.value[0].comments.count().toString() + " comments",
                Modifier
                    .padding(0.dp, 0.dp, 20.dp, 0.dp),
                color= Color.White
            )
            Text(
                postList.value[0].likes.count().toString() + " likes",
                color= Color.White
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedPostListPreview() {
    FeedPostList(FeedViewModel())
}