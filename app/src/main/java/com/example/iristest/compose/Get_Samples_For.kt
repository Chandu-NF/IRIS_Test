package com.example.iristest.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
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
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.iristest.R

@Composable
fun Get_Samples_For() {

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
                Image(
                    painter = painterResource(id = R.drawable.frame_56779__1_),
                    contentDescription = null,
                    modifier = Modifier
                )
                Text(
                    text = "Get Samples For",
                    textAlign = TextAlign.Center,
                    fontSize = 48.sp,
                    color = Color.White
                )
                Image(
                    painter = painterResource(id = R.drawable.frame_56780),
                    contentDescription = null,
                    modifier = Modifier
                )
            }
        },
    ) { innerPadding ->
        Row(
            modifier = Modifier
                .padding(innerPadding)
        )
        {
            Sample_List()
        }
    }
}

@Composable
fun Sample_List() {
    val menuItems = remember {
        arrayListOf(
            "Sterility",
            "BET",
            "Identification (by HPLC)",
            "Uniformity of Dosage Units",
            "Identification (by HPLC)",
            "Uniformity of Dosage Units"
        )
    }
    var selected by remember { mutableStateOf<Pair<Int, String>?>(null) }

    LazyVerticalGrid(
        columns = GridCells.Fixed(2),
        modifier = Modifier
            .background(colorResource(id = R.color.bg_black))
            .fillMaxSize()
            .padding(32.dp),
        contentPadding = PaddingValues(36.dp)
    ) {
        items(menuItems.size) { index ->
            Row {
                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .background(
                            if (selected?.first == index) colorResource(id = R.color.purple_200)
                            else colorResource(id = R.color.bg_black), shape = CircleShape
                        )
                        .size(72.dp)
                        .border(
                            width = 4.dp,
                            colorResource(id = R.color.box_bg),
                            shape = CircleShape
                        )
                        .clickable { selected = index to menuItems[index] },
                    contentAlignment = Alignment.Center
                )
                {
                    Text(
                        text = (index + 1).toString(),
                        color = Color.White,
                        fontSize = 48.sp
                    )
                }
                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .padding(16.dp)
                        .border(
                            width = 4.dp,
                            if (selected?.first == index) colorResource(id = R.color.purple_200)
                            else colorResource(id = R.color.bg_black),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .background(
                            colorResource(id = R.color.box_bg),
                            shape = RoundedCornerShape(24.dp)
                        )
                        .clickable { selected = index to menuItems[index] }
                        .fillMaxWidth()
                        .size(160.dp),
                    contentAlignment = Alignment.CenterStart
                )
                {
                    Text(
                        text = menuItems[index],
                        color = Color.White,
                        fontSize = 34.sp,
                        textAlign = TextAlign.Left,
                        lineHeight = 54.sp,
                        modifier = Modifier
                            .padding(32.dp)
                    )
                }
            }
        }
    }
}

@Preview(device = Devices.TABLET)
@Composable
fun Get_Samples_For_Preview() {
    Get_Samples_For()
}
