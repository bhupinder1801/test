package jxl;

import java.io.File;
import java.io.IOException;

import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class WriteJXL {

	public static void main(String[] args) throws IOException, RowsExceededException, WriteException {
		
		File f = new File("C:\\Users\\bhupinder.sg\\Desktop\\newtest2.xls");
		
		WritableWorkbook wk = Workbook.createWorkbook(f);
		WritableSheet ws = wk.createSheet("Hustler", 0);
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Label l = new Label(j,i,"Hustler1");
				ws.addCell(l);
				System.out.println("done");
				
			}
		}
		
		wk.write();
		wk.close();
	
	}
}
