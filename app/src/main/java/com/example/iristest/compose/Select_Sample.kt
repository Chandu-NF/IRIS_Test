package com.example.iristest.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.paint
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R
import kotlinx.coroutines.delay

@Composable
fun Select_Sample() {
    var showText by remember { mutableStateOf(true) }

    LaunchedEffect(Unit) {
        delay(2000)
        showText = false
    }
    Column(
        modifier = Modifier
            .fillMaxSize()
            .paint(
                painterResource(id = R.drawable.bg),
                contentScale = ContentScale.FillBounds
            ),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        if (showText) {
            Image(
                painter = painterResource(id = R.drawable.group_463667__1_),
                contentDescription = null,
                modifier = Modifier
                    .fillMaxWidth(0.2f)
                    .fillMaxHeight(0.23f)
            )
            Spacer(modifier = Modifier.height(62.dp))
            Text(
                text = "Selected Sample Successfully",
                color = Color.White,
                fontSize = 52.sp
            )
        }
    }
}

@Preview(device = Devices.TABLET)
@Composable
fun Select_Sample_Preview() {
    Select_Sample()
}