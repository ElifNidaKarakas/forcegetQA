import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ForcegetTest extends BaseTest {
    LoginPage loginPage = new LoginPage();
    HomePage homePage = new HomePage();

    @Test(description = "otomatik kayıt olma")
    public void successfulRegistration() throws InterruptedException {
        driver.get("https://app.forceget.com/system/account/register");
        Thread.sleep(5000);
        loginPage.firstNameDoldur();
        loginPage.lastNameDoldur();
        loginPage.countryTextBoxClick();
        sleep(3000);
      //  loginPage.countryClick();   //ülke kodunu seçtirmiyor
        loginPage.phone();
        loginPage.company();
        loginPage.email();
        loginPage.titleDropDown();
        sleep(5000);
      //  loginPage.titleClick(); //Pozisyonu  seçtirmiyor
        sleep(1000);
        loginPage.password();
        sleep(3000);
        loginPage.sifreMaskeleme();
        sleep(3000);
        loginPage.confirmPassword();
        loginPage.confirmSifreMaskeleme();
        String passwordValue = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[4]/nz-form-item/nz-form-control/div/div/nz-input-group/input")).getAttribute("value");
        String confirmPasswordValue = driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[5]/nz-form-item/nz-form-control/div/div/nz-input-group/input")).getAttribute("value");
        Assert.assertEquals(passwordValue, confirmPasswordValue, "Passwords must match");

        System.out.println("Şifreler eşleşti, kayıt işlemine devam ediliyor.");

        loginPage.gizlilikSozlesmesi();
        sleep(3000);
        loginPage.acceptButton();
        loginPage.signUp();
    }


    @Test(description = " kullanıcı girişi kontrolü")
    public void successfulLogin() throws InterruptedException {
        driver.get("https://app.forceget.com/system/account/login");
        sleep(2000);
        homePage.email();
        homePage.password(password);
        homePage.signIn();
        sleep(5000);

    }
    @Test(description = "Hatalı Login Kullanıcı Giriş Kontrol")
    public void notValidLogin() throws InterruptedException {

        driver.get("https://app.forceget.com/system/account/login");
        sleep(2000);
        homePage.email();
        homePage.password("123456");
        homePage.signIn();
        sleep(3000);
        homePage.hataMesajiKontrolu(errorMessage);
        sleep(3000);
    }
}
