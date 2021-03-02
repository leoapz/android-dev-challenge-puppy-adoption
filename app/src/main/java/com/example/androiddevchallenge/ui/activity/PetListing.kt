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

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.navigate
import com.example.androiddevchallenge.ui.data.getPetList
import com.example.androiddevchallenge.ui.model.Pet
import com.example.androiddevchallenge.ui.navigation.Screen

@Composable
fun PetListing(navController: NavController) {

    PetList(pets = getPetList()) { pet ->
        navController.navigate(Screen.PetDetailsScreen(pet.id).getCalculatedRoute())
    }
}

@Composable
fun PetList(pets: List<Pet>, onPetSelected: (Pet) -> Unit) {
    Column(modifier = Modifier.background(color = Color.White)) {
        Text(
            text = "Adoptame  \uD83D\uDC3E ",
            modifier = Modifier
                .fillMaxWidth()
                .wrapContentHeight()
                .padding(10.dp),
            style = TextStyle(
                fontFamily = FontFamily.SansSerif,
                fontWeight = FontWeight.SemiBold,
                fontSize = 20.sp
            )
        )
        LazyColumn(
            content = {
                items(pets) { puppy ->
                    PuppyItem(
                        puppy,
                    ) {
                        onPetSelected(puppy)
                    }
                }
            }

        )
    }
}
