package Pages;

import Base.BaseLibrary;
import Base.Data;
import io.qameta.allure.Step;
import org.openqa.selenium.By;

public class HomePage extends BaseLibrary {
    @Step("Email alanı doldurulur ")
    public HomePage email() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/login1/div/div[1]/div/form/nz-form-item[1]/nz-form-control/div/div/nz-input-group/input")).sendKeys(Data.email);
        return this;
    }

    @Step("Şifre alanı doldurulur ")
    public HomePage password() {
        driver.findElement(By.xpath("/html/body/app-root/app-full-layout/login1/div/div[1]/div/form/nz-form-item[2]/nz-form-control/div/div/nz-input-group/input")).sendKeys(password);
    return this;
    }

    @Step("Giriş yap butonuna tıklanır ")
    public HomePage signIn() {
        driver.findElement(By.cssSelector("body > app-root > app-full-layout > login1 > div > div.flex-1.flex.items-center.justify-center.main-content-form > div > form > nz-form-item:nth-child(3) > nz-form-control > div > div > div > button")).click();
        return this;
    }
}
