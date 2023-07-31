package cz.kojotak.keuler

import java.util.stream.IntStream

fun multipliesOf3or5() = IntStream.range(1, 1000).filter{  it % 3 == 0 || it % 5 == 0}.sum()
