package examples

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun Exampl01() {
    val count = remember { mutableStateOf(0) }

    MaterialTheme {
        Column(
            modifier = Modifier.fillMaxSize(),
            Arrangement.spacedBy(5.dp)
        ) {
            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = {
                    count.value++
                }
            ) {
                Text(if (count.value == 0) "Hello World" else "Clicked ${count.value}")
            }

            Button(
                modifier = Modifier.align(Alignment.CenterHorizontally),
                onClick = { count.value = 0 }
            ) {
                Text(text = "Reset")
            }
        }
    }
}