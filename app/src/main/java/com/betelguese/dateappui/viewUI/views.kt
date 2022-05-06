package com.betelguese.dateappui.viewUI

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
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
import com.betelguese.dateappui.ScreenViewModel

data class select(
    val name: String,
    val image: Int = R.drawable.love
)

val options = listOf<select>(
    select("Hiking", R.drawable.hiking),
    select("Foodie", R.drawable.foodie),
    select("Travel", R.drawable.hiking),
    select("Fitness", R.drawable.fitness),
    select("Camping", R.drawable.camp),
    select("Movie", R.drawable.movie),
    select("Work", R.drawable.work)
)
val imageMap = mapOf<String, Int>(
    "Hiking" to R.drawable.hiking,
    "Foodie" to R.drawable.foodie,
    "Travel" to R.drawable.hiking,
    "Fitness" to R.drawable.fitness,
    "Camping" to R.drawable.camp,
    "Movie" to R.drawable.movie,
    "Work" to R.drawable.work,
    "Love" to R.drawable.love


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
fun Rowlisty(vm: ScreenViewModel) {
    LazyRow(
        modifier = Modifier
            .fillMaxWidth()
            .padding(10.dp)
    ) {
        itemsIndexed(options) { _, item ->

            Listcard(item.name) {
                vm.getImageValue(item.name)
            }
        }
    }
}

@Composable
fun Listcard(item: String, onclick: () -> Unit) {
    Card(
        modifier = Modifier
            .padding(10.dp)
            .clickable {
                onclick
            }
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

        }
    }
}