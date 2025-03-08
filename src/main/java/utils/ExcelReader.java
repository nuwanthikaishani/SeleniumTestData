package utils;

import org.apache.poi.ss.usermodel.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelReader {

    public static String getData(String sheetName, int rowNumber, int columnNumber) throws IOException {
        File file = new File("C:\\Users\\hp\\IdeaProjects\\SeleniumTestData\\src\\main\\resources\\TestData.xlsx");
        FileInputStream fis = new FileInputStream(file);

        Workbook workbook = WorkbookFactory.create(fis);
        Sheet sheet = workbook.getSheet(sheetName);

        Row row = sheet.getRow(rowNumber);
        Cell cell = row.getCell(columnNumber);

        String cellValue = "";

//        if (cell.getCellType() == CellType.STRING) {
//            cellValue = cell.getStringCellValue();
//        } else if (cell.getCellType() == CellType.NUMERIC) {
//            cellValue = String.valueOf((int) cell.getNumericCellValue());
//        }

        workbook.close();
        fis.close();

return cellValue;
    }
}
