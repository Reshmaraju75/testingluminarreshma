package testpkg;

import org.testng.annotations.Test;

import basepkg.Baseclass;
import pagepkg.Fbpagepomdd;
import utilities.Excelutil;

public class Fbtestpomdd extends Baseclass {
	@Test
	public void verifyLoginWithvalidcred() {
		 Fbpagepomdd ob=new  Fbpagepomdd(driver);
		 
		 //reading data from excel files by the specified path
		 
		 String x1="E:\\Book1.xlsx";
		 String Sheet="Sheet1";
		 int rowCount=Excelutil.getRowCount(x1,Sheet);
		 for(int i=1;i<rowCount;i++) {
			 String username=Excelutil.getCellValue(x1,Sheet,i,0);
			 System.out.println("username is---"+username);
			 String password=Excelutil.getCellValue(x1,Sheet,i,1);
			 System.out.println("password is---"+password);
			 ob.setvalues(username, password);
			 ob.login();
		 }
		 
	}

}
