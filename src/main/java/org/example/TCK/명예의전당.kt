package org.example.TCK

import java.util.PriorityQueue

class 명예의전당 {
    fun solution(k:Int, score:IntArray):IntArray{
        var answer: MutableList<Int> = mutableListOf<Int>()
        val list = PriorityQueue<Int>()
        for(i:Int in score){
            if(list.size<k) {
                list.add(i);
            } else {
                if(list.peek() < i){
                    list.add(i)
                    list.poll()
                }
            }
            answer.add(list.peek())
        }
        return answer.toIntArray()
    }
}
