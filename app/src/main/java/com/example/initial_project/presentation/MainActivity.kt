package com.example.initial_project.presentation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.initial_project.ui.theme.InitialprojectTheme
import com.example.utils.Source

class MainActivity() : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var sendDebug: Boolean? = false
        val debug = intent.data?.host

        if (debug == "banner") {
            val checkDebug = intent.data?.getQueryParameter("show")
            if (checkDebug == "true") {
                sendDebug = true
            }
        }
        val startDestination = "main"
        setContent {
            InitialprojectTheme {
                AppNavHost(startDestination = startDestination, sendDebug = sendDebug ?: false)
            }
        }
    }
}