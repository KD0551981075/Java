package fileModification;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadWriteExcel {

    private final String path  = "C:\\coding\\workspace\\JavaFundamentals\\javaFundamentals\\javaFundamentals\\src\\main\\java\\fileModification\\dataBase.xlsx";
    public static void main(String args[]){




    }

    String readExcelfile(String Sheetname) throws IOException {

        FileInputStream fis = new FileInputStream("path");
        Workbook wb  = WorkbookFactory.create(fis);
        Sheet sheet = wb.getSheet(Sheetname);



        return "";

    }

}
