package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions
import org.example.TCK.김서방

class 김서방Test: StringSpec(
    {
        "김서방 찾기"{
            val seoul = arrayOf("Jane", "Kim")
            val answer = "김서방은 1에 있다"
            val result = 김서방().solution(seoul)
            Assertions.assertThat(answer).isEqualTo(result)
        }
    }
)