
class Class4_5_4
{
    fun RunMain()
    {
        println("============================================")
        println("Class4_5_4.RunMain")
        println("============================================")

        println(8 shr 2)
        println(1 shl 10)
        println(0xC0 and 0x0C)
        println(0xC0 or 0x0C)
        println(0xC0 xor 0xC1)

        val b1: Boolean = true
        val b2: Boolean = false
        val b3: Boolean = false
        if ((b1 || b2) && !b3)
            println("True!!")
        if ((b1 or b2) and b3.not())
            println("True!!")
    }
}