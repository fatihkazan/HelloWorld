fun main() {
    val myString = "what can i do sometimes"

    println(myString.get(5)) // Indexler 0'dan başlar UNUTMA !!!
    println(myString[6]) // Belirtilen indexteki karakteri çıkarır

    println("$myString[5] ${myString[11]}")

    val char5 = myString[5]
    val char11 = myString[11]
    println("$char5 - $char11")


    println(myString.substring(20)) // Belirtilen indexten başlayıp (dahil) sonuna kadar olan stringi çıkarır
    println(myString.substring(5, 15)) // Başlangıç indexi dahil, bitiş indexi dahil değil
    // println(myString.substring(0,24)) // Sınırları aşarsan hata fırlatır!!!

    println(myString.toUpperCase()) // Bütün harfleri büyük yapar

    val myBigString = "HELLO"
    println(myBigString.toLowerCase()) // Bütün harfleri küçük yapar

    println(myString.equals(myBigString)) // Eşitlik kontrolü
    println(myString == myBigString)

    val emptyString = ""
    println(emptyString.isEmpty()) // Karaktersiz string

    val blankString = "  \n  "
    println(blankString.isBlank())

    println(myString.plus(myBigString)) // String birleştirme
    println(myString + myBigString)

    println(myString.replace("can", "ali")) // Belli bir string parçasını değiştirme
}