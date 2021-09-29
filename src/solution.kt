//
fun main(args: Array<String>) {
    print("Enter a String here:")
    var st = readLine()!!
    println(getLength(st))
    println("\n")

    var old: String = "The quick brown fox jumps over the lazy dog."
    var new: String = old.substring(9, 23)
    println("\b The new String is"+new)
    println("\n")
    print("Enter the weather in F to convert it to celcius :")
    var Inte = readLine()!!.toInt()
var the_weather_in_C:Int = weather(Inte)
    println("The weather in celcius is: $the_weather_in_C")
}

fun getLength(str: String?): Int {
    // Add null check here

    if (str != null) {
        return str.length
    } else {
        return 0
    }
}
//C = (5 (F-32)) / 9.

fun weather(f:Int): Int {
    return(((5*(f-32))/9))
}






