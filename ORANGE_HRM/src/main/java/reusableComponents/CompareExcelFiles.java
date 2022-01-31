package reusableComponents;
 
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.testng.Assert;
 
public class CompareExcelFiles {
 
 public void verifyDataInExcelBook(Workbook workbook1, Workbook workbook2) 
 {
		System.out.println("Verifying if both work books have same data.............");
		// Since we have already verified that both work books have same number of sheets so iteration can be done against any workbook sheet count
		int sheetCounts = workbook1.getNumberOfSheets();
		// So we will iterate through sheet by sheet
		for (int i = 0; i < sheetCounts; i++) {
			// Get sheet at same index of both work books
			Sheet s1 = workbook1.getSheetAt(i);
			Sheet s2 = workbook2.getSheetAt(i);
			System.out.println("*********** Sheet Name : "+s1.getSheetName()+"*************");
			// Iterating through each row
			int rowCounts = s1.getPhysicalNumberOfRows();
			for (int j = 0; j < rowCounts; j++) {
				// Iterating through each cell
				int cellCounts = s1.getRow(j).getPhysicalNumberOfCells();
				for (int k = 0; k < cellCounts; k++) {
					// Getting individual cell
					Cell c1 = s1.getRow(j).getCell(k);
					Cell c2 = s2.getRow(j).getCell(k);
					// Since cell have types and need o use different methods
					if (c1.getCellType().equals(c2.getCellType())) {
						if (c1.getCellType() == CellType.STRING) {
							String v1 = c1.getStringCellValue();
							String v2 = c2.getStringCellValue();
							Assert.assertEquals(v1, v2, "Cell values are different.....");
							System.out.println("Its matched : "+ v1 + " === "+ v2);
						}
						if (c1.getCellType() == CellType.NUMERIC) {
							// If cell type is numeric, we need to check if data is of Date type
							if (DateUtil.isCellDateFormatted(c1) | DateUtil.isCellDateFormatted(c2)) {
								// Need to use DataFormatter to get data in given style otherwise it will come as time stamp
								DataFormatter df = new DataFormatter();
								String v1 = df.formatCellValue(c1);
								String v2 = df.formatCellValue(c2);
								Assert.assertEquals(v1, v2, "Cell values are different.....");
								System.out.println("Its matched : "+ v1 + " === "+ v2);
							} else {
								double v1 = c1.getNumericCellValue();
								double v2 = c2.getNumericCellValue();
								Assert.assertEquals(v1, v2, "Cell values are different.....");
								System.out.println("Its matched : "+ v1 + " === "+ v2);
							}
						}
						if (c1.getCellType() == CellType.BOOLEAN) {
							boolean v1 = c1.getBooleanCellValue();
							boolean v2 = c2.getBooleanCellValue();
							Assert.assertEquals(v1, v2, "Cell values are different.....");
							System.out.println("Its matched : "+ v1 + " === "+ v2);
						}
					} else
					{
						// If cell types are not same, exit comparison  
						Assert.fail("Non matching cell type.");
					}
				}
			}
		}
		System.out.println("Both work sheet have same data.");
	}
}
