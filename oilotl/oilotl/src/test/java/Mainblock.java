import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.Login;
import pages.Products;

import java.io.IOException;

public class Mainblock {
    public static void main(String[] args) throws IOException, InterruptedException {
        // TODO Auto-generated method stub
        // ChromeOptions options = new ChromeOptions();
        // options.addArguments("--remote-allow-origins=*");
        //ChromeDriver driver = new ChromeDriver(options);

        // C:\Users\amimul.islam\IdeaProjects\driver
        //System.setProperty("webdriver.chrome.driver", "C:\\webdriver\\chromedriver.exe");
        System.setProperty("Webdriver.chrome.driver", ".C:\\Users\\hashem.rafsun\\Downloads\\chrome-win64");
        WebDriver driver = new ChromeDriver();

        /*
        WebDriver driver=new ChromeDriver();
        open site on browser
        */
        driver.get("https://uatotlerp.sslwireless.com/auth/login");
        // driver.get("http://crm-test.sslwireless.com/");
        driver.manage().window().maximize();
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);

        Login objlogin=new Login(driver);
        objlogin.validLogininfo();

        Products objproduct=new Products(driver);
        objproduct.selectproductmenu();
        objproduct.AddproductsValidinfo();

        /*Bankaccount objBankaccount=new Bankaccount(driver);
        objBankaccount.AddBankaccountValidinfo();
        *//*Bankaccount objBankaccount = new Bankaccount(driver);
        objBankaccount.AddBankaccount();*//*
*/

    }
}
