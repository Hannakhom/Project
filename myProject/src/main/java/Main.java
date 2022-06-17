import com.beust.ah.A;
import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://store.steampowered.com/");

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        Actions actions = new Actions(driver);
        WebElement categories = driver.findElement(By.xpath("//a[text()='Категории']"));
        actions.moveToElement(categories).build().perform();
        WebElement action = driver.findElement(By.xpath("//div[@class='popup_menu_subheader popup_genre_expand_header responsive_hidden']//a[@class='popup_menu_item' and contains(text(),'Экшен')]"));
        actions.moveToElement(action).click().build().perform();
        WebElement newReleases = driver.findElement(By.xpath("//div[contains(text(),'Популярные новинки')]"));
        actions.moveToElement(newReleases).click().build().perform();
        WebElement buttonAllNewGames = driver.findElement(By.xpath("//span[contains(text(),'Все новинки')]"));
        actions.moveToElement(buttonAllNewGames).click().build().perform();
        WebElement buttonSortBy = driver.findElement(By.xpath("//a[@id='sort_by_trigger']"));
        actions.moveToElement(buttonSortBy).click().build().perform();
        WebElement sortByPrice = driver.findElement(By.xpath("//a[@id='Price_DESC']"));
        actions.moveToElement(sortByPrice).click().build().perform();

    }


}
