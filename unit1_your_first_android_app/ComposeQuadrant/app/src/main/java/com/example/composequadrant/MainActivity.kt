package com.example.composequadrant

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.composequadrant.ui.theme.ComposeQuadrantTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeQuadrantTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    ComposeQuadrant(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    )
                }
            }
        }
    }
}

@Composable
fun ComposeQuadrant(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Row(
            modifier = Modifier
                .weight(0.5f)
        ) {
            Quadrant(
                title = stringResource(R.string.title_one),
                content = stringResource(R.string.description_one),
                modifier = Modifier
                    .background(color = colorResource(R.color.purple_light))
                    .weight(0.5f)
                    .fillMaxSize()
                    .padding(16.dp)
            )
            Quadrant(
                title = stringResource(R.string.title_two),
                content = stringResource(R.string.description_two),
                modifier = Modifier
                    .background(color = colorResource(R.color.purple_dark))
                    .weight(0.5f)
                    .fillMaxSize()
                    .weight(0.5f)
                    .padding(16.dp)
            )
        }
        Row(
            modifier = Modifier
                .weight(0.5f)
        ) {
            Quadrant(
                title = stringResource(R.string.title_three),
                content = stringResource(R.string.description_three),
                modifier = Modifier
                    .background(colorResource(R.color.purple_very_dark))
                    .weight(0.5f)
                    .fillMaxSize()
                    .weight(0.5f)
                    .padding(16.dp)


            )
            Quadrant(
                title = stringResource(R.string.title_four),
                content = stringResource(R.string.description_four),
                modifier = Modifier
                    .background(color = colorResource(R.color.purple_very_light))
                    .weight(0.5f)
                    .fillMaxSize()
                    .padding(16.dp)
            )
        }
    }
}

@Composable
fun Quadrant(
    title: String,
    content: String,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            text = title,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(bottom = 16.dp)
        )
        Text(text = content, textAlign = TextAlign.Justify)

    }
}

@Preview(showBackground = true)
@Composable
fun ComposeQuadrantPreview() {
    ComposeQuadrantTheme {
        ComposeQuadrant()
    }
}
