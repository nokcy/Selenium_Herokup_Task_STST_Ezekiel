import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class LoginTest {
    private WebDriver driver;

    public LoginTest() {
    }

    @Test
    public void login() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().window().maximize();
        this.driver.get("https://selenium-blog.herokuapp.com/");
        this.driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")).click();
        Thread.sleep(500L);
        this.driver.findElement(By.id("session_email")).sendKeys(new CharSequence[]{"webahe8498@shanreto.com"});
        Thread.sleep(500L);
        this.driver.findElement(By.id("session_password")).sendKeys(new CharSequence[]{"webahe8498@"});
        Thread.sleep(500L);
        this.driver.findElement(By.name("commit")).click();
        Thread.sleep(500L);
        this.driver.findElement(By.xpath("//*[@id=\"bs-example-navbar-collapse-1\"]/ul/li[1]/a")).click();
        Thread.sleep(50000L);
    }



    @AfterTest
    public void teardown() {
        this.driver.quit();
    }
}