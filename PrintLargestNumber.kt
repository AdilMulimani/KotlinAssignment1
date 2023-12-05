import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)

    while (true)
    {
        print("Enter number 1:")
        val num1:Int = sc.nextInt()
        print("Enter number 2:")
        val num2:Int = sc.nextInt()
        print("Enter number 3:")
        val num3:Int = sc.nextInt()

        if(num1>num2 && num1>num3)
        {
            println("The larger number is :$num1")
        }
        else if(num2>num1 && num2>num3)
        {
            println("The larger number is :$num2")
        }
        else if(num3>num1 && num3>num2)
        {
            println("The larger number is :$num3")
        }
        else if(num1>num2 && num1==num3)
        {
            println("num1 is equal to num3")
        }  else if(num1>num3 && num1==num2)
        {
            println("num1 is equal to num2")
        }  else if(num2>num1 && num2==num3)
        {
            println("num2 is equal to num3")
        }
        else
        {
            println("All the numbers are equal")
        }
    }
}