
import java.util.ArrayList;

import Ben.tuition;

public class C206_CaseStudy {

	public static void main(String[] args) {
	
		// Afiq
		ArrayList<Students> studentsList = new ArrayList<Students>();
		
		// Ben
		ArrayList<tuition> tuitionList = new ArrayList<tuition>();
		tuitionList.add(new tuition(1000, "English", "Language", "English Language E")()
	}
	// Set header
	public static void setHeader(String header) {
		Helper.line(80, "-");
		System.out.println(header);
		Helper.line(80, "-");
	}
	// Register/Add students
	public static Students inputStudents() {
		String name = Helper.readString("Enter name:");
		String gender = Helper.readString("Enter gender:");
		String mobile = Helper.readString("Enter mobile:");
		String email = Helper.readString("Enter email:");
		String dob = Helper.readString("Enter date of birth:");
		String country = Helper.readString("Enter country of residence:");
		String interest = Helper.readString("Enter interest:");
		
		Students st = new Students(name, gender, mobile, email, dob, country, interest);
		return st;
	}
	public static void addStudent(ArrayList<Students> studentsList, Students st) {
		studentsList.add(st);
	}

	// View students
	public static String retrieveAllStudents(ArrayList<Students> studentsList) {
		String output = "";
		
		for (int i = 0; i < studentsList.size(); i++) {
			output += String.format("%=84s\n", studentsList.get(i).toString());
		}
		return output;
	}
	public static void viewAllStudents(ArrayList<Students> studentsList) {
		C206_CaseStudy.setHeader("STUDENT LIST");	
		String output = String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-20s\n", "NAME", "GENDER", "MOBILE", "EMAIL", "DATE OF BIRTH", "COUNTRY OF RESIDENCE", "INTEREST");
		output += retrieveAllStudents(studentsList);
		System.out.println(output);
	}
	
	// Delete students
	public static void inputDelete(ArrayList<Students> studentsList) {
		String email = Helper.readString("Enter email: ");
		for (int i = 0; i < studentsList.size(); i++) {
		if (studentsList.get(i).getEmail().equals(email)) {
		studentsList.remove(i);
			}
		}
	}
}
	
