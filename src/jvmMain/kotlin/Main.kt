import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import examples.LazyScrollale
import examples.scrolling


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for desktop",
        state = rememberWindowState(width = 300.dp, height = 500.dp),
        resizable = false,
        icon = painterResource("phoenix.ico")
    ) {
        LazyScrollale()
    }
}
