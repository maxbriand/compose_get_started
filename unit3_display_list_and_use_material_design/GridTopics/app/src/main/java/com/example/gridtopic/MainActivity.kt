package com.example.gridtopic

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
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
    LazyVerticalGrid(
        modifier = modifier, columns = GridCells.Adaptive(minSize = 200.dp)
    ) {
        items(DataSource.topics) { topic ->
            TopicCard(topic)
        }
    }
}

@Composable
fun TopicCard(topic: Topic, modifier: Modifier = Modifier) {
    Card(modifier = Modifier.height(68.dp)) {
        Row(modifier = Modifier.height(68.dp)) {

            Image(
                painter = painterResource(topic.image),
                contentDescription = null,
                modifier = Modifier
                    .height(68.dp)
                    .width(68.dp)
            )

            Column() {
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = stringResource(id = topic.name),
                    modifier = Modifier.padding(start = 16.dp, end = 16.dp),
                    fontStyle = 
                )
                Spacer(modifier = Modifier.height(8.dp))
                Row {
                    Image(
                        painter = painterResource(id = R.drawable.ic_grain),
                        null,
                        modifier = Modifier.padding(start = 16.dp)
                    )
                    Text(
                        text = "${topic.articleNumber}",
                        modifier = Modifier.padding(start = 8.dp)
                    )
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