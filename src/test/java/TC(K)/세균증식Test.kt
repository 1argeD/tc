package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions
import org.example.TCK.세균증식


class 세균증식Test : StringSpec(

    {
        "세균증식 테스트 코드"{
            val n: Int = 2
            val t: Int =10
            val answer: Int = 2048
            val result:Int = 세균증식().solution2(n, t)
            Assertions.assertThat(result).isEqualTo(answer)
        }

        "세균증식 테스트 코드 2"{
            val n:Int = 7
            val t:Int = 15
            val answer: Int = 229376
            val result:Int = 세균증식().solution2(n,t)
            Assertions.assertThat(result).isEqualTo(answer)
        }

    }

)
