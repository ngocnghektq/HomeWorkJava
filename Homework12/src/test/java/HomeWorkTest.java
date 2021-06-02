import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Test;
import static org.assertj.core.api.Assertions.withPrecision;
import org.junit.jupiter.api.*;

public class HomeWorkTest {

    @Test
    public void KtEmail()
    {
        String so = "asdsff@com.vn";
        Assertions.assertThat(so).containsOnlyOnce("@")
               .doesNotContain("..")
                .doesNotStartWith("@")
                .doesNotEndWith("@")
                .containsPattern("^[a-zA-Z][\\w-]+[\\w.]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$");
        //truoc @ van co (.-_ ngan cach cac text truoc @
    }
    @Test
    public void ktCanNangKG()
    {
        float donviKG = 48.5f;

        Assertions.assertThat(donviKG).isNotZero()
                .isBetween(0.6f,250f);// can nang khong duoi 0.6kg vi tre so sinh cung tren 0.6kg :)


    }
    @Test
    public void ktCanNangDonVigam(){
        String gam= "48500g";
        Assertions.assertThat(gam).isNotEmpty()
                .doesNotStartWith("0") // can nang khong duoi 1kg vi tre so sinh cung tren 1kg :)
                .containsPattern("^[0-9]+[0-9]+[a-z&&[g]]");//Khong gioi han hasSize vi co nguoi 50kg co nguoi tren 100 kg
    }
    @Test
    public void ktCMT(){
        String [] soCMT={"070885432","070885436","070885437", "070885437","070885437"};
        for (int i=0; i<soCMT.length; i++){
            Assertions.assertThat(soCMT[i]).isNotEmpty()
    //                .startsWith(0)  //Nhieu vung CMT k bat dau bang so 0
                    .hasSize(9)
                    .containsPattern("[0-9]");

        }


    }
}
