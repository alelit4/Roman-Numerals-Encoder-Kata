import java.lang.Exception
import java.util.ArrayList

class RomanNumeralsEncoder {
    private val romanBasicNumbers: HashMap<Int, String> = hashMapOf( 1 to "I", 4 to "IV", 5 to "V", 9 to "IX", 10 to "X")

    fun encode(_number: Int): String {
        var number = _number

        if (number < 1) {
            throw Exception("No valid input")
        }
        var romanNumber = ""
        if(number in romanBasicNumbers.keys)
            return romanBasicNumbers[number].toString()

        for ( key in romanBasicNumbers.keys.sorted().reversed()){
            if (number > key ){
                romanNumber += romanBasicNumbers[key]
                number -= key
            }
        }
        for (element in 1..number){
            romanNumber += "I"
        }
        return romanNumber
    }
}