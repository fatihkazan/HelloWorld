/*
 * GENERAL
 * ==
 * !=
 *
 * NUMBERS
 * >
 * <
 * >=
 * <=
 *
 * CONDITION
 * && -> and -> "ve" Bir tane false hepsini false yapar
 * || -> or -> "veya" Bir tane true hepsini true yapar
 *
 * true && true -> true
 * true && false -> false
 * false && false -> false
 *
 * true || true -> true
 * true || false -> true
 * false || false -> false
 */

fun main() {
    print("Enter your name: ")
    val name = readLine()!!

    if (name == "fatih" || name == "ayşe") {
        println("Good name")
    } else {
        println("Bad name")
    }

    print("Enter your surname: ")
    val surname = readLine()!!

    if (surname != "kazan") {
        println("Get out of here")
    }

    print("Enter your grade: ")
    val grade = readLine()!!.toInt()

    /*
    if (grade > 100) {
        println("Invalid grade")
    }

    if (grade >= 80 && grade < 100) {
        println("AA")
    }

    if (grade >= 60 && grade < 80) {
        println("BB")
    }

    if (grade >= 40 && grade < 60) {
        println("CC")
    }

    if (grade >= 20 && grade < 40) {
        println("DD")
    }

    if (grade >= 0 && grade < 20) {
        println("FF")
    }

    if (grade < 0) {
        println("Invalid grade")
    }
    */

    if (grade > 100) {
        println("Invalid grade")
    } else if (grade >= 80) {
        println("AA")
    } else if (grade >= 60) {
        println("BB")
    } else if (grade >= 40) {
        println("CC")
    } else if (grade >= 20) {
        println("DD")
    } else if (grade >= 0) {
        println("FF")
    } else {
        println("Invalid grade")
    }

    println("Good bye!")
}