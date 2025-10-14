package com.paulcontre.examen_mathapp

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Face
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.PlayArrow
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import org.w3c.dom.Text

@Composable
fun CourseScreen(modifier: Modifier) {
    Column(modifier = modifier
        .padding(10.dp),
        horizontalAlignment = Alignment.CenterHorizontally
            ) {
        Text("Onion Math", fontSize = 18.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center)
        Row(
            modifier = Modifier
            .padding(8.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(20.dp)
        ){
            Icon(Icons.Rounded.Face, contentDescription = null)
            Column {
                Text("kyzamiz", fontWeight = FontWeight.SemiBold, fontSize = 16.sp)
                Text("Grade 4", fontSize = 14.sp, color = Color.Gray)
            }
            Spacer(modifier = Modifier.padding(70.dp))
            TextButton(onClick = {}) {
                Text("Grade", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = Color.Gray)
            }
        }
        CourseList(modifier)
    }
}

@Composable
fun CourseList(modifier: Modifier) {
    Column(modifier = modifier
        .fillMaxSize()
        .padding(10.dp),
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Text("Start", fontSize = 16.sp, fontWeight = FontWeight.Bold)
        CourseItem(modifier, "Numbers", "Hello cuddly numbers!")
    }
}


@Composable
fun CourseItem(modifier: Modifier, text1: String = "Numbers",
               text2: String = "Hello cuddly numbers!", color: Color = Color(0xFFA9DC35)) {
    // Box appearance
    Box(
        modifier = modifier
            .padding(20.dp)
            .padding(20.dp)
            .background(
                color = color,
                shape = RoundedCornerShape(10.dp)
            )
            ,
        contentAlignment = Alignment.Center
    ){
        Row(modifier.padding(10.dp),
            verticalAlignment = Alignment.CenterVertically,){
            Column(modifier.padding(10.dp)){
                Text(text1, fontSize = 20.sp, fontWeight = FontWeight.SemiBold, color = Color.White)
                Text(text2, fontSize = 12.sp, color = Color.White)
                Spacer(modifier.padding(10.dp))
                ElevatedButton(onClick = {}) {
                    Icon(Icons.Rounded.PlayArrow, contentDescription = null,
                    tint = color)
                    Text("Start", fontSize = 14.sp, fontWeight = FontWeight.SemiBold, color = color)
                }
            }
            Spacer(modifier.padding(30.dp) )
            Icon(
                Icons.Rounded.Favorite, contentDescription = null, tint = Color.White,
                modifier = modifier.size(64.dp)
            )
        }
    }
}

// Preview course screen
@Preview(showBackground = true)
@Composable
fun CourseScreenPreview() {
    CourseScreen(Modifier)
}