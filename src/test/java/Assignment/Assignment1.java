package Assignment;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.getTitle();
        System.out.println("current title is:" +driver.getTitle());
        driver.close();

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().back();
        Thread.sleep(4000);
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com/");
        String pageTitle= driver.getTitle();
        String contain= "smile";
        System.out.println("Second task");
        System.out.println("title contain:" + contain);
        System.out.println("Amazon current title:"+ pageTitle);
    }

}
