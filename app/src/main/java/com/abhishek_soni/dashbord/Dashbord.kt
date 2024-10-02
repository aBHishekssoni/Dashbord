package com.abhishek_soni.dashbord

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.focus.FocusRequester.Companion.createRefs
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.node.CanFocusChecker.start
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Constraints
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.widget.ConstraintLayout

@OptIn(ExperimentalMaterial3Api::class)
@Preview
@Composable
fun Dashbord(modifier: Modifier = Modifier) {
    Column(modifier = Modifier.fillMaxSize()
        .background(color = Color(0xFFeeeefb)),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
        Box(
            modifier = modifier.fillMaxWidth()
                .height(245.dp)
                .background(
                    color = Color(0xFF5e3bee),
                    shape = RoundedCornerShape(0.dp, 0.dp, 40.dp, 40.dp)
                ),


        ) {
            Row(
                modifier = Modifier.padding(start = 24.dp, end = 24.dp, top = 48.dp)
                    .fillMaxWidth(),
            ) {
                Column(
                    modifier = Modifier.height(100.dp)
                        .padding(start = 14.dp)
                        .weight(0.7f),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = "Hello",
                        color = Color.White,
                        fontSize = 18.sp,
                    )
                    Text(
                        text = "Abhishek Soni",
                        color = Color.White,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold,
                        modifier = Modifier.padding(top = 14.dp)
                    )
                }
                Image(
                    painter = painterResource(id = R.drawable.profile),
                    contentDescription = null,
                    modifier = Modifier.width(100.dp)
                        .height(100.dp)
                        .clickable { }
                )
            }}

            Row(
                modifier = Modifier.padding(start = 24.dp, end = 24.dp,)
                    .fillMaxWidth()
                    .background(Color.White, shape = RoundedCornerShape(20.dp)),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Column(
                    modifier = Modifier.padding(bottom = 12.dp, end = 12.dp, top = 12.dp, start = 10.dp)
                        .width(90.dp).height(90.dp)
                        .background(color = Color(0xFFb6c2fe), shape = RoundedCornerShape(20.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.video_call),
                        contentDescription = null,
                        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp).size(50.dp)
                    )
                    Text(
                        text = "Video Call",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        color = Color(0xFF5e3bee)
                    )
                }

                Column(
                    modifier = Modifier.padding(bottom = 12.dp, end = 12.dp, top = 12.dp, start = 8.dp)
                        .width(90.dp).height(90.dp)
                        .background(color = Color(0xFFb6c2fe), shape = RoundedCornerShape(20.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.notification),
                        contentDescription = null,
                        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp).size(50.dp)
                    )
                    Text(
                        text = "Notification",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        color = Color(0xFF5e3bee)
                    )
                }

                Column(
                    modifier = Modifier.padding(bottom = 12.dp, end = 12.dp, top = 12.dp, start = 8.dp)
                        .width(90.dp).height(90.dp)
                        .background(color = Color(0xFFb6c2fe), shape = RoundedCornerShape(20.dp)),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Image(
                        painter = painterResource(id = R.drawable.voice_call),
                        contentDescription = null,
                        modifier = Modifier.padding(top = 8.dp, bottom = 4.dp).size(50.dp)
                    )
                    Text(
                        text = "Voice Call",
                        fontSize = 14.sp,
                        fontWeight = FontWeight.Bold,
                        fontStyle = FontStyle.Italic,
                        color = Color(0xFF5e3bee)
                    )
                }
            }

        var text by rememberSaveable { mutableStateOf("") }
        TextField(
            value = text, onValueChange = {text = it},
            label = { Text(text="Searching for...")},
            trailingIcon = {
                Image(
                    painter = painterResource(id = R.drawable.search_icon),
                    contentDescription = null,
                    modifier = Modifier.size(45.dp).padding(end = 6.dp)
                )
            },
            shape = RoundedCornerShape(50.dp),
            colors = TextFieldDefaults.outlinedTextFieldColors(
                containerColor = Color.White,
                focusedBorderColor = Color.Transparent,
                unfocusedBorderColor = Color.Transparent,
                unfocusedLabelColor = Color(0xFF5e5e5e),
                focusedLabelColor = Color(0xFF5e5e5e),
            ),
            modifier = Modifier.fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp, top = 24.dp)
                .shadow(3.dp, shape = RoundedCornerShape(50.dp))
                .background(color = Color.White, CircleShape)
        )
        Box(modifier = Modifier.fillMaxWidth()
            .padding(start = 24.dp, end = 24.dp, top = 24.dp)
            .shadow(3.dp, shape = RoundedCornerShape(25.dp))
            .height(145.dp)
            .background(brush = Brush.horizontalGradient(
                colors = listOf(Color(0xFF7787f9), Color(0xFFb6c2fe))
            ), shape = RoundedCornerShape(25.dp))){
            Image(
                painter = painterResource(id = R.drawable.logo),
                contentDescription = null, modifier = Modifier.fillMaxWidth().size(120.dp).padding(top = 15.dp, end = 5.dp, bottom = 5.dp),
                alignment = Alignment.BottomEnd
            )
            Column (
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ){
            Text(
                text = "To Get Unlimited",
                fontSize = 18.sp, fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp, top = 38.dp)
            )
            Text(
                text = "Upgrade Your Account",
                fontSize = 18.sp, fontWeight = FontWeight.Bold,
                color = Color.White,
                modifier = Modifier.padding(start = 10.dp, top = 20.dp)
            )}
        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_1),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Inbox",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_2),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Maps",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_3),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Chats",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_4),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Report",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

        }
        Row(
            modifier = Modifier.fillMaxWidth()
                .padding(start = 16.dp, end = 16.dp, top = 16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_5),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Celender",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_6),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Tips",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_7),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "Settings",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

            Column(
                modifier = Modifier.weight(0.25f),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    painter = painterResource(id = R.drawable.ic_8),
                    contentDescription = null,
                    modifier = Modifier.padding(top = 8.dp, bottom = 4.dp)
                        .background(color = Color.White, shape =  RoundedCornerShape(10.dp))
                        .padding(16.dp).size(35.dp)
                )
                Text(
                    text = "More",
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    modifier = Modifier.padding(top = 4.dp),
                    color = Color(0xFF2e3d6d)
                )
            }

        }
    }
//    }
}