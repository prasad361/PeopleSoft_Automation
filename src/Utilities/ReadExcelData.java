package Utilities;

public class ReadExcelData
{
	
	public static void main() throws Exception
	{
		// TODO Auto-generated constructor stub
		ExcelDataConfig EDC = new ExcelDataConfig("C://Users//cpolukonda//OneDrive - Cox Enterprises, Inc//Latest//2018//Automation//Selenium//Eclipse-Workspace//Fusion_Automation//bin//TestData//MCB_TestData.xlsx");
		String Pwd = EDC.GetData("MCB_TC_01", "Pwd");
		System.out.println("The password is " + Pwd);
	}	
	
}
