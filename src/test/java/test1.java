import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class test1 {
    @DataProvider (name = "q")
    public Object [][] testData(){
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
    @Test ()
    public void test (){
        System.out.println("Test");
    }
    @Test (dataProvider = "q", groups = "W")
    public void test2(Object o1, Object o2){
        System.out.println("Test data: " + o1 +" " + o2);

    }
    @AfterMethod (onlyForGroups = "W", groups = "E")
    public void afterMethod(){
            System.out.println("AfterMethod");
    }
    @AfterMethod (onlyForGroups = "W")
    public void afterMethod1 (){
        System.out.println("AfterMethod");
}
    @Test ()
    public void test3 (){
        System.out.println("Test");
    }
    @Test (dataProvider = "1",groups = "2")
    public void test4 (Object o1, Object o2){
        System.out.println("Test data: " + o1 +" " + o2);
    }
    @AfterMethod (onlyForGroups = "2")
    public void afterMethod2 (){
        System.out.println("AfterMethod");
    }
    @Test ()
    public void test5 (){
        System.out.println("Test");
    }
    @Test (dataProvider = "2",groups = "3")
    public void test6 (Object o1, Object o2){
        System.out.println("Test data: " + o1 +" " + o2);
    }
    @AfterMethod (onlyForGroups = "3")
    public void afterMethod3 (){
        System.out.println("AfterMethod");
}}


