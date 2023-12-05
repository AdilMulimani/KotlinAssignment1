import java.util.*

fun main()
{
    val sc = Scanner(System.`in`)


    print("Enter marks in Subject 1:")
    val sub1:Int = sc.nextInt()
    print("Enter marks in Subject 2:")
    val sub2:Int = sc.nextInt()
    print("Enter marks in Subject 3:")
    val sub3:Int = sc.nextInt()

    val avg:Double = (sub1+sub2+sub3)/3.0
    println("Average is $avg")

    if(avg >=60)
        println("Pass")
    else
        println("Fail")

}