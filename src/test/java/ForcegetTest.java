import Base.BaseTest;
import Pages.HomePage;
import Pages.LoginPage;
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
        sleep(5000);
        loginPage.countryClick();
        loginPage.phone();
        loginPage.company();
        loginPage.email();
        loginPage.titleDropDown();
        sleep(3000);
        loginPage.titleClick();
        loginPage.password();
        sleep(3000);
        loginPage.sifreMaskeleme();
        sleep(3000);
        loginPage.confirmPassword();
        loginPage.confirmSifreMaskeleme();
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
        homePage.password();
        homePage.signIn();
        sleep(5000);

    }
}
