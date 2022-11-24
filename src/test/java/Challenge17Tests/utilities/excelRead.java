package Challenge17Tests.utilities;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class excelRead {

    String projectPath = System.getProperty("user.dir");
    String excelPath = "/src/main/java/Challenge15Main/data/DataDrivenChallenge.xlsx";
    String sheetName = "Sheet1";

    @DataProvider(name = "invloginData")
    public Object[][] excelReader() throws IOException
    {
        File excel = new File(projectPath+excelPath);
        FileInputStream fis = new FileInputStream(excel);
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheet(sheetName);

        int rowCount = sheet.getPhysicalNumberOfRows();
        int colCount = sheet.getRow(0).getLastCellNum();

        String[][] data = new String[rowCount-1][colCount];
        for (int i = 0; i < rowCount-1; i++)
        {
            for (int j = 0; j < colCount; j++)
            {
                DataFormatter df = new DataFormatter();
                data[i][j] = df.formatCellValue(sheet.getRow(i+1).getCell(j));
                System.out.println(data[i][j]);
            }
        }
        workbook.close();
        fis.close();
        return data;
    }

}
