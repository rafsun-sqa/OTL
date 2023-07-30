package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Bankaccount {
    WebDriver driver;

    public Bankaccount(WebDriver driver){
        this.driver=driver;
    }
    public void AddBankaccountValidinfo(){
        WebElement hover = driver.findElement(By.xpath("//body/div[@id='root']/section[1]/aside[1]/div[1]/div[1]/ul[1]/li[2]/div[1]/span[1]/*[1]"));

    }
    public void AddBankaccountInvalidinfo(){

    }
    public void searchFilterforvalidinfo(){

    }
    public void searchFilterforinvalidinfo(){

    }
    public void pagination(){

    }
}
