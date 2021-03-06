import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RomanNumeralsEncoderShould {

    private val romanNumeralsEncoder = RomanNumeralsEncoder()

    @Test
    fun throw_exception_when_receives_0_as_input() {
        val exception = Assertions.assertThrows(Exception::class.java) {
            romanNumeralsEncoder.encode(0)
        }
        Assertions.assertEquals("No valid input", exception.message)
    }

    @Test
    fun return_I_when_receives_1_as_input() {
        val encodedNumber = romanNumeralsEncoder.encode(1)

        Assertions.assertEquals("I", encodedNumber)
    }

    @Test
    fun return_II_when_receives_2_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(2)

        Assertions.assertEquals("II", encodedNumber)
    }

    @Test
    fun return_III_when_receives_3_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(3)

        Assertions.assertEquals("III", encodedNumber)
    }

    @Test
    fun return_IV_when_receives_4_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(4)

        Assertions.assertEquals("IV", encodedNumber)
    }

    @Test
    fun return_VI_when_receives_6_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(6)

        Assertions.assertEquals("VI", encodedNumber)
    }

    @Test
    fun return_XIV_when_receives_19_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(14)

        Assertions.assertEquals("XIV", encodedNumber)
    }

    @Test
    fun return_XX_when_receives_20_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(20)

        Assertions.assertEquals("XX", encodedNumber)
    }

    @Test
    fun return_XL_when_receives_40_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(40)

        Assertions.assertEquals("XL", encodedNumber)
    }

    @Test
    fun return_CMXCIX_when_receives_999_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(999)

        Assertions.assertEquals("CMXCIX", encodedNumber)
    }

    @Test
    fun return_MCDLVIII_when_receives_1458_as_input(){
        val encodedNumber = romanNumeralsEncoder.encode(1458)

        Assertions.assertEquals("MCDLVIII", encodedNumber)
    }

    @Test
    fun  throw_exception_when_receives_4000_as_input(){
        val exception = Assertions.assertThrows(Exception::class.java) {
            romanNumeralsEncoder.encode(4000)
        }
        Assertions.assertEquals("No valid input", exception.message)
    }
}