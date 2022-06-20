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

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

        try {
            driver.get("https://store.steampowered.com/");
            Thread.sleep(3000);

        Actions actions = new Actions(driver);
        WebElement categories = driver.findElement(By.xpath("//a[text()='Категории']"));
        actions.moveToElement(categories).build().perform();
        Thread.sleep(4000);
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
        Thread.sleep(4000);
        List<WebElement> games = driver.findElements(By.xpath("//div[@id='search_resultsRows']//a//div"));
        actions.moveToElement(games.get(0)).click().build().perform();
        WebElement price = driver.findElement(By.xpath("//div[@class='game_purchase_price price']"));
        System.out.println(price.getText());
    }
        catch (InterruptedException e){
        e.printStackTrace();
    }finally {
        driver.quit();
    }
}
}
