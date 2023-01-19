import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AddCircle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import examples.Exampl02
import examples.Example03


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for desktop",
        state = rememberWindowState(width = 600.dp, height = 400.dp),
        resizable = false
    ) {
        Example03()
    }
}
