package Tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SearchTest {

    WebDriver driver;

    @BeforeMethod
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }

    @Test
    public void searchProduct(){

        driver.get("https://www.amazon.com/");
        driver.findElement(By.id("twotabsearchtextbox"));
        driver.findElement(By.id("nav-search-submit-button")).click();

        String title = driver.getTitle();

        Assert.assertTrue("El titulo no contiene la palabra buscada",
                title.toLowerCase().contains("laptop"));

    }
    @AfterMethod
    public void tearDown(){
        driver.quit();
    }


}
