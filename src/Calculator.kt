fun main() {
    println("CALCULATOR (ONLY SUM :D)")
    print("1. number: ")
    val number1 = readLine()!!.toInt()
    print("2. number: ")
    val number2 = readLine()!!.toInt()
    val total = number1 + number2
    println("Total is $total")
    println("Total is ${number1 + number2}")
}