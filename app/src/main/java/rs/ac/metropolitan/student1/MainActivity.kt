package rs.ac.metropolitan.student1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Alignment
import androidx.compose.ui.text.style.TextAlign
import rs.ac.metropolitan.student1.ui.theme.Student1Theme



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Student1Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Student("Android")
                }
            }
        }
    }
}

@Composable
fun Student(name: String, modifier: Modifier = Modifier) {
    Column(
        modifier = modifier.padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Hello $name!",
            modifier = Modifier.padding(bottom = 16.dp),
            textAlign = TextAlign.Center,
        )

        Button(
            onClick = { /* nesto */ },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
        ) {
            Text("OK")
        }

        Button(
            onClick = { /* nesto */ },
            modifier = Modifier.fillMaxWidth().padding(top = 8.dp)
        ) {
            Text("Cancel")
        }
    }

}

@Preview(showBackground = true)
@Composable
fun StudentPreview() {
    Student1Theme {
        Student("Android")
    }
}