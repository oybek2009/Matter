import java.util.Scanner

fun main() {

    val scanner = Scanner(System.`in`)

    val names = arrayOfNulls<String>(100)
    var count = 0

    while (true) {

        println("1->Add")
        println("2->List")
        print("= ")
        val n = scanner.nextInt()

        when (n) {
            1 -> {
                print("Name write: ")
                val name = scanner.next()

                names[count++] = name
            }
            2 -> {
                for (i in 0 until count) {

                    if (names[i]!!.startsWith("A")) {

                        print(names[i] + " ")
                    }
                }
                println()
            }
        }
    }
}