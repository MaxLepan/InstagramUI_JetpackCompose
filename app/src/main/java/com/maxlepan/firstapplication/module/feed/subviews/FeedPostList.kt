package com.maxlepan.firstapplication.module.feed

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material.Text
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.sp
import coil.compose.rememberAsyncImagePainter
import com.maxlepan.firstapplication.ui.components.RoundedImage


@Composable
fun FeedPostList(feedViewModel: FeedViewModel) {
    val postList = feedViewModel.postList.collectAsState()
    Column (
        Modifier
            .verticalScroll(rememberScrollState())
            )
    {
        postList.value.forEach { post ->
            Column(
                Modifier
                    .fillMaxHeight()
                    .fillMaxWidth()
                    .background(Color.Black)
                    .padding(20.dp)
            ) {
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(0.dp, 10.dp),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
                ) {
                    Row (
                        verticalAlignment = Alignment.CenterVertically
                            ) {
                        RoundedImage(author = post.author, size= 50.dp)
                        Column (
                            Modifier
                                .fillMaxWidth()
                                .padding(15.dp, 0.dp, 0.dp, 0.dp)
                                ) {
                            Text(
                                post.author.userName,
                                color = Color.White,
                                fontSize = 18.sp
                            )
                            Text(
                                post.publishedDate,
                                color = Color.Gray
                            )
                        }
                    }
                }
                Image(
                    painter = rememberAsyncImagePainter(post.imageUrl),
                    contentDescription = post.description,
                    contentScale= ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(400.dp)
                        .background(Color.Gray)
                )
                Text(
                    post.description,
                    Modifier.padding(0.dp, 10.dp),
                    color = Color.White
                )
                Row(
                    Modifier.padding(0.dp, 10.dp)
                ) {
                    Text(
                        post.comments.count().toString() + " comments",
                        Modifier
                            .padding(0.dp, 0.dp, 20.dp, 0.dp),
                        color = Color.White
                    )
                    Text(
                        post.likes.count().toString() + " likes",
                        color = Color.White
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun FeedPostListPreview() {
    FeedPostList(FeedViewModel())
}