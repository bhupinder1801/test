package jxl;

import java.io.File;
import java.io.IOException;

import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class jxlIF {
	
	public static void main(String[] args) throws IOException, RowsExceededException, WriteException, BiffException {
		
		File f = new File("C:\\Users\\bhupinder.sg\\Desktop\\If.xls");
		
		Workbook wkread = Workbook.getWorkbook(f);
		Sheet wsread= wkread.getSheet(0);
		
		File f1 = new File("C:\\Users\\bhupinder.sg\\Desktop\\If.xls");
		
		WritableWorkbook wk = Workbook.createWorkbook(f1);
		WritableSheet ws = wk.createSheet("FirstSheet", 0);
		
		
		
		int r= wsread.getRows();
		int c= wsread.getColumns();
		
		
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1 = ws.getCell(0, i);
				Cell c2 = ws.getCell(1, i);
				String s1 = c1.getContents();
				String s2 = c2.getContents();
			if(s1==s2)
			{ 
				change
				
				Label l = new Label(j,i,"Pass");
				ws.addCell(l);
			}
			}
		}
	wk.write();
	wk.close();
		
	}

}
