package cz.kojotak.keuler.util

import java.math.BigInteger

fun bigDecimalToDigitArray(bigInteger: BigInteger): IntArray = bigInteger.toString().map {
    it.digitToInt()
}.toIntArray()
