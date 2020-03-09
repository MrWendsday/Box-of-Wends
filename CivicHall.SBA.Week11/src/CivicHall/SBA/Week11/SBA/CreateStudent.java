/*
 * When selecting option # 1:
 * The application will ask me to enter the studentName 
 * and the studentEmail. It will then create a text file 
 * named “studentName.txt” that contains the studentEmail.
 */

package CivicHall.SBA.Week11.SBA;

import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;

public class CreateStudent 
{
	public CreateStudent() throws IOException {
		File file =	null; 		
		FileWriter fWrite = null;
		BufferedWriter bWrite = null;
		
		try {
			file = new File("C:\\Users\\CTStudent\\Desktop\\Application Developer Course Files\\Java\\Week 11\\studentName.txt"); 
			fWrite = new FileWriter(file);
			bWrite = new BufferedWriter(fWrite);
			
			if(file.createNewFile())
			{
				System.out.println("File is created with name: " + file.getName());
				fWrite.write("Student Name | Student Email");
				fWrite.close();
			} else 
				System.err.println("File is already exists.");
			
		} 
		catch (Exception e) {
			e.printStackTrace();		
			}
		
		finally {
			fWrite.close();
			bWrite.close();
		}
	}
}
