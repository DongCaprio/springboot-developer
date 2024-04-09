import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class JUnitTest {

    @DisplayName("1 더하기 2는 3이다..!")
    @Test
    public void junitTest(){
        int a = 1;
        int b = 2;
        int sum = 3;

        Assertions.assertEquals(sum, a+b);

    }

    @DisplayName("홍길동 테스트")
    @Test
    public void hongTest(){
        String name1 = "홍길동";
        String name2 = "홍길동";
        String name3 = "홍길은";

        assertThat(name1).isNotNull();
        assertThat(name2).isNotNull();
        assertThat(name3).isNotNull();

        assertThat(name1).isEqualTo(name2);

        assertThat(name1).isNotEqualTo(name3);
    }

    @DisplayName("test2")
    @Test
    public void test2(){
        int num1 = 15;
        int num2 = 0;
        int num3 = -5;

        assertThat(num1).isPositive();
        assertThat(num2).isEqualTo(0);
        assertThat(num2).isZero();
        assertThat(num3).isNegative();
        assertThat(num1).isGreaterThan(num2);
        assertThat(num3).isLessThan(num2);
    }


    @DisplayName("test3")
    @Test
    public void junitQuiz3(){
        System.out.println("This is first Test");
    }


}
