
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Sample {
public static WebDriver driver;
public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver", "C:\\Users\\HP\\eclipse-workspace\\Sample\\driver\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://paytm.com/");
driver.findElement(By.xpath("//a[text()='Paytm For Business']")).click();
Thread.sleep(2000);
WebElement finance = driver.findElement(By.xpath("//a[text()='Financial Service']"));
Actions ac=new Actions(driver);
ac.click(finance).build().perform();
List<WebElement> ele = driver.findElements(By.xpath("//ul[@class=\"_1VXMb\"]//li"));
for (WebElement wb : ele) {
	System.out.println(wb.getText());
}
driver.quit();
}
}
