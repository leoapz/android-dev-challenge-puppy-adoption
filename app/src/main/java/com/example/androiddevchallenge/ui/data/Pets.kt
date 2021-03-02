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
package com.example.androiddevchallenge.ui.data

import com.example.androiddevchallenge.R
import com.example.androiddevchallenge.ui.model.Pet

fun getPetList(): MutableList<Pet> {
    val list: MutableList<Pet> = mutableListOf()
    list.add(
        Pet(
            1,
            R.drawable.leon,
            "Leon",
            "Macho",
            2,
            "Morder los trapos de piso",
            "Muy jugueton, cariñoso a veces. Le encanta dormir bajo la cama, hace su siesta junto a sus dueños. En dias de lluvia, hay que sujetarlo por que ama el barro. Ladra a las personas pero solo detras de las rejas de su casa. Cuando se encuentra en la calle solo le gusta analizar su territorio",
            "2kg",
        )
    )

    list.add(
        Pet(
            2,
            R.drawable.paco,
            "Paco",
            "Macho",
            1,
            "Comer el alimento de su amigo canino (Leon)",
            "Excelente amigo. Tranquilo. Jugueton solo con Leon.",
            "1kg",
        )
    )

    return list
}
