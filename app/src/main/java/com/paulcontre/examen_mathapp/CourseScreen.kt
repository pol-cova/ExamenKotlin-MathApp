package com.paulcontre.examen_mathapp

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun CourseScreen(modifier: Modifier) {
    Column {
        Text("Onion Math")
    }
}

// Preview course screen
@Preview(showBackground = true)
@Composable
fun CourseScreenPreview() {
    CourseScreen(Modifier)
}