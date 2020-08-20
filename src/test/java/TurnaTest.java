import org.junit.Test;

public class TurnaTest extends BaseTest{


    @Test
    public void turnaBiletSenaryoları(){
        new HomePage(driver);
        new BiletKontrolPage(driver).biletBak();
        new UcusSecPage(driver).ucusSec();
        new YolcuBilgileri(driver).bilgileriGir();
    }
}
