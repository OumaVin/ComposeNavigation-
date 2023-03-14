package com.joelkanyi.composenavigation_assignment.navigation

sealed class Screen(val route: String) {
    object Screen1: Screen(route = "Home_screen")
    object Screen2: Screen(route = "Detail_Screen")

    object Screen3: Screen(route = "Rating_Screen")

    }

