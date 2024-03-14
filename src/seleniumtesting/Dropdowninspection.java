package seleniumtesting;


import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowninspection {
	
	ChromeDriver driver;

	@Before
	public void start() {
		driver=new ChromeDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_detailshttps://register.rediff.com/register/register.php?FormName=user_detailshttps://register.rediff.com/register/register.php?FormName=user_details");
		}
	
		
		@Test
		public void begin() {
WebElement	DropDown=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[1]"));

//select class is used to select and deselect values in dropdwn
			Select obj=new Select(DropDown);
			obj.selectByValue("02");
WebElement Month=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[2]"));
            Select M=new Select(Month);
            M.selectByVisibleText("FEB");
WebElement Year=driver.findElement(By.xpath("//*[@id=\"tblcrtac\"]/tbody/tr[22]/td[3]/select[3]"));
            Select Y=new Select(Year);
            Y.selectByIndex(3);
            
            //TO FIND THE COUNT IN THE DROPDOWN OPTIONS
            
         List<WebElement> li= obj.getOptions();
         System.out.println(li.size());
			
		}
	}


