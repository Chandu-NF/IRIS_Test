package com.example.iristest.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R

class User(
    val employeeName: String,
    val employeeId: String
)

@Composable
fun EmployeeIntro(user: User) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.bg_black)),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .background(colorResource(id = R.color.box_bg), RoundedCornerShape(36.dp))
                .fillMaxHeight(0.7f)
                .fillMaxWidth(0.8f),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = "Hi, " + user.employeeName,
                color = Color.White,
                fontSize = 70.sp
            )
            Text(
                modifier = Modifier
                    .padding(16.dp),
                text = "( " + user.employeeId + " )",
                color = colorResource(id = R.color.id_text),
                fontSize = 40.sp
            )
        }
    }
}

@Preview(device = Devices.TABLET)
@Composable
fun EmployeeIntroPreview() {
    EmployeeIntro(user = User("John", "P101000"))
}
