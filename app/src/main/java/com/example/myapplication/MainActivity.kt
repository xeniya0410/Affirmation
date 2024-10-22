package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    AffirmationList(
                        affirmations = listOf(
                            Affirmation("You are capable of amazing things."),
                            Affirmation("You are stronger than you think."),
                            Affirmation("Every day is a fresh start."),
                            Affirmation("Believe in yourself and all that you are."),
                            Affirmation("The best is yet to come.")
                        ),
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun AffirmationList(affirmations: List<Affirmation>, modifier: Modifier = Modifier) {
    LazyColumn(modifier = modifier.padding(16.dp)) {
        items(affirmations) { affirmation ->
            AffirmationItem(affirmation)
        }
    }
}

@Composable
fun AffirmationItem(affirmation: Affirmation) {
    Text(
        text = affirmation.text,
        style = MaterialTheme.typography.bodyLarge, // Исправлено на подходящий стиль для Material3
        modifier = Modifier.padding(vertical = 8.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun AffirmationListPreview() {
    MyApplicationTheme {
        AffirmationList(
            affirmations = listOf(
                Affirmation("You are capable of amazing things."),
                Affirmation("You are stronger than you think."),
                Affirmation("Every day is a fresh start."),
                Affirmation("Believe in yourself and all that you are."),
                Affirmation("The best is yet to come.")
            )
        )
    }
}
