package examples

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.combinedClickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@OptIn(ExperimentalFoundationApi::class)
@Composable
fun exampl04() {
    var count by remember { mutableStateOf(0) }

    Box(
        contentAlignment = Alignment.Center,
        modifier = Modifier
            .fillMaxWidth()
            .padding(22.dp),
    ) {
        var text by remember { mutableStateOf("Click cyan box") }

        Column {
            Box(
                modifier = Modifier
                    .fillMaxWidth(0.7f)
                    .fillMaxHeight(0.5f)
                    .background(Color.Cyan)
                    .combinedClickable(
                        onClick = { text = "Click! ${count++} " },
                        onDoubleClick = { text = "Double click! ${count++}" },
                        onLongClick = { text = "Long click! ${count++}" }
                    )
            ) {
                Text(
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.Center),
                    text = text,
                    textAlign = TextAlign.Center,
                    fontSize = 22.sp
                )
            }
        }
    }
}