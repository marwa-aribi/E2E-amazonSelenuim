package E2E;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddToCart extends BaseTest{
    By btbonjour = By.id("nav-link-accountList-nav-line-1");

    By email = By.id("ap_email");
    By btnContinue = By.id("continue");
    By password = By.id("ap_password");
    By btnidentifier = By.id("signInSubmit");
    By btnVenteflash = By.xpath("//*[@id=\"nav-xshop\"]/a[6]");
    By Product = By.xpath("//*[@id=\"grid-main-container\"]/div[3]/div/div[1]/div/div/a/div/div/img");
    By Acheter = By.id("buy-now-button");
    By btnPasserCommande = By.xpath("//*[@id=\"sc-buy-box-ptc-button\"]/span/input");

    @Test
    public void test2Addcart(){
    Click(btbonjour);

    Type(email,"marwa.aribi@polytechnicien.tn");
    Click(btnContinue);
    Type(password,"marwa123");
    Click(btnidentifier);
    Click(btnVenteflash);
    Click(Product);
    Click(Acheter);

    }
    private WebElement find(By locator){

        return driver.findElement(locator);
    }
    private void Click(By locator){

        find(locator).click();
    }
    private  void Type (By locator, String text){

        find(locator).sendKeys(text);
    }
    private  String RandomGenerateEmail(){
        return RandomStringUtils.random(4,true,true)+"@gmail.com";
    }
}
