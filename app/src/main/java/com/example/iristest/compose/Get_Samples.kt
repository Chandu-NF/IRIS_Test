package com.example.iristest.compose


//@OptIn(ExperimentalMaterial3Api::class)
//@Composable
//fun Get_Samples() {
//    var presses by remember { mutableStateOf(false) }
//
//    Scaffold(
//        topBar = {
//            Row(
//                modifier = Modifier
//                    .background(colorResource(id = R.color.bg_black))
//                    .fillMaxWidth(),
//                verticalAlignment = Alignment.CenterVertically,
//                horizontalArrangement = Arrangement.SpaceBetween
//
//            ) {
//                Button(
//                    modifier = Modifier
//                        .padding(32.dp)
//                        .wrapContentSize(),
//                    shape = RectangleShape,
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = colorResource(id = R.color.box_bg)
//                    ),
//                    onClick = { /* Do something! */ }
//                ) {
//                    Text(
//                        "Back",
//                        fontSize = 24.sp
//                    )
//                }
//                Button(
//                    modifier = Modifier
//                        .padding(32.dp)
//                        .wrapContentSize(),
//                    shape = RectangleShape,
//                    colors = ButtonDefaults.buttonColors(
//                        containerColor = colorResource(id = R.color.box_bg)
//                    ),
//                    onClick = { /* Do something! */ }
//                ) {
//                    Text(
//                        "Menu",
//                        fontSize = 24.sp
//                    )
//                }
//            }
//        }
//    ) { innerPadding ->
//        Row(
//            modifier = Modifier
//                .padding(innerPadding)
//                .fillMaxSize()
//                .background(colorResource(id = R.color.bg_black)),
//            verticalAlignment = Alignment.CenterVertically,
//            horizontalArrangement = Arrangement.Center
//        ) {
//            Button(
//                modifier = Modifier
//                    .background(colorResource(id = R.color.box_bg))
//                    .border(
//                        width = 2.dp,
//                        color = if (presses) Color.White else Color.Black
//                    ),
//                enabled = true,
//                shape = RectangleShape,
//                onClick = { presses != presses },
//                colors = ButtonDefaults.buttonColors(
//                    if (presses) Color.White
//                    else Color.Black
//                )
//            ) {
//                Column {
//                    Row {
//                        Text(
//                            text = "1",
//                            fontSize = 32.sp
//                        )
//                        Box(
//                            modifier = Modifier
//                                .background(colorResource(id = R.color.box_bg))
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.vector),
//                                contentDescription = "Get My Samples",
//                                modifier = Modifier
//                                    .fillMaxWidth(0.2f)
//                                    .fillMaxHeight(0.3f)
//                                    .padding(40.dp)
//                            )
//                        }
//                    }
//                    Text(
//                        modifier = Modifier
//                            .padding(16.dp),
//                        text = "Get My Samples",
//                        fontSize = 32.sp,
//                        textAlign = TextAlign.Center
//                    )
//                }
//            }
//            Button(
//                modifier = Modifier
//                    .background(colorResource(id = R.color.box_bg)),
//                shape = RectangleShape,
//                colors = ButtonDefaults.buttonColors(
//                    containerColor = colorResource(id = R.color.bg_black)
//                ),
//                onClick = { /* Do something! */ }
//            )
//            {
//                Column(
//                    verticalArrangement = Arrangement.Center,
//                    horizontalAlignment = Alignment.CenterHorizontally
//                ) {
//                    Row {
//                        Text(
//                            modifier = Modifier
//                                .padding(18.dp),
//                            text = "2",
//                            fontSize = 32.sp,
//                        )
//                        Box(
//                            modifier = Modifier
//                                .background(colorResource(id = R.color.box_bg)),
//                            contentAlignment = Alignment.Center
//                        ) {
//                            Image(
//                                painter = painterResource(id = R.drawable.vector_1),
//                                contentDescription = "Scan Samples",
//                                modifier = Modifier
//                                    .fillMaxWidth(0.3f)
//                                    .fillMaxHeight(0.3f)
//                                    .padding(40.dp),
//                                Alignment.Center
//                            )
//                        }
//                    }
//                    Text(
//                        modifier = Modifier
//                            .padding(16.dp),
//                        text = "Scan Samples",
//                        fontSize = 32.sp,
//                        textAlign = TextAlign.Center
//                    )
//                }
//            }
//        }
//    }
//}
//
//
//
//@Preview(device = Devices.TABLET)
//@Composable
//fun Get_Samples_Preview() {
//    Get_Samples()
//}


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.displayCutoutPadding
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.ui.draw.shadow

enum class SampleOption {
    GetMySamples,
    ScanSamples
}


@Composable
fun GetSamplesScreen() {
    var selectedOption by remember { mutableStateOf(SampleOption.GetMySamples) }

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .background(colorResource(id = R.color.bg_black))
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Button(
                    modifier = Modifier
                        .padding(32.dp)
                        .wrapContentSize()
                        .background(colorResource(id = R.color.box_bg)),
                    onClick = { /* Handle back action */ }
                ) {
                    Text(
                        "Back",
                        fontSize = 24.sp
                    )
                }
                Button(
                    modifier = Modifier
                        .padding(32.dp)
                        .wrapContentSize()
                        .background(colorResource(id = R.color.box_bg)),
                    onClick = { /* Handle menu action */ }
                ) {
                    Text(
                        "Menu",
                        fontSize = 24.sp
                    )
                }
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
            SampleButton(
                label = "Get My Samples",
                painter = painterResource(id = R.drawable.vector),
                isSelected = selectedOption == SampleOption.GetMySamples,
                onClick = { selectedOption = SampleOption.GetMySamples },
                index = 1
            )

            Spacer(modifier = Modifier.width(16.dp))

            SampleButton(
                label = "Scan Samples",
                painter = painterResource(id = R.drawable.vector_1),
                isSelected = selectedOption == SampleOption.ScanSamples,
                onClick = { selectedOption = SampleOption.ScanSamples },
                index = 2
            )
        }
    }
}

@Composable
fun SampleButton(
    label: String,
    painter: Painter,
    isSelected: Boolean,
    onClick: () -> Unit,
    index: Int
) {
    Column(
        modifier = Modifier
            .clickable { onClick() }
            .background(colorResource(id = R.color.bg_black))
            .padding(16.dp)
            .wrapContentSize()
    ) {
        Row(
            horizontalArrangement = Arrangement.Center
        ) {
            Box(
                modifier = Modifier
                    .background(if (isSelected) colorResource(id = R.color.purple_200)
                    else Color.Transparent, shape = CircleShape)
                    .size(48.dp)
                    .border(
                        width = 1.dp,
                        color = if (isSelected) colorResource(id = R.color.purple_200)
                        else Color.Gray,
                        shape = CircleShape
                    ),
                contentAlignment = Alignment.Center
            ) {
                Text(modifier = Modifier
                    .padding(8.dp),
                    text = "$index",
                    fontSize = 24.sp,
                    color = Color.White
                )
            }
            Spacer(modifier = Modifier.width(8.dp))
            Box(
                modifier = Modifier
                    .background(colorResource(id = R.color.box_bg), RoundedCornerShape(32.dp))
                    .border(
                        width = 2.dp,
                        color = if (isSelected) colorResource(id = R.color.purple_200)
                        else Color.Transparent,
                        shape = RoundedCornerShape(32.dp)
                    )
                    .size(150.dp),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    painter = painter,
                    contentDescription = label,
                    modifier = Modifier
                        .size(64.dp)

                )
            }
        }
        Text(
            text = label,
            fontSize = if (isSelected) 32.sp else 24.sp,
            textAlign = TextAlign.Center,
            color = Color.White,
            modifier = Modifier
                .padding(16.dp)
                .align(Alignment.CenterHorizontally)
        )
    }
}

@Preview(device = Devices.TABLET)
@Composable
fun GetSamplesPreview() {
    GetSamplesScreen()
}
