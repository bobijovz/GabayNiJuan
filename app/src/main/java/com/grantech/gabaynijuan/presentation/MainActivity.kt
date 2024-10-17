package com.grantech.gabaynijuan.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.grantech.gabaynijuan.domain.GetCandidatesUseCase
import com.grantech.gabaynijuan.ui.theme.GabayNiJuanTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GabayNiJuanTheme {
                MainView()
            }
        }
    }
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    GabayNiJuanTheme {
        MainView()
    }
}