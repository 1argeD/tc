package org.example.TCK

class 삼총사 {
    fun solution(number:Array<Int>):Int{
        var answer:Int=0
        for((i,n) in number.withIndex()) {
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
