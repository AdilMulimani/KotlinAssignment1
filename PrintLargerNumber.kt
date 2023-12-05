import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

   while (true)
   {
       print("Enter number 1:")
       val num1:Int = sc.nextInt()
       print("Enter number 2:")
       val num2:Int = sc.nextInt()

       if(num1>num2)
       {
           println("The larger number is :$num1")
       }
       else if(num2>num1)
       {
           println("The larger number is :$num2")
       }
       else
       {
           println("Both the numbers are equal")
       }
   }
}