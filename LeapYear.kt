import java.util.*

fun main() {

    val sc = Scanner(System.`in`)

    while (true) {
        print("Enter Year:")
        val year: Int = sc.nextInt()

        if (year % 400 == 0)
            println("Leap Year")
        else if (year % 100 == 0)
            println("Not a Leap year")
        else if (year % 4 == 0)
            println("Leap Year")
        else
            println("Not a Leap Year")
    }
}