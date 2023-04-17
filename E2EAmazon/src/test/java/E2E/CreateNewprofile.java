package E2E;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class CreateNewprofile extends BaseTest{
By btbonjour = By.xpath("//*[@id=\"nav-link-accountList\"]");
By btnCreateAcc =By.id("createAccountSubmit");
By name = By.id("ap_customer_name");
By email = By.id("ap_email");
By password = By.id("ap_password");
By chckpassword = By.id("ap_password_check");
By btncontinue =By.id("continue");
@Test
public void  TestCreate(){
    Click(btbonjour);
    Click(btnCreateAcc);
    Type(name,"baya");
    Type(email,"marwa.aribi@polytechnicien.tn");
    Type(password,"marwa123");
    Type(chckpassword,"marwa123");
    Click(btncontinue);
    Actions act =new Actions(driver);
    act.moveToElement(find(btbonjour)).perform();
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
