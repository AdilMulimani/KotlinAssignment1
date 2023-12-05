import java.util.*

fun main()
{
    val sc = Scanner(System.`in`)

    while (true)
    {
        print("Enter characters of English Alphabet")
        val char:Char = sc.next()[0]

        if(char =='a' || char == 'e' || char == 'i' || char == 'o' || char == 'u')
        {
            println("Vowel")
        }
        else
        {
            println("Consonant")
        }

    }
}