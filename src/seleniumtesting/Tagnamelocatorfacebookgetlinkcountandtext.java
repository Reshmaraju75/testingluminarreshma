package seleniumtesting;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagnamelocatorfacebookgetlinkcountandtext {
	
	ChromeDriver driver;
	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		}
		@Test
		public void facebook() {
			
			 List<WebElement> li = driver.findElements(By.tagName("a"));
			 System.out.println(li.size());
			
			for(WebElement s:li) {
				String link=s.getAttribute("href");
				String text=s.getText();
				System.out.println(link+"----"+text);
			}
			
			
			
		}
	}

