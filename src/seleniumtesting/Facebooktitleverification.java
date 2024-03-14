package seleniumtesting;

import org.openqa.selenium.chrome.ChromeDriver;

public class Facebooktitleverification {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		 String title=	driver.getTitle();
		    System.out.println(title);
		    String expectedtitle="Create my account";
		    if(title.equals(expectedtitle));
		    {
		    	System.out.println("pass");
		    }
	    }
	   
	    
	}

