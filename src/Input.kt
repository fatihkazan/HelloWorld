import java.time.Year

fun main() {
    println("Welcome!")
    print("Enter your name: ")
    val name = readLine()!!
    println("Hello $name")

    print("Enter birth year: ")
    val birthYear = readLine()!!.toInt()
    val thisYear = Year.now().value
    val age = thisYear - birthYear
    println("Your age is $age")

    /*
    print("Enter birth year: ")
    println("Your age is ${2019 - readLine()!!.toInt()}")
    */
}