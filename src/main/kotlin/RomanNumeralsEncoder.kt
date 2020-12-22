import java.lang.Exception

class RomanNumeralsEncoder {
    fun encode(number: Int): String {
        if (number < 1) {
            throw Exception("No valid input")
        }
        var romanNumber = ""
        for (element in 1..number){
            romanNumber += "I"
        }
        return romanNumber
    }
}