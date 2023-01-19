package examples

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier

@Composable
fun Exampl02() {
    Column {
        val text = remember { mutableStateOf("") }
        TextField(
            value = text.value,
            singleLine = true,
            onValueChange = { text.value = it },
            modifier = Modifier.fillMaxWidth()
        )

        OutlinedTextField(
            value =text.value,
            onValueChange = { text.value = it },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
    }
}