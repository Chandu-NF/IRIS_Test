package com.example.iristest.compose

@Composable
fun Menu_List(){

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
                    isSelected = selectedButton == SampleOption.Back,
                    onClick = { selectedButton = SampleOption.Back }
                )
                MenuBack(
                    painter = painterResource(id = R.drawable.frame_56780),
                    isSelected = selectedButton == SampleOption.Menu,
                    onClick = { selectedButton = SampleOption.Menu }
                )
            }
        }
    )
}