package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login {
    WebDriver driver;
    public Login(WebDriver driver){
        this.driver=driver;
    }
    public void validLogininfo() throws InterruptedException {
        WebElement Login_ID;
        Login_ID = driver.findElement(By.id("login_email"));
        Login_ID.sendKeys("qa@sslwireless.com");

        WebElement passWord;
        passWord= driver.findElement(By.id("login_password"));
        passWord.sendKeys("12345678");

        WebElement Submit_button;
        Submit_button=driver.findElement(By.xpath("//*[@id=\"login\"]/div[3]/div/div/div/div/button"));
        Submit_button.click();
        Thread.sleep(3000);

    }
    public void invalidLogininfo(){

    }
}
