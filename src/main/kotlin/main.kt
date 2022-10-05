import java.lang.NumberFormatException

fun main() {
    var person1 = Commercial( "John Wick","342-232-6467",
        "9189 something road","150000",
        "Wick estates",true)

    var person2 = Commercial( "DoraTheExplorer","134-424-8193",
        "9109 treasure Av","1200",
        "SwiperNoSwiping",false)

    var person3 = Residential("a","e",
        "i","30000",
        true)

    var person4 = Residential("Sunny","313-544-4252",
        "1213 Faraway Town","13000",
        false)


    println("Please select:" +
            "\n1) Commercial" +
            "\n2) Residendial")
    var input = readln()!!.toInt()


    try{
        var message = "2"
        message.toInt()
    }catch (exception:NumberFormatException){
    }




}