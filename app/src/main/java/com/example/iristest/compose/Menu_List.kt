package com.example.iristest.compose

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R


@Composable
fun MenuItem() {
    var selectedButton by remember { mutableStateOf(SampleOption.Back) }

    Scaffold(
        topBar = {
            Row(
                modifier = Modifier
                    .background(colorResource(id = R.color.bg_black))
                    .fillMaxWidth()
            ) {
                MenuBack(
                    painter = painterResource(id = R.drawable.frame_56779__1_),
                    isSelected = selectedButton == SampleOption.Back,
                    onClick = { selectedButton = SampleOption.Back }
                )
            }
        }
    ) { innerPadding ->
        Box(
            modifier = Modifier
                .padding(innerPadding)
                .background(colorResource(id = R.color.bg_black)),
            contentAlignment = Alignment.Center
        ) {
            MenuList()
        }

    }
}


@Composable
fun MenuList(
)
{
//    val indexItems = remember {
//        arrayListOf(
//            1, 2, 3, 4, 5, 6
//        )
//    }
    val menuItems = remember {
        arrayListOf(
            "Home",
            "See Instructions",
            "Pause Session",
            "Transfer Session",
            "Summary",
            "Log Out"
        )
    }
    var selectedPair by remember { mutableStateOf<Pair<Int, String>?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(80.dp)
    ) {
        menuItems.forEachIndexed { index, item ->
            Row {
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(
                            if (selectedPair?.first == index) colorResource(id = R.color.purple_200)
                            else colorResource(id = R.color.bg_black), shape = CircleShape
                        )
                        .size(52.dp)
                        .border(
                            width = 4.dp,
                            colorResource(id = R.color.box_bg),
                            shape = CircleShape
                        )
                        .clickable { selectedPair = index to menuItems[index] },
                    contentAlignment = Alignment.Center
                )
                {
                    Text(
                        text = (index+1).toString(),
                        color = Color.White,
                        fontSize = 36.sp
                    )
                }
                Spacer(modifier = Modifier.width(48.dp))

                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(
                            if (selectedPair?.second == menuItems[index])
                                colorResource(id = R.color.box_bg) else colorResource(id = R.color.bg_black),
                            shape = RectangleShape
                        )
                        .clickable { selectedPair = index to menuItems[index] }
                        .fillMaxWidth(),
                    contentAlignment = Alignment.TopStart
                )
                {
                    Text(
                        text = menuItems[index],
                        color = Color.White,
                        fontSize = 52.sp,
                        textAlign = TextAlign.Left
                    )
                }
            }
        }

    }
}


@Composable
 @Preview(device = Devices.TABLET)
fun MenuItem_Preview() {
    MenuItem()
}
