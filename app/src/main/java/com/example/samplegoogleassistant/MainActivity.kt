package com.example.samplegoogleassistant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.example.samplegoogleassistant.ui.theme.SampleGoogleAssistantTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SampleGoogleAssistantTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MainMessage()
                }
            }
        }
    }
}

@Composable
fun MainMessage() {
    Center {
        Text(text = "Hello App Actions!")
    }
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    SampleGoogleAssistantTheme {
        MainMessage()
    }
}