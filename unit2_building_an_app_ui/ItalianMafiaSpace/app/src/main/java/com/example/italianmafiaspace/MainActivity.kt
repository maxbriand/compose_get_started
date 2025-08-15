package com.example.italianmafiaspace

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.italianmafiaspace.ui.theme.ItalianMafiaSpaceTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ItalianMafiaSpaceTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    MafiaSpaceLayout(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun MafiaSpaceLayout(modifier: Modifier = Modifier) {
    var page by remember { mutableIntStateOf(0) }
    val movies: List<List<Int>> = listOf(
        listOf(
            R.drawable.casino, R.string.casino, R.string.casino_date, R.string.casino_director
        ), listOf(
            R.drawable.godfather,
            R.string.the_godfather,
            R.string.the_untouchable_date,
            R.string.the_godfather_director
        ), listOf(
            R.drawable.goodfellas,
            R.string.goodfellas,
            R.string.goodfellas_date,
            R.string.goodfellas_director
        ), listOf(
            R.drawable.donnie_brasco,
            R.string.donnie_brasco,
            R.string.donnie_brasco_date,
            R.string.donnie_brasco_director
        ), listOf(
            R.drawable.the_untouchables,
            R.string.the_untouchable,
            R.string.the_untouchable_date,
            R.string.the_untouchable_director
        )
    )

    Column(
        modifier = modifier.background(color = colorResource(id = R.color.background)),
    ) {
        Column(
            modifier.padding(all = 20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Column(
                modifier = modifier
                    .weight(5f)
                    .fillMaxSize()
                    .background(color = colorResource(R.color.purple_200))
                    .shadow(8.dp, RoundedCornerShape(16.dp))      // draws shadow
            ) {
                Image(
                    painter = painterResource(movies[page][0]),
                    contentDescription = null,
                )
            }
            Column(
                verticalArrangement = Arrangement.Center,

                modifier = modifier
                    .weight(2f)
                    .padding(20.dp)
                    .background(color = colorResource(R.color.background_datas))

            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    textAlign = TextAlign.Center,
                    text = stringResource(movies[page][1]),
                    fontSize = 25.sp,
                )
                Row(
                    modifier = Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = "${stringResource(movies[page][3])} ", fontWeight = FontWeight.Bold
                    )
                    Text(
                        text = "(${stringResource(movies[page][2])})",
                    )
                }
            }
            Row(
                modifier = modifier
                    .weight(1f)
                    .fillMaxWidth()
                    .padding(start = 20.dp, end = 20.dp)
                    .background(color = Color.Red),
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Button(
                    onClick = {
                        if (page != 0) page--
                        else page = 4
                    }) { Text("Previous") }
                Button(
                    onClick = {
                        if (page != 4) page++
                        else page = 0
                    }) { Text("Next") }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun MafiaSpacePreview() {
    ItalianMafiaSpaceTheme {
        MafiaSpaceLayout()
    }
}