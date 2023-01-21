package com.example.instagram_reels

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import com.example.instagram_reels.ui.theme.Instagram_reelsTheme
import com.example.instagram_reels.ui.views.ReelsView

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Instagram_reelsTheme{
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    ReelsView()
                }
            }
        }
    }
}
