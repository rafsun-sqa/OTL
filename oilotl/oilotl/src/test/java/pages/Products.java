package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.Set;

public class Products {
    WebDriver driver;
    public Products(WebDriver driver){
        this.driver=driver;

    }
    public void selectproductmenu() throws InterruptedException {
        Actions action = new Actions(driver);
        WebElement menu = driver.findElement(By.xpath("//*[@id=\"root\"]/section/aside/div/div/ul/li[2]/div/span[2]"));
        menu.click();
        Thread.sleep(3000);

        // Get the handles of all open windows
        Set<String> windowHandles = driver.getWindowHandles();

        // Switch to the new window
        for (String handle : windowHandles) {
            if (!handle.equals(driver.getWindowHandle())) {
                driver.switchTo().window(handle);
                break;
            }
        }

        // Now you are in the new window. Locate and click the menu list element
        WebElement menuListItem = driver.findElement(By.linkText("Products"));
        menuListItem.click();
        System.out.println("Product menu");


    }

    public void AddproductsValidinfo() {
        WebElement addproduct= driver.findElement(By.xpath("/html/body/div[1]/section/section/main/div[1]/div/div/div[1]/span/div/div/button/a"));
        addproduct.click();
    }
    public void AddproductsInvalidinfo(){


    }
    public void searchFilterforvalidinfo(){

    }
    public void searchFilterforinvalidinfo(){

    }
    public void pagination(){

    }
}
