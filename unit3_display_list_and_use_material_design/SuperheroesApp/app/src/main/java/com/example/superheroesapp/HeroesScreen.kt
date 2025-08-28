package com.example.superheroesapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp

@Composable
fun HeroesScreen() {

}

@Composable
fun HeroItem(
    @StringRes name: Int,
    @StringRes description: Int,
    @DrawableRes image: Int,
) {
    Card(
        elevation = CardDefaults.cardElevation(defaultElevation = 2.dp),
        modifier = Modifier
            .height(72.dp)
            .padding(16.dp),
    ) {
        Column {
            Text(
                text = stringResource(description)
            )
            Text(
                text = stringResource(description)
            )
        }
        Box {
            Image(
                painter = painterResource(id = image),
                contentDescription = null,
                modifier = Modifier
                    .height(72.dp)
                    .width(72.dp)
                    .clip(CardDefaults.shape //in progress
            )
        }
    }

}
