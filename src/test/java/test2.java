import org.testng.annotations.*;

public class test2 {
    @DataProvider (name = "q")
    public static Object [][] testData(){
        return new Object [] [] {
                {1,2},
        };
    }
    @DataProvider (name = "1")
    public Object [][] testData1(){
        return new Object [] [] {
                {"three","four"},
        };
    }
    @DataProvider (name = "2")
    public Object [][] testData2(){
        return new Object [] [] {
                {"true","false"},
        };
    }
@BeforeClass()
    public void beforeClass(){
    System.out.println("BeforeClass");
}
@Test (invocationCount = 2 )
    public void test () {
    System.out.println("Test");
}
@Test(dataProvider = "q", groups = "1")
    public void test2 (Object o1, Object o2) {
    System.out.println("Test data: " + o1 + " " + o2);
}
@AfterMethod(onlyForGroups = "1")
    public void afterMethod (){
    System.out.println("AfterMethod");
}
@Test()
    public void test3 (){
    System.out.println("Test");
}
@Test(dataProvider = "1", groups = "2")
    public void test4 (Object o1, Object o2){
    System.out.println("Test data: " + o1 + " " + o2);
}
    @Test()
    public void tes5 (){
        System.out.println("Test");
    }
    @AfterMethod(onlyForGroups = "2")
    public void afterMethod1 (){
        System.out.println("Test");
    }
    @Test(dataProvider = "2")
    public void test7 (Object o1, Object o2){
        System.out.println("Test data: " + o1 + " " + o2);
    }
    @AfterClass
    public void afterClass (){
        System.out.println("AfterClass");
    }
    @AfterClass
    public void afterClass1(){
        System.out.println("AfterClass");
    }
    @AfterTest()
    public void afterTest(){
        System.out.println("AfterTest");
    }


}

