package testpkg;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import basepkg.Baeseclass;
import pagepkg.Fbpage;

public class Fbtest extends Baeseclass {
	
	@Test
	public void verifyLoginWithValidCred()throws Exception{
		Fbpage p1=new Fbpage(driver);
		String x1="F://Data.xlsx";
				String Sheet="Sheet1";
		//int rowcount=Excelutil.getRowCount(x1,Sheet)
				//for(int i=1;i<=rowcount;i++) {
					
				//	String  UseName=Excelutil.getCellValue(x1,Sheet,i,0);
				//	System.out.println("username----"+username);
				//	String Pwd=Excelutil.getCellValue(x1,Sheet,i,1);.0
					
					
					
					
					
					
					
					
				//	System.out.println("password----"+pwd);
					//p1.setvalues(UseName, Pwd);
					p1.login();
					
				}
	//}
	
public static String getCellValue(String x1,String Sheet,int r,int c) {
	try
	{
		File f=new File(x1);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		XSSFCell cell=(XSSFCell)wb.getSheet(Sheet).getRow(r).getCell(c);
		if(cell.getCellType()==CellType.STRING) {
			return cell.getStringCellValue();
		}
		else
		{
			return cell.getRawValue();
		}
	}
	catch (Exception e) {
		return "";
	}
}
public static int getRowCount(String x1,String Sheet) {
	try {
		File f=new File(x1);
		FileInputStream fi=new FileInputStream(f);
		XSSFWorkbook wb=new XSSFWorkbook(fi);
		return wb.getSheet(Sheet).getLastRowNum();
	}
	catch(Exception e)
	{
		return 0;
	}
}
}
