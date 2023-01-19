package examples

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun exampl04() {
    var count by remember { mutableStateOf(0) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth(),
    ) {
        var text by remember { mutableStateOf("Click cyan box") }

        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight(0.2f)
                    .background(Color.Cyan)
                    .combinedClickable(
                        onClick = { text = "Click! ${count++} " },
                        onDoubleClick = { text = "Double click! ${count++}" },
                        onLongClick = { text = "Long click! ${count++}" }
                    )
            ) { Text(modifier = Modifier.fillMaxWidth(), text = text, textAlign = TextAlign.Center) }
        }
    }
}