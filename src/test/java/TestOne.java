import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestOne {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }


    @Test
    public void Test1(){
        System.out.println("test 1");
    }
    @Test
    public void Test2(){
        System.out.println("test 2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
}
