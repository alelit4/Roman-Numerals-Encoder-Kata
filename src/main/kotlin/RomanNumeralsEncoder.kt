import java.lang.Exception
import java.util.ArrayList

class RomanNumeralsEncoder {
    private val romanBasicNumbers: HashMap<Int, String> = hashMapOf(
        1 to "I", 4 to "IV", 5 to "V", 9 to "IX", 10 to "X",
        40 to "XL", 50 to "L", 90 to "XC", 100 to "C", 400 to "CD", 500 to "D",
        900 to "CM", 1000 to "M"
    )

    fun encode(_number: Int): String {
        var number = _number

        if (number < 1) {
            throw Exception("No valid input")
        }
        var romanNumber = ""

        println(romanBasicNumbers.keys.sorted().reversed())
        for (key in romanBasicNumbers.keys.sorted().reversed()) {
            while (number >= key) {
                romanNumber += romanBasicNumbers[key]
                number -= key
            }
        }
        return romanNumber
    }
}