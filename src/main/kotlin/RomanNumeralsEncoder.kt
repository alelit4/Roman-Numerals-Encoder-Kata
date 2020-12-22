import java.lang.Exception

class RomanNumeralsEncoder {
    fun encode(number: Int): String {
        if (number < 1) {
            throw Exception("No valid input")
        }else if(number == 1){
            return "I"
        }
        return "II"
    }
}