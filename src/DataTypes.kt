/*
* Char -> Character - Karakter
* Int -> Integer - Tam sayı
* Double -> Küsüratlı sayılar
* Boolean -> Mantıksal -> True, False
* String -> Metinler
* Float
* Long
* Short
* Byte
*/

/*
    val -> Value - Değer
    var -> Variable - Değişken
 */

fun main() {
    var number: Int

    number = 10

    //println ( number )

    number = 15 // thrthrthtr

    //println(number)

    var doubleNumber: Double

    doubleNumber = 10.0

    //println(doubleNumber)

    val bool: Boolean = true

    //println(bool)

    val text: String = "Hi"

    //println(text)

    val char: Char = '@'

    //println(char)

    val char2: Char = '\''

    //println(char2)

    val doubleNumberString = doubleNumber.toString()

    // println("number $number text $text")

    /*println("""
        $bool zaaaa $char2
        zaaaa2

        napıyom la ben
    """.trimIndent())*/

    val string1 = "Hello"
    val string2 = "Fatih"
    val how = "How are you?"
    val blank = " "

    val bigString = string1 + " " + (5 + 6) + " " + bool + "\n" + how + " " + "I'm fine"

    println(bigString)

}