import org.testng.annotations.DataProvider;

public class DataProvideHelper {
    @DataProvider(name="provider")
    public static Object[][]dataProvider(){
        Object[][]data=new Object[4][2];
        data[0][0]=123;
        data[0][1]="kasif";
        data[1][0]=236;
        data[1][1]="asma";
        data[2][0]=45;
        data[2][1]=" halim";
        data[3][0]=56;
        data[3][1]=" aziz";
        return data;
    }

}
