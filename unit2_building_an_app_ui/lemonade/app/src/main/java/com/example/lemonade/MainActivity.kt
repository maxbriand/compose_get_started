package com.example.lemonade

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarColors
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.lemonade.ui.theme.LemonadeTheme


class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalMaterial3Api::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LemonadeTheme {
                Scaffold(
                    topBar = {
                        CenterAlignedTopAppBar(
                            title = {
                                Text(
                                    "Lemonade",
                                )
                            },
                            colors = TopAppBarColors(
                                Color(0xFFF9E44C),
                                scrolledContainerColor = Color(0xFFF9E44C),
                                navigationIconContentColor = Color(0xFFF9E44C),
                                titleContentColor = Color.Black,
                                actionIconContentColor = Color(0xFFF9E44C),
                            )
                        )
                    },
                ) { innerPadding ->
                    Lemonade(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(color = Color(0xFFfffbff))
                    )
                }
            }
        }
    }
}

@Composable
fun Lemonade(modifier: Modifier = Modifier) {
    var lemonPressedTime by rememberSaveable {mutableIntStateOf(0)}
    var pageNumber by rememberSaveable {mutableIntStateOf(value = 1) }
    var page = when (pageNumber) {
        1 -> painterResource(R.drawable.lemon_tree) to stringResource(R.string.step_1)
        2 -> painterResource(R.drawable.lemon_squeeze) to stringResource(R.string.step_2)
        3 -> painterResource(R.drawable.lemon_drink) to stringResource(R.string.step_3)
        else -> painterResource(R.drawable.lemon_restart) to stringResource(R.string.step_4)
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center,
    ) {
        Image(
            painter = page.first,
            contentDescription = page.toString(),
            modifier = Modifier.clickable(onClick = {
                if (lemonPressedTime != 0) {
                    lemonPressedTime--
                    return@clickable
                }

                when (pageNumber) {
                    in 1..3 -> pageNumber++
                    4 -> pageNumber = 1
                }

                if (pageNumber == 2)
                    lemonPressedTime = (1..3).random()
            })
        )
        Spacer(
            modifier = Modifier.padding(16.dp)
        )
        Text(
            text = page.second,
        )
    }
}

@Preview(showBackground = true)
@Composable
fun LemonadePreview() {
    LemonadeTheme {
        Lemonade(Modifier)
    }
}