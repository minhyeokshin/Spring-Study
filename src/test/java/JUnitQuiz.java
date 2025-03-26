import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitQuiz {
    @Test
    public void junitTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        //모든변수가 null이 아닌지 확인
        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();
        //name1과 name2가 같은지 확인
        assertThat(name1).isEqualTo(name2);
        //name1과 name3이 다른지 확인
        assertThat(name1).isNotEqualTo(name3);
    }
}
