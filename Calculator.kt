import java.util.Scanner
import kotlin.system.exitProcess

fun main()
{
    var operationType:Int

    val sc = Scanner(System.`in`)

    print("Enter number 1:")
    val num1:Double = sc.nextDouble()

    print("Enter number 2:")
    val num2:Double = sc.nextDouble()

    while(true)
    {
        println()
        println("Menu")
        println("1.Addition")
        println("2.Subtraction")
        println("3.Multiplication")
        println("4.Division")
        println("5.Modulus")
        println("6.Exit")

        print("Enter choice:")
        operationType = sc.nextInt()

        if(operationType in 1..6)
        {

            if(operationType == 1){
               print("Result is :${num1 + num2}")
            }
            else if(operationType == 2){
                print("Result is : ${num1 - num2}")
            }
            else  if(operationType == 3){
                print("Result is : ${num1 * num2}")
            }
            else if(operationType == 4){
                print("Result is : ${num1 / num2}")
            }
            else if(operationType == 5) {
                print("Result is : ${num1 % num2}")
            }
            else
            {
                println("Menu Exited")
                exitProcess(0)
            }
        }
        else{
            println("Invalid choice for operation")
        }





    }






}