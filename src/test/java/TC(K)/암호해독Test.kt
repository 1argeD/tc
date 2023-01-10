package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions
import org.example.TCK.암호해독

class 암호해독Test : StringSpec(
    {
        "암호해독 테스트 코드" {
            val cipher:String="dfjardstddetckdaccccdegk"
            val code:Int = 4
            val result = 암호해독().solution(cipher,code)
            val answer = "attack"
            Assertions.assertThat(result).isEqualTo(answer)
        }
    }
)
