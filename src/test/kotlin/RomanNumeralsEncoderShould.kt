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
}