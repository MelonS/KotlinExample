
class Class4_4_5 {

    fun RunMain() {
        println("============================================")
        println("Class4_4_5.RunMain")
        println("============================================")


        var item = arrayOf("사과", "바나나", "키위")
        for (fruit in item) {
            println(fruit)
        }


        val num = Array(5) {i -> i}
        num.forEach { println("n $it") }


        val intItem: IntArray = intArrayOf(1, 2, 3, 4, 5)
        println("intItem[0] = ${intItem[0]}")
        println("intItem[1] = ${intItem[1]}")


        val result = createArray(5, 5)
        printArray(result)
    }

    fun createArray(row: Int, col: Int): Array<Array<Int>> {
        val newArray = Array(row, { Array(col, { i -> 0 }) })

        var rowValue = 1
        for (x in 0..row - 1) {
            for (y in 0..col - 1) {
                newArray[x][y] = rowValue + y
            }
            rowValue += 10
        }

        return newArray
    }

    fun printArray(arr: Array<Array<Int>>) {
        for (x in 0..arr.size - 1) {
            for (y in 0..arr[x].size - 1) {
                print("${arr[x][y]} ")
            }
            println()
        }
    }
}
