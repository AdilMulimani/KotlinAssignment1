import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    println("Enter ammount")
    val amount:Double = sc.nextDouble()
    println("Enter Time")
    val time:Double = sc.nextDouble()
    println("Enter rate")
    val rate:Double = sc.nextDouble()

    val si = amount*time*rate/100

    println("Simple interest = $si")
}