package com.grantech.gabaynijuan.presentation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import com.grantech.gabaynijuan.ui.theme.GabayNiJuanTheme


@Composable
fun MainView(innerPaddingValues: PaddingValues) {
    val viewModel : MainViewModel = hiltViewModel()
    val levelState by viewModel.mainViewState.collectAsState()

    LaunchedEffect(Unit) {
        viewModel.getCandidateList()
    }

    Card {
        Text(text = "Hello, Mofo!")
    }

}
