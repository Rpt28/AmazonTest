package com.demo.utils;

import org.apache.poi.xssf.usermodel.*;
import java.io.FileInputStream;

public class ExcelUtil {

    public static Object[][] getData(String file, String sheet) throws Exception {

        FileInputStream fis = new FileInputStream(file);
        XSSFWorkbook wb = new XSSFWorkbook(fis);
        XSSFSheet sh = wb.getSheet(sheet);

        int rows = sh.getLastRowNum();
        int cols = sh.getRow(0).getLastCellNum();

        Object[][] data = new Object[rows][cols];

        for(int i=1;i<=rows;i++) {
            for(int j=0;j<cols;j++) {
                data[i-1][j] = sh.getRow(i).getCell(j).toString();
            }
        }

        wb.close();
        return data;
    }
}
