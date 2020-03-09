/*
 * When selecting option # 2:
 * The application will ask me to enter the studentName of 
 * which I want to enter his/her scores. It will then save 
 * this data into the student file.
 */

package CivicHall.SBA.Week11.SBA;

import java.io.*;
import java.util.HashMap;

public class StudentScore {
	
	public StudentScore() throws IOException {
		String oldFile = "C:\\Users\\CTStudent\\Desktop\\Application Developer Course Files\\Java\\Week 11\\studentName.txt";
		String newFile = "C:\\Users\\CTStudent\\Desktop\\Application Developer Course Files\\Java\\Week 11\\studentName_temp.txt";
		HashMap<String, Integer> scoreHash = new HashMap<String, Integer>();
		FileReader fRead = null;
		BufferedReader bRead = null;
		FileWriter fWrite = null;
		BufferedWriter bWrite = null;
		
		try {
//			fRead = new FileReader(oldFile);
//			bRead = new BufferedReader(fRead); 	equivalent to below		
			
			bRead = new BufferedReader(new FileReader(oldFile));
			bWrite = new BufferedWriter(new FileWriter(newFile));
			
			String line;
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		finally {
			fRead.close();
			bRead.close();
			fWrite.close();
			bWrite.close();
		}
	}

}
