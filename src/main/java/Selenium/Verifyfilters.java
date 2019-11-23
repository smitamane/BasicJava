package Selenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//To verify if open filters is same as per serach criteria
public class Verifyfilters {

    public static void main(String []args)
    {
        System.setProperty("webdriver.chrome.driver", "E:\\Driver\\version77\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://seleniumbyneeds.github.io/IDeaS_Test/");
        Select myselect =new Select(driver.findElement(By.id("selDetails")));
        WebDriverWait wait = new WebDriverWait(driver,10);
        wait.until(ExpectedConditions.numberOfElementsToBeLessThan(By.xpath("//select[@id='selDetails']/option"),0));
        myselect.selectByIndex(2);
        wait.until(ExpectedConditions.elementToBeClickable(By.id("selDetails")));
        //myselect.selectByIndex(0);


       // myselect.selectByVisibleText("department");
       // driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
        //tr/td[text()='Administration']/../td[text()='Americas']/../td[6][text()='5' or text()='9']



//tr/td[text()='Administration']/../td[text()='Americas']/../td[text()='Europe']/../td[text()='band 4']




    }
}
