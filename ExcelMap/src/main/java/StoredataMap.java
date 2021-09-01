import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class StoredataMap {

    @org.jetbrains.annotations.NotNull
    public Map<String, Map<String, String>> setMapData() throws IOException {
        String path = "/Users/satya/Downloads/TestExcel.xlsx";
        FileInputStream fis = new FileInputStream(path);
        Workbook workbook = new XSSFWorkbook(fis);

        Sheet sheet = workbook.getSheetAt(0);
        int lastRow = sheet.getLastRowNum();

        Map<String, Map<String, String>> excelFileMap = new HashMap<>();
        Map<String, String> dataMap = new HashMap<>();

        // Looping over entire row
        for (int i = 0; i <= lastRow; i++) {
            Row row = sheet.getRow(i);

            // 1st cell as value
            Cell valueCell = row.getCell(1);

            // 0th cell as key
            Cell keyCell = row.getCell(0);

            String value = valueCell.getStringCellValue().trim();
            String key = keyCell.getStringCellValue().trim();

            // Putting key ad value in dataMap
            dataMap.put(key, value);

            // Putting dataMap to excelFileMap
            excelFileMap.put("Datasheet", dataMap);
        }

        // returning excelFileMap
        return excelFileMap;
    }

    // Method to retrieve value
    public String getMapData(String key) throws IOException{

        Map<String, String> m = setMapData().get("DataSheet");
        String value = m.get(key);

        return value;
    }
}
