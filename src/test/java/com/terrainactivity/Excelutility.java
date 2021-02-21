/*
 * package com.terrainactivity;
 * 
 * import java.io.FileInputStream; import java.io.IOException;
 * 
 * import org.apache.poi.ss.usermodel.Workbook;
 * 
 * import cucumber.annotation.Before; import jxl.read.biff.BiffException; import
 * jxl.write.WritableSheet; import jxl.write.WriteException; import
 * jxl.write.biff.RowsExceededException;
 * 
 * public class Excelutility { public String Testcase; public WritableSheet
 * writablesh; public Workbook workbookcopy;
 * 
 * @BeforeTest public void queryParameterization() throws
 * BiffException,IOException,RowsExceededException,WriteException{
 * FileInputStream testfile = new FileInputStream(""); Workbook wbook =
 * Workbook.getWorkbook(testfile);
 * Sheet sheets=wbook.getSheet("Query_data");
 * int Norows = sheets.getRows();
 * String inputdata[][]=new String[sheets.getRows()][sheets.getColumns()];
 * System.out.println("Number of rows present in TestDta xls file is -"+Norows);
 * 
 * FileOutputStream testoutput=new FileOutputStream("");
 * System.out.println("crating file");
 *to create writable workbook
 * workbookcopy=workbook.creatigWorkbook(testoutput);
 * System.out.println("creating file2");
 * to create writable sheet in writable workbook
 * wrotablesh=workbookcopy.createSheet("Query_data",0);
 * System.out.println("crating file3");
 * 
 * Using for loop write all data to new sheet
 * for(int i=0;i<sheets.getRows();i++)
 * {
 * for(int k=0;k<sheets.getColumns();k++)
 * {
 * inputdata[i][k]=sheets.getCell(k,i).getContents();
 * Lable l=new Lable(k,i,inputdata[i][k]);
 * Lable l2=new Lable(4,0,Results);
 * writable.addCell(l);
 * writable.addCell(l2);
 * 
 * }
 * 
 * }
 * 
 * 
 * 
 * 
 * }
 */