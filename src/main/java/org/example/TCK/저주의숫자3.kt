package org.example.TCK

class 저주의숫자3 {
    fun solution(n:Int):Int{
        var answer =0
        /*until은 마지막 값을 제외한 range 표현법으로 ..을 이용할 수 도 있지만, ..의 경우에는 마지막 값을 포함한다.*/
        for(i in 0 until n) {
            answer++
            while(answer%3==0||answer.toString().contains('3')) {
                answer++
            }
        }
        return answer
    }
}
