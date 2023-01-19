import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.rememberWindowState
import examples.Example03
import examples.exampl04
import examples.example05


fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "Compose for desktop",
        state = rememberWindowState(width = 700.dp, height = 500.dp),
        resizable = false,
        icon = painterResource("phoenix.ico")
    ) {
        example05()
    }
}
