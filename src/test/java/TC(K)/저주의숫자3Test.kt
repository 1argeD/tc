package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions
import org.example.TCK.저주의숫자3

class 저주의숫자3Test:StringSpec(
    {
        "저주의 숫자 3test" {
            val n:Int = 15
            val result:Int = 25
            val answer:Int = 저주의숫자3().solution(n)

            Assertions.assertThat(result).isEqualTo(answer)
        }
    }
)
