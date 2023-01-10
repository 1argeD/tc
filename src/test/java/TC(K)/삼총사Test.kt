package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import nonapi.io.github.classgraph.utils.Assert
import org.assertj.core.api.Assertions
import org.example.TCK.삼총사

class 삼총사Test:StringSpec(
    {
        "삼총사 테스트 1"{
            val number:Array<Int> = arrayOf(-2, 3, 0, 2, -5)
            val answer:Int = 2
            val result:Int = 삼총사().solution(number)
            Assertions.assertThat(result).isEqualTo(answer)
        }

        "삼총사 테스트 2" {
            val number:Array<Int> = arrayOf(-3, -2, -1, 0, 1, 2, 3)
            val answer = 5
            var result = 삼총사().solution(number)
            Assertions.assertThat(answer).isEqualTo(result)
        }
    }
)
