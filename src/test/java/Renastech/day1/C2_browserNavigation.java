package Renastech.day1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class C2_browserNavigation {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().fullscreen();


        driver.get("https://www.facebook.com/");
        Thread.sleep(5000);
        driver.navigate().to("https://www.apple.com/");
        Thread.sleep(2000);
        driver.navigate().back();
        Thread.sleep(200);
        driver.navigate().forward();
        //driver.quit();
    }
}
