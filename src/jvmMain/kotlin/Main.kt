import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import examples.Exampl01


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for desktop",
        state = rememberWindowState(width = 300.dp, height = 300.dp)
    ) {
        Exampl01()
    }
}
