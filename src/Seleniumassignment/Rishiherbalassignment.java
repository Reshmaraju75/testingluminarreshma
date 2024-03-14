package Seleniumassignment;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeTest;


public class Rishiherbalassignment {
	ChromeDriver driver;
	@BeforeTest
	public void setup() {
		 driver=new ChromeDriver();
		 driver.get("https://rishiherbalindia.linker.store");
		 driver.manage().window().maximize();
		
	}	@Test
	public void herbalindiaregister() throws Exception
	{
	    driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/a/span")).click();
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[1]/a")).click();
		Thread.sleep(3000);
	
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[1]/input")).sendKeys("reshmaraju650@gmail.com");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/form/div[2]/input")).sendKeys("Reshma123");
	
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/div[3]/label/input")).click();
		driver.findElement(By.xpath("//*[@id=\"ls-signup-overlay-v1\"]/div/div/div[2]/form/button")).click();
	    Thread.sleep(100);
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[1]/ul/li[2]/a"));
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[1]/input")).sendKeys("reshmaraju650@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"cont-login-with-email\"]/form/div[2]/input")).sendKeys("Reshma123");
		Thread.sleep(100);
	
	}


	@Test
	public void search() throws Exception {
		driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Herbal agro growth booster",Keys.ENTER);
	    Thread.sleep(1000);
		
		driver.findElement(By.xpath("//*[@id=\"searchDDWrp\"]/ul/div[4]/div/div/li[1]/div/div[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"prod_cont\"]/div/div[4]/button[1]/span")).click();
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button/span")).click();
		
		
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[4]/a"));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/a/img"));
		driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div[1]/div/div/div[1]/div/div[2]/div[2]/ul/li[1]/button"));
		Thread.sleep(2000);
	}
	
	@Test
	public void links() {
		
				JavascriptExecutor js=(JavascriptExecutor)driver;
	    driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[2]/div/ul/li[2]/a")).click();
				js.executeScript("window.scrollBy(0,2000)", " ");
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[2]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"menu\"]/ul/li[3]/a")).click();
		        js.executeScript("window.scrollBy(0,1500)", " ");
		
	}
	
	@Test
	public void takescreenshot() throws Exception {
		
		WebElement scrn=driver.findElement(By.xpath("/html/body/div/footer/div[1]/div/div[2]/div[4]/div/ul/li[1]/a"));
		File src=scrn.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("./screen//screen.png"));
	}
	@Test
 public void responsecode() throws Exception {
		String url = "https://rishiherbalindia.linker.store/" ;
				
		driver.get(url );
		URL obj=new URL(url);
		HttpURLConnection con=(HttpURLConnection)obj.openConnection();
		con.connect();
		if( con.getResponseCode()==200) {
			System.out.println("it is valid");
		}
			
			else
			{
				System.out.println("invalid");
			}
		}
		
	}
	

