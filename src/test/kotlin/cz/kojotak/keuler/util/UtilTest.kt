package cz.kojotak.keuler.util

import org.junit.jupiter.api.Test
import java.math.BigInteger
import kotlin.test.assertContentEquals

class UtilTest {

    @Test
    fun bigDecimalToDigitArray() {
        val actual = bigDecimalToDigitArray(BigInteger.valueOf(123456789))
        val expected = IntArray(9) { it + 1 }
        assertContentEquals(expected, actual)
    }
}
