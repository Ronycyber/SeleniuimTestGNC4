package Renastech.day2;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class c_1Google_Title_Verifacation {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("https://www.google.com/");
        String ExpectedTitle= "Google";
        String ActualTitle= driver.getTitle();

        if (ActualTitle.equals(ExpectedTitle)){
            System.out.println("Google title has passed");

        }else {
            System.out.println("Google title has failed");
        }

    }
}
