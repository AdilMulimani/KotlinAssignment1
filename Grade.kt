import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    print("Enter marks scored by student :")
    val marks:Int = sc.nextInt()

    if(marks in 90..100)
        println("S grade")
    else if(marks in 80 until 90)
        println("A grade")
    else if(marks in 70 until 80)
        println("B grade")
    else if(marks in 60 until 70)
        println("C grade")
    else if(marks in 50 until 60)
        println("D grade")
    else if(marks in 40 until 50)
        println("E grade")
    else
        println("F grade")


}