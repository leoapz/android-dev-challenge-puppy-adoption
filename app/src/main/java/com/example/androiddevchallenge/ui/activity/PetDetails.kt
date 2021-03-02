/*
 * Copyright 2021 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.androiddevchallenge.ui.activity

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.requiredWidthIn
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.androiddevchallenge.ui.data.getPetList
import com.example.androiddevchallenge.ui.model.Pet
import com.example.androiddevchallenge.ui.theme.black
import com.example.androiddevchallenge.ui.theme.grey
import com.example.androiddevchallenge.ui.theme.light

@Composable
fun PetDetails(petId: Int) {
    Surface(color = MaterialTheme.colors.background) {
        val pet = getPetList().find { it.id == petId }
        pet?.let { PetDetail(it) }
    }
}

@Composable
fun PetDetail(pet: Pet) {

    Column {
        Row(
            Modifier.padding(10.dp)
        ) {
            Image(
                contentDescription = "description of the image",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                painter = painterResource(id = pet.image),
                alignment = Alignment.CenterStart,
                contentScale = ContentScale.Crop
            )
            Text(
                text = pet.name,
                modifier = Modifier
                    .fillMaxWidth()
                    .wrapContentHeight()
                    .padding(end = 20.dp),
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 20.sp
                ),
                textAlign = TextAlign.Center
            )
        }
        Row(

            Modifier
                .fillMaxWidth()
                .requiredWidthIn(1.dp)
                .padding(top = 15.dp)
        ) {
            GetCard("Genero", pet.gender)
            GetCard("Edad", "${pet.age} Months")
            GetCard("Peso", "${pet.weight} Kg")
            GetCard("Hobby", pet.hobby)
        }
        Spacer(
            Modifier
                .fillMaxWidth()
                .height(11.dp)
                .padding(start = 15.dp, end = 15.dp, top = 10.dp)
                .background(black)
        )
        Text(
            text = "Descripcion",
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 10.dp, top = 10.dp, end = 10.dp),
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.ExtraBold,
                fontSize = 18.sp,
                color = black,
                textAlign = TextAlign.Center
            )
        )
        Text(
            text = pet.description,
            modifier = Modifier
                .wrapContentWidth()
                .padding(start = 10.dp, bottom = 10.dp, end = 10.dp),
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                fontSize = 13.sp,
                color = grey,
                textAlign = TextAlign.Center
            )
        )
        Column(
            modifier = Modifier.fillMaxWidth().fillMaxHeight(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.End
        ) {
            Card(
                modifier = Modifier
                    .width(180.dp)
                    .height(45.dp)
                    .clickable(
                        onClick = {
                        }
                    ),
                shape = RoundedCornerShape(
                    topStart = 15.dp, bottomStart = 15.dp
                ),
                elevation = 10.dp,
                backgroundColor = light
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Adoptame \uD83D\uDC3E",
                        modifier = Modifier
                            .wrapContentWidth()
                            .wrapContentHeight(),
                        textAlign = TextAlign.Center,
                        style = TextStyle(
                            fontFamily = FontFamily.SansSerif,
                            fontWeight = FontWeight.SemiBold,
                            fontSize = 18.sp,
                            color = black,
                            textAlign = TextAlign.Center
                        )
                    )
                }
            }
        }
    }
}

@Composable
fun GetCard(label: String, value: String) {
    Box {
        Column(
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = label,
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(start = 10.dp, top = 10.dp, end = 10.dp),
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.ExtraBold,
                    fontSize = 17.sp,
                    color = black,
                    textAlign = TextAlign.Center
                )
            )
            Text(
                text = value,
                modifier = Modifier
                    .wrapContentWidth()
                    .padding(start = 10.dp, bottom = 10.dp, end = 10.dp),
                style = TextStyle(
                    fontFamily = FontFamily.SansSerif,
                    fontWeight = FontWeight.SemiBold,
                    fontSize = 13.sp,
                    color = grey,
                    textAlign = TextAlign.Center
                )
            )
        }
    }
}
