package org.example.TCK
/*https://school.programmers.co.kr/learn/courses/30/lessons/131705*/
class 삼총사 {
    fun solution(number:Array<Int>):Int{
        var answer:Int=0
        for((i,n) in number.withIndex()) { /*withIndex()를 사용하면(index, value) 쌍 값을 얻을 수 있다. */
            for((j,m) in number.withIndex()) {
                for((k,l) in number.withIndex()) {
                    if((i>j)&&(j>k)) {
                        if(n+m+l==0) {
                            answer++
                        }
                    }
                }
            }
        }

        return answer;
    }
}
