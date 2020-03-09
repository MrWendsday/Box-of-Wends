/*
Please select one of the following options:

- Create a new student
- Enter students’ scores
- Show class average score
- Show subject minimum and maximum scores 

When selecting option # 1:
The application will ask me to enter the studentName 
and the studentEmail. It will then create a text file 
named “studentName.txt” that contains the studentEmail.

When selecting option # 2:
The application will ask me to enter the studentName of 
which I want to enter his/her scores. It will then save 
this data into the student file.

When selecting option # 3:
The application will print the average score of all 
subjects for all students in the console.

When selecting option # 4:
The application will ask me to enter the subjectName and 
will print the minimum and maximum score in that subject 
across all students.
*/

package CivicHall.SBA.Week11.SBA;

import java.io.IOException;
import java.util.Scanner;

public class StudentMenu {

	public static Scanner input = new Scanner(System.in);
	public static void main(String[] args) throws IOException {
		
		CreateStudent cs = new CreateStudent();
		StudentScore ss = new StudentScore();
		ClassAverage ca = new ClassAverage();
		MinMax mm = new MinMax();
		
		menuOptions();
		System.out.println("Choose from the following: ");
		int option = input.nextInt();

	}
	
	private static void menuOptions()
	{
		System.out.println("1. Create a new student.");
		System.out.println("2. Enter student scores.");
		System.out.println("3. Show class average.");
		System.out.println("4. Show subject minimum and maximum scores.");
	}

}
