package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions
import org.example.TCK.연속된수의합

class 연속된수의합Test:StringSpec (
    {
        "연속 된 수의 합 계산" {
            val num:Int = 3
            val total:Int = 12
            val answer: IntArray = intArrayOf(3,4,5)
            val result:IntArray = 연속된수의합().solution(num, total)
            Assertions.assertThat(answer).isEqualTo(result)
        }
        "연속 된 수의 합 계산2" {
            val num:Int = 3
            val total:Int = 12
            val answer: IntArray = intArrayOf(3,4,5)
            val result:IntArray = 연속된수의합().solution2(num, total)
            Assertions.assertThat(answer).isEqualTo(result)
        }
    }
        )

