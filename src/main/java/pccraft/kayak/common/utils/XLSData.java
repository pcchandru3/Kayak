package pccraft.kayak.common.utils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.testng.annotations.Test;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pccraft.kayak.test.data.TestData;

public class XLSData {
	

	@Test
	public void testing(){
		readTestData("/Users/cpanag/01WorkingFolder/My-GitHub/Kayak/kayak/src/test/resources/TestDataInput.xls", "TestExecution");
		
	}
	
	
	
	
	public static List<TestData> readTestData(String sFile, String sSheet) {
		
		List<TestData> tData = new ArrayList<TestData>();
		
		
		Workbook workBook = null;
		File file = new File(sFile);
		
		try {
			workBook = Workbook.getWorkbook(file);
		} catch (BiffException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		Sheet sheet = workBook.getSheet(sSheet);
		int rows = sheet.getRows();
		int cols = sheet.getColumns();
		
		for (int row = 1; row < rows; row++) {
			TestData testData = new TestData();
			if(sheet.getCell(1,  row).getContents().equalsIgnoreCase("Yes")){
			testData.TestCaseID = sheet.getCell(0,  row).getContents();
			testData.ExecuteTest = sheet.getCell(1,  row).getContents();
			testData.TestDescription = sheet.getCell(2,  row).getContents();
			testData.flightSearchData.Origin = sheet.getCell(3,  row).getContents();
			testData.flightSearchData.Destination = sheet.getCell(4,  row).getContents();
			testData.flightSearchData.StartDate = sheet.getCell(5,  row).getContents();
			testData.flightSearchData.ReturnDate = sheet.getCell(6,  row).getContents();
			testData.flightSearchData.OriginNearBy = sheet.getCell(7,  row).getContents();
			testData.flightSearchData.DestinationNearBy = sheet.getCell(8,  row).getContents();
			
			tData.add(testData);
			testData = null;
					
			}
			
		}
		
		workBook.close();
		
		
		System.out.println(tData.get(0).TestDescription);
		
		return tData;
		
	}

}
