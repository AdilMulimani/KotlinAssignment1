import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    while (true)
    {
        print("Enter number :")
        val num:Int = sc.nextInt()

        if(num%2==0)
        {
            println("$num is Even")
        }
        else if(num%2!=0)
        {
            println("$num is Odd")
        }

    }
}