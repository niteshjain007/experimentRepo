package helperUtilities;

import java.io.FileReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import com.opencsv.CSVReader;
import com.opencsv.CSVReaderBuilder;

public class Utility {
	
	public static void main(String ss[])
	{
		readDataLineByLine("Book1.csv");
		System.out.println("-------------------");
		readAllDataAtOnce("Book1.csv");
	}
	public String getDate() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy_MMM_dd_HH_mm_ss");
		LocalDateTime now = LocalDateTime.now();
		return dtf.format(now).toString();
	}


	public int getRandomNumnber(int digit)
	{
		int temp=0;
		switch(digit)
		{
		case 1: temp=10; break;
		case 2: temp=100;break;
		case 3: temp=1000;break;
		case 4: temp=10000;break;
		case 5: temp=100000;break;
		default: System.out.println("you can get random number 1 to 5 digits only ...");
		}
		int x=0;
		double y = Math.random();
		x= (int)(y*temp);
		return x;
	}
	
	// Java code to illustrate reading a
	// CSV file line by line
	public static void readDataLineByLine(String file)
	{
	  
	    try {
	  
	        // Create an object of filereader
	        // class with CSV file as a parameter.
	        FileReader filereader = new FileReader(file);
	  
	        // create csvReader object passing
	        // file reader as a parameter
	        CSVReader csvReader = new CSVReader(filereader);
	        String[] nextRecord;
	  
	        // we are going to read data line by line
	        while ((nextRecord = csvReader.readNext()) != null) {
	            for (String cell : nextRecord) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println();
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	
	// Java code to illustrate reading a
	// all data at once
	public static void readAllDataAtOnce(String file)
	{
	    try {
	        // Create an object of file reader
	        // class with CSV file as a parameter.
	        FileReader filereader = new FileReader(file);
	        int start=4;
	        int end=5;
	        // create csvReader object and skip first Line
	        CSVReader csvReader = new CSVReaderBuilder(filereader)
	                                  .withSkipLines(start-1)
	                                  .build();
	        List<String[]> allData = csvReader.readAll();
	  
	        // print Data
	        for (String[] row : allData) {
	            for (String cell : row) {
	                System.out.print(cell + "\t");
	            }
	            System.out.println(); start++;
	            if(end==start) break;
	        }
	    }
	    catch (Exception e) {
	        e.printStackTrace();
	    }
	}
}
