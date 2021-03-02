package com.example.androiddevchallenge.ui.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.ColorPainter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.model.Pet
import com.example.androiddevchallenge.ui.theme.transparent

@Composable
fun PuppyItem(puppy: Pet, onPetclick:(puppy: Pet)->Unit) {
    Surface(
        color = MaterialTheme.colors.background,
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Row(
            modifier = Modifier
                .padding(start = 15.dp, end = 15.dp, top = 3.dp, bottom = 15.dp)
                .fillMaxWidth()
                .fillMaxHeight()

        ) {
            Card(
                modifier = Modifier
                    .fillMaxWidth()
                    .fillMaxHeight()
                    .clickable(
                        onClick = {
                            onPetclick(puppy)
                        }
                    ),
                elevation = 10.dp,
                contentColor = Color.White


            ) {
                Image(
                    painter = painterResource(id = puppy.image),
                    contentDescription = puppy.description,
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    alignment = Alignment.CenterStart,
                    contentScale = ContentScale.Crop
                )
                Column(
                    verticalArrangement = Arrangement.Center
                ) {
                    Text(
                        text = puppy.name,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp, bottom = 5.dp),
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.Bold,
                            fontSize = 30.sp,
                            background = Color.LightGray,
                        ),
                        color = Color.Black
                    )
                    Text(
                        text = "Edad : "+puppy.age.toString()+" Años",
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp, bottom = 15.dp),
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 20.sp,
                            background = Color.LightGray,
                        ),
                        color = Color.Black
                    )
                    Text(
                        text = puppy.gender,
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp, end = 10.dp, bottom = 15.dp),
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 15.sp,
                            background = Color.LightGray,
                        ),
                        color = Color.Black
                    )
                }
            }
        }
    }
}