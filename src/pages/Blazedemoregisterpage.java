package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Blazedemoregisterpage {
	WebDriver driver;
	By Blazedemoname=By.id("name");
	By Blazedemocompany=By.id("company");
	By Blazedemoemail=By.id("email");
	By Blazedemopassword=By.id("password");
	By Blazedemoconfirmpassword=By.id("password-confirm");
	By Blazedemoregister=By.xpath("//*[@id=\"app\"]/div/div/div/div/div[2]/form/div[6]/div/button");
	public Blazedemoregisterpage(WebDriver driver) {
		this.driver=driver;
	}
	public void setvalues(String name,String company,String email,String password,String confirmpassword) {
		driver.findElement(Blazedemoname).sendKeys(name);
		driver.findElement(Blazedemocompany).sendKeys(company);
		driver.findElement(Blazedemoemail).sendKeys(email);
		driver.findElement(Blazedemopassword).sendKeys(password);
		driver.findElement(Blazedemoconfirmpassword).sendKeys(confirmpassword);

}
	public void register() {
		driver.findElement(Blazedemoregister).click();
	}
}


