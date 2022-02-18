package Renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazontitle_verication {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        driver.navigate().to("https://www.amazon.com/");
        String containTitle= "Smile";
        String actualtitle= driver.getTitle();

        if( actualtitle.equals(containTitle)){
            System.out.println("amazon verificaton title is correct");

        }else{
            System.out.println(" verication not passed");
            System.out.println("actual title:"+actualtitle);
        }

    }
}
