package org.example.TCK
/*https://school.programmers.co.kr/learn/courses/30/lessons/120923?language=kotlin*/
class 연속된수의합 {
    fun solution(num:Int, total:Int): IntArray {
        val sum:Int = num * (num-1)/2
        val start:Int = (total - sum)/num

        return (sum until start+num).map { it }.toIntArray()
        }

    fun solution2(num: Int, total: Int):IntArray{
        return (total/num - (num-1)/2).let {t-> IntArray(num) {Index -> Index + t} }
    }
    /*let 함수는 t 타입의 확장함수 fun <T, R> T.let(block: (T) -> R): R
    * 반환타입도 참조형 타입R로 선언되어, 어떤 타입도 반환타입으로 가질 수 있으며, 반환값을 가지지 않을 수도 있다
    * */
    }

