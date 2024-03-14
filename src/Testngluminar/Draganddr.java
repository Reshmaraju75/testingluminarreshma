package Testngluminar;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.openqa.selenium.interactions.Actions;
    import org.testng.annotations.BeforeMethod;
    import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test; 
	public class Draganddr {
		WebDriver driver;
		@BeforeTest
		public void setup() {
	
	driver = new ChromeDriver();
		}
	@BeforeMethod
	public void start()  {

		 driver.get("https://demoqa.com/droppable");
		 driver.manage().window().maximize();
	}
@Test
public void set() {

	Actions act = new Actions(driver);
	WebElement drag= driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
	WebElement to = driver.findElement(By.xpath("//*[@id=\"droppable\"]")); 
	act.dragAndDrop(drag, to).perform();
	String text = to.getText();
	if(text.equals("Dropped!")) {
	System.out.println("PASS");
	}else {
	System.out.println("FAIL");
	}
	driver.close();
	}

}
