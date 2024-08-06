package com.example.iristest.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R


@Composable
fun Cam_Scan() {
    Box(
        modifier = Modifier
            .fillMaxSize()

    ) {
        Card(
            modifier = Modifier
                .fillMaxWidth(0.69f)
                .fillMaxHeight(),
            colors = CardDefaults.cardColors(
                containerColor = Color.Gray
            )
        )
        {
            Column(
                modifier = Modifier
                    .padding(42.dp)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Bottom,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Text(
                    text = stringResource(id = R.string.scan_login),
                    fontSize = 42.sp,
                    textAlign = TextAlign.Start,
                    color = Color.White,
                    modifier = Modifier
                        .padding(50.dp)
                )
            }
        }
        Card(
            modifier = Modifier
                .fillMaxWidth(0.34f)
                .fillMaxHeight()
                .align(Alignment.CenterEnd),
            colors = CardDefaults.cardColors(
                containerColor = colorResource(id = R.color.box_bg)
            )
        )
        {
            Text(
                text = stringResource(id = R.string.login_scan),
                fontSize = 45.sp,
                textAlign = TextAlign.Justify,
                color = Color.White,
                modifier = Modifier
                    .padding(45.dp)
            )
        }
    }
}


@Composable
@Preview(device = Devices.TABLET)
fun Cam_Scan_Preview() {
    Cam_Scan()
}