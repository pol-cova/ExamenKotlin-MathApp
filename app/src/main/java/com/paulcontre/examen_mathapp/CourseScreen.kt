package com.paulcontre.examen_mathapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CourseScreen(modifier: Modifier) {
    val user_img = painterResource(R.drawable.user)
    var rana_img = painterResource(R.drawable.rana)
    var peng_img = painterResource(R.drawable.peng_1)
    var jiff_1_img = painterResource(R.drawable.jiff_1)
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.Start
    ) {
        Text(
            "Onion Math",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(16.dp))
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Image(
                    painter = user_img,
                    contentDescription = "User Image",
                    modifier = Modifier.size(48.dp)
                        .clip(CircleShape)

                )
                Column {
                    Text("kyzamiz", fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
                    Text("Grade 4", fontSize = 14.sp, color = Color.Gray)
                }
            }
            TextButton(onClick = {}) {
                Text("Grade", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color.Gray)
            }
        }
        Spacer(modifier = Modifier.height(24.dp))

        Text("Start", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(12.dp))
        CardItem(
            modifier = Modifier.fillMaxWidth(),
            title = "Numbers",
            subtitle = "Hello cuddly numbers!",
            backgroundColor = Color(0xFFA9DC35),
            img = rana_img
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text("Courses", fontSize = 18.sp, fontWeight = FontWeight.Bold)
        Spacer(modifier = Modifier.height(12.dp))
        CardList(
            modifier = Modifier.fillMaxWidth(),
            title = "Try for 7 Days",
            subtitle = "Start on Aug 1st",
            price = "9.9",
            img = peng_img
        )
        Spacer(modifier = Modifier.height(12.dp))
        CardList(
            modifier = Modifier.fillMaxWidth(),
            title = "Autumn Term",
            subtitle = "Starts on Sep 1st",
            price = "398",
            img = jiff_1_img
        )
    }
}

@Composable
fun CardItem(
    modifier: Modifier, title: String, subtitle: String, backgroundColor: Color, img: Painter
) {
    Box(
        modifier = modifier
            .background(
                color = backgroundColor,
                shape = RoundedCornerShape(20.dp)
            )
            .height(180.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(20.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Column(
                modifier = Modifier.weight(1f),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    title,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(6.dp))
                Text(
                    subtitle,
                    fontSize = 14.sp,
                    color = Color.White,
                    modifier = Modifier.alpha(0.9f)
                )
                Spacer(modifier = Modifier.height(16.dp))
                ElevatedButton(
                    onClick = {},
                    colors = ButtonDefaults.elevatedButtonColors(containerColor = Color.White),
                    shape = RoundedCornerShape(50),
                    modifier = Modifier.height(40.dp)
                ) {
                    Icon(
                        Icons.Rounded.PlayArrow,
                        contentDescription = null,
                        tint = backgroundColor,
                        modifier = Modifier.size(20.dp)
                    )
                    Spacer(modifier = Modifier.width(6.dp))
                    Text(
                        "Start",
                        fontSize = 15.sp,
                        fontWeight = FontWeight.SemiBold,
                        color = backgroundColor
                    )
                }
            }
            Spacer(modifier = Modifier.width(8.dp))
            Image(
                painter = img,
                contentDescription = null,
                modifier = Modifier
                    .size(140.dp)
                    .padding(end = 8.dp)
            )
        }
    }
}

@Composable
fun CardList(modifier: Modifier, title: String, subtitle: String, price: String, img: Painter) {
    Card(
        modifier = modifier,
        shape = RoundedCornerShape(12.dp),
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp),
        colors = CardDefaults.cardColors(containerColor = Color.White)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Image(
                    painter = img,
                    contentDescription = null,
                    modifier = Modifier.size(60.dp)
                        .clip(RoundedCornerShape(10.dp))
                )
                Column {
                    Text(title, fontSize = 18.sp, fontWeight = FontWeight.SemiBold)
                    Text(subtitle, fontSize = 13.sp, color = Color.Gray)
                }
            }
            Column(horizontalAlignment = Alignment.End) {
                Text(
                    "¥$price",
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    color = Color(0xFFFF665A)
                )
                Text(
                    "¥$price",
                    fontSize = 10.sp,
                    fontWeight = FontWeight.SemiBold,
                    color = Color.Gray,
                    modifier = Modifier.alpha(0.5f)
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CourseScreenPreview() {
    CourseScreen(Modifier)
}