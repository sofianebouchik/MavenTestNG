import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class testTwo {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }

    @Test(dataProvider = "provider", dataProviderClass = DataProvideHelper.class)
    public void test4(int ssn,String name){
        System.out.println("ssn is"+ssn);
        System.out.println("name is"+name);
    }
    @Test
    public void test5(){
        System.out.println("test10");
    }
    @Test
    public void test6(){
        System.out.println("test6");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }


}
