import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestOne {
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }


    @Test(dataProvider = "provider")
    public void Test1(int ssn,String name){
        System.out.println(ssn);
        System.out.println(name);

    }
    @Test
    public void Test2(){
        System.out.println("test 2");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
    @DataProvider(name="provider")
    public Object[][]dataProvider(){
        Object[][]data=new Object[2][2];
       data[0][0]=123;
       data[0][1]="kasif";
       data[1][0]=236;
       data[1][1]="asma";
       return data;
    }

}
