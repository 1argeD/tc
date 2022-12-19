package `TC(K)`

import io.kotest.core.spec.style.StringSpec
import org.assertj.core.api.Assertions
import org.example.TCK.옹알이

class 옹알이Test : StringSpec(
    {
        "옹알이 테스트 코드" {
            val babbling : Array<String> =  arrayOf("ayaye", "uuuma", "ye", "yemawoo", "ayaa")
            var result:Int = 옹알이().solution(babbling)
            val answer:Int = 3
            Assertions.assertThat(result).isEqualTo(answer)
        }

        "옹알이 테스트 코드 2"{
            val babbling:Array<String> = arrayOf("aya", "yee", "u", "maa", "wyeoo")
            var result:Int = 옹알이().solution(babbling)
            val answer:Int = 1
            Assertions.assertThat(result).isEqualTo(answer)
        }
    }
)


