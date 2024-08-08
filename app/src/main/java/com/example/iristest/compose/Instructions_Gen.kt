package com.example.iristest.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R
import kotlinx.coroutines.delay

@Composable
fun Instructions_Gen() {
    var selectedOption by remember { mutableStateOf(SampleOption.GetMySamples) }

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .background(colorResource(id = R.color.bg_black))
                    .fillMaxWidth()
                    .padding(4.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                MenuBack(
                    painter = painterResource(id = R.drawable.frame_56779__1_),
                    isSelected = selectedOption == SampleOption.Back,
                    onClick = { selectedOption = SampleOption.Back }
                )
                Text(
                    text = "General Instructions",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    color = Color.White
                )
                MenuBack(
                    painter = painterResource(id = R.drawable.frame_56780),
                    isSelected = selectedOption == SampleOption.Menu,
                    onClick = { selectedOption = SampleOption.Menu }
                )
            }
        },
        bottomBar = {
            Row(
                modifier = Modifier
                    .background(colorResource(id = R.color.bg_black))
                    .fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.frame_56783),
                    contentDescription = null,
                    modifier = Modifier
                        .fillMaxWidth()
                        .size(110.dp, 110.dp)
                        .padding(32.dp),
                    alignment = Alignment.BottomEnd
                )
            }
        }
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .padding(innerPadding)
                .fillMaxSize()
                .background(colorResource(id = R.color.bg_black)),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Image_Changer()
        }
    }
}

@Composable
fun Image_Changer() {
    var currentIndex by remember { mutableStateOf(0) }
    val images = listOf(
        R.drawable.frame_2,
        R.drawable.frame_3
    )

    LaunchedEffect(Unit) {
        while (true) {
            delay(5000)
            currentIndex = (currentIndex + 1) % images.size
        }
    }
    Image(
        painter = painterResource(id = images[currentIndex]),
        contentDescription = null,
        contentScale = ContentScale.FillBounds,
        modifier = Modifier
            .fillMaxWidth(0.8f)
            .fillMaxHeight(0.9f)
    )

}


@Preview(device = Devices.TABLET)
@Composable
fun Instructions_Gen_Preview() {
    Instructions_Gen()
}