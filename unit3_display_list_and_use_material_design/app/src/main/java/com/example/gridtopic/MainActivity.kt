package com.example.gridtopic

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.gridtopic.ui.theme.GridTopicTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            GridTopicTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GripTopicLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun GripTopicLayout(modifier: Modifier = Modifier) {

}

@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card() {
        Row() {
            Image(painter = painterResource(topic.image), contentDescription = null)
            Column() {
                Text(text = stringResource(id = topic.name))
                Row() {
                    Image(painter = painterResource(id = R.drawable.ic_grain), null)
                    Text(text = "${topic.articleNumber}")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GripTopicLayoutPreview() {
    GridTopicTheme {
        GripTopicLayout()
    }
}