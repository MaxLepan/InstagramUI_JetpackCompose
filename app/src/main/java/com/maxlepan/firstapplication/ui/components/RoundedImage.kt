package com.maxlepan.firstapplication.ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.maxlepan.firstapplication.models.User

@Composable
fun RoundedImage(author: User, size: Dp) {
    Image(
        painter = rememberAsyncImagePainter(author.profilePictureUrl),
        contentDescription = author.description,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .clip(RoundedCornerShape(size/2))
            .width(size)
            .height(size)
    )
}