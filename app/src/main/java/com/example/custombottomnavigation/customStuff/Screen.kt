package com.example.custombottomnavigation.customStuff

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.material.icons.filled.Settings
import androidx.compose.ui.graphics.vector.ImageVector

sealed class Screen(
    val id:String,
    val title:String,
    val icon:ImageVector,
){
    object Home:Screen("home","Home", Icons.Default.Home)
    object Search:Screen("search","Search", Icons.Default.Search)
    object Profile:Screen("profile","Profile", Icons.Default.Person)
    object Settings:Screen("settings","Settings", Icons.Default.Settings)

    object Items{
        val list= listOf(
            Home,Search,Profile,Settings
        )
    }
}

