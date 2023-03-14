package com.joelkanyi.composenavigation_assignment.Screen

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Star
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.joelkanyi.composenavigation_assignment.navigation.Screen


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun Detail_Screen(
    navController: NavController,
) {
    Scaffold(
        topBar = {
            TopAppBar(
                navigationIcon = {
                    IconButton(
                        onClick = {
                            navController.popBackStack()
                        }) {
                        Icon(
                            imageVector = Icons.Default.ArrowBack,
                            contentDescription = null
                        )
                    }
                },
                title = {
                    Text(text = "Detail Screen")
                }
            )
        }
    ) {
        Box(
            Modifier.fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {

            Spacer(modifier = Modifier.height(10.dp))

            Button(
                onClick = {
                    navController.navigate(Screen.Screen3.route)
                }
            ) {
                Text(text = "Rate Us")
            }


        }
    }
}