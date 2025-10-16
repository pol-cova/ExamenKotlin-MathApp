package com.paulcontre.examen_mathapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MeScreen(modifier: Modifier) {
    val user_img = painterResource(R.drawable.user)
    val peng = painterResource(R.drawable.peng)
    val jiff = painterResource(R.drawable.jiff)

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Text(
            "Onion Math",
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.fillMaxWidth(),
            textAlign = TextAlign.Center
        )

        Spacer(modifier = Modifier.height(24.dp))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Image(
                painter = user_img,
                contentDescription = "User Image",
                modifier = Modifier
                    .size(80.dp)
                    .clip(CircleShape)
            )
            Text(
                "kyzamiz",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                "Grade 4",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = 16.dp),
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Icon(
                Icons.Outlined.Notifications,
                contentDescription = null,
                modifier = Modifier.size(18.dp),
                tint = Color.Gray
            )
            Spacer(modifier = Modifier.width(6.dp))
            Text(
                "Deadline is coming!",
                fontSize = 14.sp,
                color = Color.Gray
            )
        }
        Spacer(modifier = Modifier.height(24.dp))
        Column(
            modifier = Modifier.fillMaxWidth(),
            horizontalAlignment = Alignment.Start
        ) {
            Text(
                "Learning",
                fontSize = 16.sp,
                fontWeight = FontWeight.SemiBold
            )
            Spacer(modifier = Modifier.height(16.dp))
            CardItem(
                modifier = Modifier.fillMaxWidth(),
                title = "Autumn Term",
                subtitle = "Week 1",
                backgroundColor = Color(0xFF9192FF),
                img = jiff
            )
            Spacer(modifier = Modifier.height(12.dp))
            CardItem(
                modifier = Modifier.fillMaxWidth(),
                title = "Try for 7 Days",
                subtitle = "Day 2",
                backgroundColor = Color(0xFF63D3FF),
                img = peng
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun MeScreenPreivew() {
    MeScreen(Modifier)
}