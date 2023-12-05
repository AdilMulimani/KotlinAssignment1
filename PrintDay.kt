import java.util.Scanner

fun main()
{
     var day:Int

     val sc = Scanner(System.`in`)

   while(true)
   {
       print("Enter day number:")
       day = sc.nextInt()

       if(day in 1..7)
       {
           if(day == 1){
               println("Monday")
           }
           else if(day == 2){
               println("Tuesday")
           }
           else if(day == 3){
               println("Wednesday")
           }
           else if(day == 4){
               println("Thursday")
           }
           else if(day == 5){
               println("Friday")
           }
           else if(day == 6){
               println("Saturday")
           }
           else {
               println("Sunday")
           }

       }
       else
       {
           println("Invalid Input")
       }
   }

}

