import org.testng.annotations.*;

public class test3 {
    @BeforeTest()
    public void beforeTest(){
        System.out.println("BeforeTest");
    }
    @Test()
    public void testQE(){
        System.out.println("Test");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("AfterMethod");
    }
    @AfterTest()
    public void afterTest(){
        System.out.println("AfterTest");
    }
}
