package backgwa.dokev

import kotlin.system.exitProcess


class Debug {
    val COLOR = mapOf<String, String>(
        "RED" to "\u001b[31m",
        "YELLOW" to "\u001b[33m",
        "GREEN" to "\u001b[32m",
        "CYAN" to "\u001b[36m",
        "BOLD" to "\u001b[1m",
        "RESET" to "\u001b[0m",
    )

    var target_line: Int = 0
    var target_code: String = ""

    /* Public */

    // PreRegister : 디버그 대상을 미리 등록합니다.
    public fun PreRegister(target_line: Int, target_code: String): Unit {
        this.target_line = target_line
        this.target_code = PrettyCode(target_code)
    }

    // StandardError : 표준 오류를 출력합니다.
    public fun StandardError(): Unit {
        WriteText("오류: ", color = "RED", bold = true)
        WriteText(this.target_code, bold = true, newline = true)
        exitProcess(127)
    }

    // SyntaxError : 문법 오류에 대한, 내용을 출력합니다.
    public fun SyntaxError(): Unit {
        exitProcess(1)
    }

    // RuntimeError : 코드 실행 중, 발생한 오류를 출력합니다.
    public fun RuntimeError(): Unit {
        exitProcess(1)
    }

    // SyntaxWarning : 문법 경고에 대한, 내용을 출력합니다.
    public fun SyntaxWarning(): Unit {

    }

    /* Private */

    // PrettyCode : 코드를 깔끔하게 변경하여, 반환합니다.
    private fun PrettyCode(code: String): String {
        return code
    }

    private fun WriteText(text: String, color: String = "RESET", bold: Boolean = false, newline: Boolean = false): Unit {
        print(this.COLOR[color])
        if (bold) print(this.COLOR["BOLD"])
        print(text)
        print(this.COLOR["RESET"])
        if (newline) println()
    }

    // WriteLine : 라인 정보와 함께 코드와 디버그 내용을 표시합니다.
    private fun WriteLine(): Unit {

    }
}