package com.example.iristest.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R

//@Composable
//fun MainActivityLayout() {
//    Column(
//        modifier = ModifierL̥
//            .fillMaxSize()
//            .background(Color.Black),
//        verticalArrangement = Arrangement.Center,
//        horizontalAlignment = Alignment.CenterHorizontally
//    ) {
//        Image(
//            painter = painterResource(id = R.drawable.ic_launcher_foreground),
//            contentDescription = "test",
//            modifier = Modifier
//                .align(Alignment.CenterHorizontally)
//                .size(500.dp)
//        )
//        Text(
//            modifier = Modifier.padding(10.dp),
//            text = stringResource(id = R.string.main_activity_instruction),
//            color = Color.White,
//            textAlign = TextAlign.Center,
//            fontSize = 25.sp
//        )
//        }
//    Column (
//        modifier = Modifier
//            .fillMaxSize(),
//        verticalArrangement = Arrangement.Bottom,
//        horizontalAlignment = Alignment.End){
//        Text(
//            text = "Version 1.0",
//            color = Color.White,
//            fontSize = 20.sp
//        )
//    }
//}
//
//@Preview(device = Devices.TABLET)
//@Composable
//fun MainActivityLayoutPreview() {
//    MainActivityLayout()
//}

//@Composable
//fun MainActivityLayout() {
//    Scaffold(
//        bottomBar = {
//            Text(
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .padding(5.dp),
//                textAlign = TextAlign.End,
//                text = "version 1.0",
//                color = Color.White,
//                fontSize = 30.sp
//            )
//
//        }
//    ) { innerPadding ->
//        Box(
//            modifier = Modifier
//                .fillMaxSize()
//                .background(Color.Black)
//                .padding(innerPadding),
//            contentAlignment = Alignment.Center
//        ) {
//            Column(
//                modifier = Modifier
//            ) {
//                Image(
//                    painter = painterResource(id = R.drawable.ic_launcher_name_foreground),
//                    contentDescription = null,
//                    contentScale = ContentScale.Crop,
//                    modifier = Modifier
//                        .fillMaxWidth(0.5f)
//                        .fillMaxHeight(0.8f)
//                )
//            }
//            Column(
//                modifier = Modifier
//                    .offset(y = 200.dp)
//                    .align(Alignment.Center),
//
//                ) {
//                Text(
//                    text = stringResource(id = R.string.main_activity_instruction),
//                    color = Color.White,
//                    textAlign = TextAlign.Center,
//                    fontSize = 35.sp,
//                    lineHeight = 40.sp
//                )
//            }
//        }
//
//    }
//}


@Composable
fun MainActivityLayout() {
    Scaffold(
        bottomBar = {
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(30.dp),
                textAlign = TextAlign.End,
                text = "version 1.0",
                color = Color.White,
                fontSize = 35.sp
            )
        },
        content = { innerPadding ->
            Column(
                modifier = Modifier
                    .fillMaxSize()
                    .background(Color.Black)
                    .padding(innerPadding),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_launcher_name_foreground),
                    contentDescription = null,
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .fillMaxWidth(0.4f)
                        .fillMaxHeight(0.5f)
                )
                Text(
                    text = stringResource(id = R.string.main_activity_instruction),
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 38.sp,
                    lineHeight = 40.sp
                )
            }
        }
    )
}


@Preview(device = Devices.TABLET)
@Composable
fun MainActivityLayoutPreview() {
    MainActivityLayout()
}

