package com.example.iristest

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.iristest.compose.EmployeeIntro
import com.example.iristest.compose.User

class EmployeeIntroActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            EmployeeIntro(user = User("John", "P101000"))

        }
    }
}



