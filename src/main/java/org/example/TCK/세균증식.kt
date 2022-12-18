package org.example.TCK

/*https://school.programmers.co.kr/learn/courses/30/lessons/120910*/
class 세균증식 {
    fun solution(n : Int, t : Int) : Int{
        var answer = 0
        var count = 0
        var s= n
        while(count != t){
            s = s*2
            count++
        }
        answer = s
        return answer
    }
}
