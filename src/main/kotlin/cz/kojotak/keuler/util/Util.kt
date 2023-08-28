package cz.kojotak.keuler.util

import java.math.BigInteger

fun bigDecimalToDigitArray(bigInteger: BigInteger): IntArray = bigInteger.toString().map {
    it.digitToInt()
}.toIntArray()

fun factorial(number: Int): BigInteger = (1..number).fold(BigInteger.ONE) {
        acc, i ->
    acc.multiply(BigInteger.valueOf(i.toLong()))
}
