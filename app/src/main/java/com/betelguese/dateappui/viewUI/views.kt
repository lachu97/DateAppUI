package com.betelguese.dateappui.viewUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.betelguese.dateappui.R

val options = listOf<String>(
    "Hiking",
    "Foodie",
    "Travel",
    "Fitness",
    "Camping",
    "Movie",
    "Work",
)

@Composable
fun Interests() {

    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Icon(
            painter = painterResource(id = R.drawable.left), contentDescription = null,
            modifier = Modifier
                .size(42.dp)
                .padding(5.dp),
            tint = Color.White.copy(0.5f)
        )
        Text(
            text = "Interests",
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            fontSize = 28.sp,
            textAlign = TextAlign.Center,
            color = Color.White.copy(0.6f),

            )
        Box {

        }
    }

}

@Composable
fun Rowlisty() {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(5.dp)
    ) {
        itemsIndexed(options) { idx, item ->

            Listcard(item)
        }
    }
}

@Composable
fun Listcard(item: String) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .wrapContentSize(),
        elevation = 10.dp,
        shape = RoundedCornerShape(12.dp),
        backgroundColor = Color.White.copy(0.4f)
    ) {
        Text(
            text = item,
            fontFamily = FontFamily.Monospace,
            fontStyle = FontStyle.Normal,
            fontSize = 25.sp,
            color = Color.LightGray.copy(0.4f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun Prev() {
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(MaterialTheme.colors.background)
        ) {
            Image(
                painter = painterResource(id = R.drawable.bg),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Fit
            )
        }
        Column(modifier = Modifier.fillMaxSize()) {

            Interests()
            Spacer(modifier = Modifier.padding(5.dp))
            Rowlisty()
        }
    }
}