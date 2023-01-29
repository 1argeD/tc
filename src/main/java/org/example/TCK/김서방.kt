package org.example.TCK

import java.util.Arrays

/*https://school.programmers.co.kr/learn/courses/30/lessons/12919*/
class 김서방 {
    fun solution(seoul: Array<String>):String {
        var answer = ""
        var k :Int = 0
        for(i in seoul) {
            if(i.equals("Kim")) {
                 ++k
                answer = "김서방은 "+k+"에 있다"
            }
        }
        return answer
    }
}