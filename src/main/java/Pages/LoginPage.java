package Pages;

import Base.BaseLibrary;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class LoginPage extends BaseLibrary {
    @Step("isim alanı doldurulur ")
    public LoginPage firstNameDoldur() {
        driver.findElement(By.xpath("//*[@id=\"firstName\"]")).sendKeys(Data.firstName);
        return this;
    }

    @Step("Soyisim alanı doldurulur ")
    public LoginPage lastNameDoldur() {
        driver.findElement(By.xpath("//*[@id=\"lastName\"]")).sendKeys(Data.lastName);
        return this;
    }

    @Step("TextBox alanına tıklanır ")
    public LoginPage countryTextBoxClick() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[1]/nz-form-item[1]/nz-form-control/div/div/nz-input-group/forceget-country-dropdown/nz-select")).click();

        return this;
    }

    @Step("Ülke kodu seçilir ")
    public LoginPage countryClick() {
        driver.findElement(By.cssSelector("body > app-root > app-full-layout > sign-up1 > div > div.flex-1.flex.items-center.justify-center.main-content-form > perfect-scrollbar > div > div.ps-content > div > form > div.flex.custom-gap > nz-form-item.ant-form-item.ant-row.mb-0.min-w-100px > nz-form-control > div > div > nz-input-group > forceget-country-dropdown > nz-select > nz-select-top-control > nz-select-item > div")).click();
        return this;
    }

    @Step("Telefon alanı doldurulur ")
    public LoginPage phone() {
        driver.findElement(By.xpath("//*[@id=\"phoneNumber\"]")).sendKeys(Data.phone);
        return this;
    }

    @Step("Şirket alanı doldurulur ")
    public LoginPage company() {
        driver.findElement(By.xpath("//*[@id=\"companyName\"]")).sendKeys(Data.company);
        return this;
    }

    @Step("Email alanı doldurulur ")
    public LoginPage email() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/nz-form-item[3]/nz-form-control/div/div/nz-input-group/input")).sendKeys(Data.email);
        return this;
    }

    @Step("DropDown alanına tıklanır ")
    public LoginPage titleDropDown() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[3]/nz-form-item/nz-form-control/div/div/nz-select/nz-select-top-control/nz-select-search/input")).click();
        return this;
    }

    @Step("DropDown seçilir ")
    public LoginPage titleClick() {
         driver.findElements(By.className("class=\"ant-select-selection-item ng-star-inserted\"")).get(1).click();
        return this;
    }

    @Step("Şifre alanı doldurulur ")
    public LoginPage password() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[4]/nz-form-item/nz-form-control/div/div/nz-input-group/input")).sendKeys(Data.password);
        return this;
    }

    @Step("Şifre görünürlüğü seçilir ")
    public LoginPage sifreMaskeleme() {
        driver.findElement(By.cssSelector("body > app-root > app-full-layout > sign-up1 > div > div.flex-1.flex.items-center.justify-center.main-content-form > perfect-scrollbar > div > div.ps-content > div > form > div:nth-child(7) > nz-form-item > nz-form-control > div > div > nz-input-group > span.ant-input-suffix.ng-star-inserted > i > svg")).click();
        return this;
    }

    @Step("Şifre alanı tekrar doldurulur ")
    public LoginPage confirmPassword() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/sign-up1/div/div[1]/perfect-scrollbar/div/div[1]/div/form/div[5]/nz-form-item/nz-form-control/div/div/nz-input-group/input")).sendKeys(Data.confirmPassword);
        return this;
    }

    @Step("Şifre görünürlüğü seçilir ")
    public LoginPage confirmSifreMaskeleme() {
        driver.findElement(By.cssSelector("body > app-root > app-full-layout > sign-up1 > div > div.flex-1.flex.items-center.justify-center.main-content-form > perfect-scrollbar > div > div.ps-content > div > form > div:nth-child(8) > nz-form-item > nz-form-control > div > div > nz-input-group > span.ant-input-suffix.ng-star-inserted > i")).click();
        return this;
    }

    @Step("CheckBox alanına tıklanır ")
    public LoginPage gizlilikSozlesmesi() {
        driver.findElement(By.className("class=\"checkbox-box\"")).click();
        return this;
    }

    @Step("Sözleşme onaylanır ")
    public LoginPage acceptButton() {
        driver.findElement(By.cssSelector("#cdk-overlay-0 > nz-modal-container > div > div > div.ant-modal-footer.ng-tns-c2116847144-12.ng-star-inserted > div > button")).click();
        return this;
    }

    @Step("Kayıt ol butonuna tıklanır ")
    public LoginPage signUp() {
        driver.findElement(By.className("class=\"ant-btn w-full ant-btn-primary\"")).click();
        return this;
    }
}
