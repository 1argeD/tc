package org.example.TCK

/*https://school.programmers.co.kr/learn/courses/30/lessons/120956*/
class 옹알이 {
    fun solution(babbling:Array<String>): Int{
        var count:Int = 0

        babbling.forEach {
            if(
                it.replaceFirst("aya"," ")
                    .replaceFirst("ye"," ")
                    .replaceFirst("woo"," ")
                    .replaceFirst("ma"," ")
                    .isBlank()
            )
            {count++}
        }
        return count
    }
}

