package com.mobileexam.bitong.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.mobileexam.bitong.R

data class Character(
    val id: Int,
    @StringRes val name: Int,
    @StringRes val status: Int,
    @StringRes val species: Int,
    @StringRes val gender: Int,
    @StringRes val origin: Int,
    @DrawableRes val image: Int
)

val characters = listOf(
    Character(1, R.string.Character_1, R.string.ALIVE, R.string.HUMAN, R.string.MALE, R.string.EARTH_1, R.drawable.rick_sanchez),
    Character(2, R.string.Character_2, R.string.ALIVE, R.string.HUMAN, R.string.MALE, R.string.UNKNOWN, R.drawable.morty_smith),
    Character(3, R.string.Character_3, R.string.ALIVE, R.string.HUMAN, R.string.FEMALE, R.string.EARTH_2, R.drawable.summer_smith),
    Character(4, R.string.Character_4, R.string.ALIVE, R.string.HUMAN, R.string.FEMALE, R.string.EARTH_2, R.drawable.beth_smith),
    Character(5, R.string.Character_5, R.string.ALIVE, R.string.HUMAN, R.string.MALE, R.string.EARTH_2, R.drawable.jerry_smith),
    Character(6, R.string.Character_6, R.string.ALIVE, R.string.ALIEN, R.string.FEMALE, R.string.ABADANGO, R.drawable.abadango_cluster_princess),
    Character(7, R.string.Character_7, R.string.UNKNOWN, R.string.HUMAN, R.string.MALE, R.string.EARTH_2, R.drawable.abradolf_lincler),
    Character(8, R.string.Character_8, R.string.DEAD, R.string.HUMAN, R.string.MALE, R.string.UNKNOWN, R.drawable.adjudicator_rick),
    Character(9, R.string.Character_9, R.string.DEAD, R.string.HUMAN, R.string.MALE, R.string.EARTH_2, R.drawable.agency_director),
    Character(10, R.string.Character_10, R.string.DEAD, R.string.HUMAN, R.string.MALE, R.string.UNKNOWN, R.drawable.alan_rails),
    Character(11, R.string.Character_11, R.string.DEAD, R.string.HUMAN, R.string.MALE, R.string.EARTH_2, R.drawable.albert_einstein),
    Character(12, R.string.Character_12, R.string.DEAD, R.string.HUMAN, R.string.MALE, R.string.EARTH_1, R.drawable.alexander),
    Character(13, R.string.Character_13, R.string.UNKNOWN, R.string.ALIEN, R.string.UNKNOWN, R.string.UNKNOWN, R.drawable.alien_googah),
    Character(14, R.string.Character_14, R.string.UNKNOWN, R.string.ALIEN, R.string.MALE, R.string.UNKNOWN, R.drawable.alien_morty),
    Character(15, R.string.Character_15, R.string.UNKNOWN, R.string.ALIEN, R.string.MALE, R.string.UNKNOWN, R.drawable.alien_rick),
    Character(16, R.string.Character_16, R.string.DEAD, R.string.ALIEN, R.string.MALE, R.string.UNKNOWN, R.drawable.amish_cyborg),
    Character(17, R.string.Character_17, R.string.ALIVE, R.string.HUMAN, R.string.FEMALE, R.string.EARTH_1, R.drawable.annie),
    Character(18, R.string.Character_18, R.string.ALIVE, R.string.HUMAN, R.string.MALE, R.string.UNKNOWN, R.drawable.antenna_morty),
    Character(19, R.string.Character_19, R.string.UNKNOWN, R.string.HUMAN, R.string.MALE, R.string.UNKNOWN, R.drawable.antenna_rick),
    Character(20, R.string.Character_20, R.string.UNKNOWN, R.string.HUMAN, R.string.MALE, R.string.UNKNOWN, R.drawable.ants_in_my_eyes_johnson)
)