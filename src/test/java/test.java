import org.testng.annotations.*;

public class test {
    @Test
    public void test() {
        System.out.println("Test");
    }
    @AfterMethod
    public void afterMethod () {
        System.out.println("AfterMethod");
    }
    @BeforeSuite
    public void beforeSuite (){
        System.out.println("BeforeSuite");
    }
    @BeforeClass (groups = "s")
    public void beforeClass (){
        System.out.println("BeforeClass");
    }
    @AfterSuite
    public void  AfterSuite () {
        System.out.println("AfterSuite");
    }
}