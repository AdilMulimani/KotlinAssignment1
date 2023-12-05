import java.util.Scanner

fun main()
{
    val month:Int

    val sc:Scanner = Scanner(System.`in`)

    print("Enter Month as input:")
    month = sc.nextInt()


    if(month in 1..12)
    {
        if(month==1)
        {
            println("January")
        }
        else if(month==2)
        {
            println("February")

        }
        else if(month==3)
        {
            println("March")

        }
        else if(month==4)
        {
            println("April")

        }
        else if(month==5)
        {
            println("May")

        }
        else if(month==6)
        {
            println("June")

        }
        else if(month==7)
        {
            println("July")

        }
        else if(month==8)
        {
            println("August")

        }
        else if(month==9)
        {
            println("September")

        }
        else if(month==10)
        {
            println("October")

        }
      else if(month==11)
        {
            println("November")

      }
     else
        {
            println("December")

        }
    }
    else
    {
        println("Invalid Input")
    }
}

