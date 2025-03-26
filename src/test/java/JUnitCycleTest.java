import org.junit.jupiter.api.*;

public class JUnitCycleTest {
    @BeforeAll //전체테스트를 시작하기 전에 1회 실행하므로 메서드는 Static으로 선언
    static void beforeAll(){
        System.out.println("@BeforeAll");
    }

    @BeforeEach //테스트 케이스를 시작하기 전마다 실행
    public void beforeEach(){
        System.out.println("@BeforeEach");
    }

    @Test
    public void test1(){
        System.out.println("test1");
    }

    @Test
    public void test2(){
        System.out.println("test2");
    }

    @Test
    public void test3(){
        System.out.println("test3");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("@AfterAll");
    }

    @AfterEach
    public void afterEach(){
        System.out.println("AfterEeach");
    }
}
