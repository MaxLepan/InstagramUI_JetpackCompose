package com.maxlepan.firstapplication.module.feed

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.lifecycle.viewmodel.compose.viewModel

@Composable
fun FeedView() {
    val feedViewModel = viewModel<FeedViewModel>()
    Column (Modifier
                .background(Color.Red)
                .padding(20.dp)) {

    }
}