import org.junit.jupiter.api.*;

public class JUnitExamples {

    @BeforeAll
    static void beforeAll(){
        System.out.println("Here is before all");
    }

    @BeforeEach
    void beforeEach(){
        System.out.println("  Here is before Each");
    }

    @AfterAll
    static void afterAll(){
        System.out.println("Here is after all");
    }

    @AfterEach
    void AfterEach(){
        System.out.println("  Here is after Each");
    }
    @Test
   void firstTest () {
        System.out.println("   firstTest");
    }
        @Test
        void secondTest () {
            System.out.println("    secondTest");
        }
   }

