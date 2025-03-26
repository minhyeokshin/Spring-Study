import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class JUnitTest2 {

    @Test
    public void junitTest2(){
        int number1 = 15;
        int number2 = 0;
        int number3 = -5;

        //number1 양수인지 확인
        assertThat(number1).isPositive();
        //number2 0인지 확인
        assertThat(number2).isEqualTo(0);
        //number3 음수인지 확인
        assertThat(number3).isNegative();
        //number1은 number2보다 큰지 확인
        assertThat(number1).isGreaterThan(number2);
        //number3은 number2보다 작은지 확인
        assertThat(number3).isLessThan(number2);
    }
}
