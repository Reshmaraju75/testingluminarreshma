package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class Blazeddemolginpage {
	WebDriver driver;
	By Blazedemoemail=By.id("email");
	By Blazedemopassword=By.id("password");
	By Blazedemoremember=By.name("remember");
	By Blazedemologin=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[4]/div/button");
	public Blazeddemolginpage(WebDriver driver) {
		this.driver=driver;
		
	}
	public void setvalues(String email,String password) {
		driver.findElement(Blazedemoemail).sendKeys("reshmaraju650@gmail.com");
		driver.findElement(Blazedemopassword).sendKeys("reshmart@123");
	
	}
	public void login() {
		driver.findElement(Blazedemoremember).click();
		driver.findElement(Blazedemologin).click();
	}

}
