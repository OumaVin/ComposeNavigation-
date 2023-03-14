package com.joelkanyi.composenavigation_assignment.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable

import com.joelkanyi.composenavigation_assignment.Screen.Detail_Screen
import com.joelkanyi.composenavigation_assignment.Screen.Home_Screen
import com.joelkanyi.composenavigation_assignment.Screen.Rating_Screen


@Composable
fun NavGraph(navController: NavHostController) {
    NavHost(
        navController = navController, 
        startDestination =Screen.Screen1.route
    ){
        
        composable(route= Screen.Screen1.route){
            Home_Screen(navController = navController)
        }

        composable(route =Screen.Screen2.route){
            Detail_Screen(navController = navController)
        }

        composable(route= Screen.Screen3.route)
        {
            Rating_Screen(navController = navController)
        }
    }
    
}

