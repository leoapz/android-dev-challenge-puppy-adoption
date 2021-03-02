package com.example.androiddevchallenge.ui.activity

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
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
import com.example.androiddevchallenge.ui.model.Pet
import com.example.androiddevchallenge.ui.navigation.Screen
import com.example.androiddevchallenge.ui.data.getPetList

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
                    ){
                        onPetSelected(puppy)
                    }
                }
            }

        )
    }
}


