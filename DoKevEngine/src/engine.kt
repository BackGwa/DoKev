package backgwa.dokev

import backgwa.dokev.Debug
import backgwa.dokev.Shell

/* Main Program */
fun main(args: Array<String>) {
    val debug = Debug()

    // 인자가 비어있는 경우 인터렉티브 쉘을 실행합니다.
    if (args.isEmpty()) {
        // TODO : Interactive Shell
    } else {
        debug.PreRegister(0, args.joinToString(separator = " "))
        when (args[0]) {
            "-c", "--compile" -> {

            }

            "-i", "--interpret" -> {

            }

            "v", "--version" -> {

            }

            "-h", "--help" -> {

            }

            else -> {
                debug.StandardError()
            }
        }
    }
}