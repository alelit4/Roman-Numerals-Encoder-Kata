import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test

internal class RomanNumeralsEncoderShould {

    @Test
    fun throw_exception_when_receive_0_as_input() {
        val romanNumeralsEncoder = RomanNumeralsEncoder()
        Assertions.assertThrows(Exception::class.java) {
            romanNumeralsEncoder.encode(0);
        }
    }
}