package com.example.businesscard

import android.R.attr.strokeWidth
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.drawWithCache
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.drawscope.Stroke
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.font.FontWeight.Companion.Bold
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    BusinessCard(
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                            .background(color = colorResource(R.color.background_color))
                    )
                }
            }
        }
    }
}

@Composable
fun BusinessCard(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(4f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Image(
                painter = painterResource(R.drawable.android_seeklogo),
                "Android Developer Logo",
                modifier = Modifier
                    .padding(12.dp)
                    .size(160.dp),
            )
            Text(
                text = stringResource(R.string.my_name),
                color = Color.White,
                fontSize = 32.sp,
                modifier = Modifier.padding(bottom = 16.dp),
            )
            Box(contentAlignment = Alignment.Center) {
                Text(
                    text = stringResource(R.string.my_activity),
                    color = Color(0xFFA6C736),
                    fontWeight = Bold,
                    fontSize = 16.sp,
                )
            }
        }
        Column(
            modifier = Modifier
                .fillMaxSize()
                .weight(1.5f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            ContactRow(
                logo = painterResource(R.drawable.phone_call),
                contact_text = stringResource(R.string.my_phone_number),
            )
            ContactRow(
                logo = painterResource(R.drawable.mail),
                contact_text = stringResource(R.string.my_email),
            )
            ContactRow(
                logo = painterResource(R.drawable.github),
                contact_text = stringResource(R.string.my_github),
            )
        }
    }

}

@Composable
fun ContactRow(logo: Painter, contact_text: String, modifier: Modifier = Modifier) {
    Row(modifier = modifier) {
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier
                .padding(12.dp)
                .size(24.dp),
            colorFilter = ColorFilter.tint(Color.White)

        )
        Text(
            text = contact_text,
            color = Color.White,
            fontSize = 16.sp,
            modifier = Modifier.padding(bottom = 12.dp, top = 12.dp)
        )
    }
}


@Preview(showBackground = true)
@Composable
fun BusinessCardPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}