package org.example.TCK

import java.util.Arrays

/*https://school.programmers.co.kr/learn/courses/30/lessons/12919*/
class 김서방 {
    fun solution(seoul: Array<String>):String {
        var answer = ""
        for(i in seoul) {
            if(i.equals("Kim")) {
                answer = "김서방은 "+i+"에 있다"
            }
        }
        return answer
    }
}