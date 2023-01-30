import androidx.compose.runtime.key
import androidx.compose.runtime.remember
import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application
import androidx.compose.ui.window.singleWindowApplication
import examples.MyApplicationState
import examples.MyWindow
import examples.exampl04


fun main() = singleWindowApplication{
   /* val applicationState = remember { MyApplicationState() }

    for (window in applicationState.windows) {
        key(window) {
            MyWindow(window)
        }
    } */

    exampl04()
}
