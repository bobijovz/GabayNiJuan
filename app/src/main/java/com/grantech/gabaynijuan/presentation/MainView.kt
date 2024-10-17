package com.grantech.gabaynijuan.presentation

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel


@Composable
fun MainView() {
    val viewModel : MainViewModel = hiltViewModel()
    val levelState by viewModel.mainViewState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.getCandidateList()
    }

    Text(
        text = "Hello Mofo"
    )

}