package examples

import androidx.compose.foundation.VerticalScrollbar
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.foundation.rememberScrollbarAdapter
import androidx.compose.material.Divider
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun LazyScrollale() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color(160, 160, 160))
            .padding(12.dp)
    ) {
        val state = rememberLazyListState()

        LazyColumn(
            Modifier
                .fillMaxSize()
                .padding(end = 12.dp),
            state
        ) {
            items(1000) {x ->
                ItemBox("Item #$x")
                Divider(modifier = Modifier.padding(vertical = 5.dp))
            }
        }

        VerticalScrollbar(
            adapter = rememberScrollbarAdapter(scrollState = state),
            modifier = Modifier
                .align(Alignment.CenterEnd)
                .fillMaxHeight()
        )
    }
}

@Composable
fun ItemBox(item: String) {
    Box(
        modifier = Modifier
            .height(40.dp)
            .fillMaxWidth()
            .padding(start = 10.dp)
            .background(color = Color.White),
        contentAlignment = Alignment.CenterStart
    ) {
        Text(
            text = item,
            color = Color.Red,
            modifier = Modifier
                .padding(start = 12.dp)
        )
    }
}
