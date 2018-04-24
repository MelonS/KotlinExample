val a: Byte = 7
val b: Short = a.toShort()
val c: Int = a.toInt()
val d: Long = a.toLong()
val e: Float = a.toFloat()
val f: Double = a.toDouble()
val g: Char = a.toChar()

var hello : String = "안녕하세요??"
var againMeetyou : String = "또 만났군요!!?"

val s = "삶이 그대를 속일지라도\n슬퍼하거나 노하지 말라"

val s2 = """
    |삶이 그대를 속일지라도
    |슬퍼하거나 노하지 말라
""".trimMargin()

val oneMillion = 1_000_000
val creditCardNumber = 1234_5678_9012_3456L
val socialSecurityNumber = 777_77_7777L
val hexBytes = 0xFF_EC_DE_5E
val bytes = 0b11010010_01101001_10010100_10010010

fun main(args: Array<String>) {
    /*
    println(makeMessage1(1))
    println(makeMessage1(2))
    println(makeMessage2(1))
    println(makeMessage2(2))

    println(s)
    println(s2)

    println("$oneMillion")
    println("$creditCardNumber")
    println("$socialSecurityNumber")
    println("$hexBytes")
    println("$bytes")
    */

    //Class4_4_5().RunMain()
    Class4_4_7().RunMain()

    //TEST
}

fun makeMessage1(msgType: Int) : String {
    return if (msgType == 1) "$hello" else "$againMeetyou"
}

fun makeMessage2(msgType: Int) = if (msgType == 1) "날씨좋죠?" else "참맑군요!!"


