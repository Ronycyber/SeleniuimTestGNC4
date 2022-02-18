package Renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
    public static void main(String[] args) throws InterruptedException {

        //TASK: Google search
//1- Open a chrome browser
//2- Go to: https://google.com
//3- Write "orange" in search box
//4- Click google search button
//5- Verify title:
//Expected: Title should start with "orange" word
//6-navigate back
//7-write banana in search box
//8-verify title contains banana.


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.google.com/");

        driver.manage().window().maximize();
        WebElement searchbox= driver.findElement(By.name("q"));
        searchbox.sendKeys("orange");
        Thread.sleep(3000);
        //driver.navigate().back();

        driver.findElement(By.name("btnK")).click();

        String ExpectedTitle= "0range";
        String actualtitle= driver.getTitle();
        if (actualtitle.equals(actualtitle)){
            System.out.println("test passed");

        }else{
            System.out.println("test failed");
            System.out.println("actual title:"+ actualtitle);
        }

        Thread.sleep(3000);
        driver.navigate().back();
        Thread.sleep(3000);
         driver.findElement(By.name("q")).sendKeys("banana"+ Keys.ENTER);


    }
}
