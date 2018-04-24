class Class4_4_7
{
    fun RunMain()
    {
        println("============================================")
        println("Class4_4_7.RunMain")
        println("============================================")

        var t: Any = "가나다"
        println(t)

        t = 100
        println(t)

        t = 100.0
        println(t)

        t = 100L
        println(t)

        val m1 = Score(100, 200)
        val m2 = Score(300, 400)
        println(m1 + m2)
        println(m1 * m2)
        println(-m1)

        var a: Int = 0
        var b: Int = 100
        println("++a = ${++a}, b-- = ${b--}")
        println("++a = ${++a}, b-- = ${b--}")
    }
}

data class Score (val a: Int, val b: Int) {
    operator fun plus(other: Score): Score {
        println("Score.plus operator")
        return Score(a + other.a, b + other.b)
    }
}

operator fun Score.times(other: Score) : Score {
    return Score(a * other.a, b * other.b)
}

operator fun Score.unaryMinus(): Score {
    return Score(-a, -b)
}
