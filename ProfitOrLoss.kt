import java.util.*

fun main() {
    val sc = Scanner(System.`in`)

    while (true)
    {
        print("Enter Cost Price :")
        val cp = sc.nextDouble()
        print("Enter  Selling Price :")
        val sp = sc.nextDouble()

        val diff = sp - cp
        println("Diffence is $diff")

        if (diff>0)
        {
            println("Profit of $diff")
        }
        else if(diff<0)
        {
            println("Loss of $diff")
        }
        else
        {
            println("Neither profit nor loss")
        }
    }

    }


