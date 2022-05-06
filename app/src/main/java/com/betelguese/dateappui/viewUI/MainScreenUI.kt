package com.betelguese.dateappui.viewUI

import android.widget.Toast
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.betelguese.dateappui.R

val iconsize = 30.dp
@Composable
fun MainScreenUI(onclick: () -> Unit) {
    val ctx = LocalContext.current
    Scaffold(modifier = Modifier.fillMaxSize()) {
        Box(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(id = R.drawable.loginui),
                contentDescription = null,
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.FillBounds
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .fillMaxSize()
                    .align(Alignment.Center),
                verticalArrangement = Arrangement.Center
            ) {
                Image(
                    painter = painterResource(id = R.drawable.logo),
                    contentDescription = null
                )
                Spacer(modifier = Modifier.padding(bottom = 8.dp, top = 10.dp))

                Text(
                    text = "Meet , Match & Marry",
                    fontWeight = FontWeight.Bold,
                    fontFamily = FontFamily.SansSerif,
                    fontSize = 16.sp,
                    color = Color.White.copy(0.7f)
                )
                Spacer(modifier = Modifier.padding(bottom = 48.dp, top = 10.dp))
                Button(
                    onClick = {
                        Toast.makeText(
                            ctx,
                            "Signed with Facebook",
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    border = BorderStroke(width = 2.dp, color = Color.LightGray),
                    modifier = Modifier
                        .padding(5.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.elevation(12.dp)

                )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.fb),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(iconsize),
                        tint = Color.White
                    )
                    Text(
                        text = "Sign In with FaceBook",
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color.White.copy(0.9f)
                    )
                }
                Spacer(modifier = Modifier.padding(10.dp))
                Button(
                    onClick = {
                        Toast.makeText(
                            ctx,
                            "Signed with Google",
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    border = BorderStroke(width = 2.dp, color = Color.LightGray),
                    modifier = Modifier
                        .padding(5.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.elevation(12.dp)

                )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.google),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(iconsize),
                        tint = Color.White
                    )
                    Text(
                        text = "Sign In with Google    ",
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color.White.copy(0.9f)
                    )
                }
                Spacer(modifier = Modifier.padding(10.dp))
                Button(
                    onClick = {
                        Toast.makeText(
                            ctx,
                            "Signed with Email",
                            Toast.LENGTH_LONG
                        ).show()
                    },
                    border = BorderStroke(width = 2.dp, color = Color.LightGray),
                    modifier = Modifier
                        .padding(5.dp),
                    shape = RoundedCornerShape(10.dp),
                    elevation = ButtonDefaults.elevation(12.dp)

                )
                {
                    Icon(
                        painter = painterResource(id = R.drawable.email),
                        contentDescription = null,
                        modifier = Modifier
                            .padding(8.dp)
                            .size(iconsize),
                        tint = Color.White
                    )
                    Text(
                        text = "Sign In with Email     ",
                        fontSize = 15.sp,
                        fontStyle = FontStyle.Normal,
                        fontFamily = FontFamily.Serif,
                        fontWeight = FontWeight.Bold,
                        color = Color.White.copy(0.9f)
                    )
                }
                Spacer(modifier = Modifier.padding(15.dp))
                TextButton(onClick = onclick) {
                    Text(
                        text = "Logging In ->",
                        fontWeight = FontWeight.ExtraBold,
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 13.sp,
                        color = Color.White
                    )
                }

            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun Prevvyy() {
    MainScreenUI {

    }
}