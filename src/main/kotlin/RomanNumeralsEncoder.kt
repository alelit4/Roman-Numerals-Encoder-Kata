import java.lang.Exception
import java.util.ArrayList

class RomanNumeralsEncoder {
    val romanBasicNumbers: HashMap<Int, String> = hashMapOf( 1 to "I", 4 to "IV", 5 to "V")

    fun encode(number: Int): String {
        if (number < 1) {
            throw Exception("No valid input")
        }
        var romanNumber = ""
        if(number in romanBasicNumbers.keys)
            return romanBasicNumbers[number].toString()
        for (element in 1..number){
            romanNumber += "I"
        }
        return romanNumber
    }
}