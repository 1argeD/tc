package org.example.TCK

import java.util.function.IntFunction
import java.util.function.IntPredicate
import java.util.stream.Collectors
import java.util.stream.IntStream
/*https://school.programmers.co.kr/learn/courses/30/lessons/120892?language=kotlin*/
class 암호해독 {
    /**/
    fun solution(cipher:String, code:Int):String =
        cipher.filterIndexed{i, _ -> (i+1) % code == 0}
}
