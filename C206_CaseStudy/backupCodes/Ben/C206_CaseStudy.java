package Ben;

import java.util.ArrayList;

import Ben.tuition;

public class C206_CaseStudy {

	public static void main(String[] args) {
	
		// Afiq
		ArrayList<Students> studentsList = new ArrayList<Students>();
		
		// Ben
		ArrayList<tuition> tuitionList = new ArrayList<tuition>();
		tuitionList.add(new tuition(1000, "English", "Language", 
				"Elementary", 120, "None", "Mr Johnathan Tan"));
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
		System.out.println("STUDENT LIST");
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
	// BEN
	// 1 - Add tuition (register)
	public static tuition inputTuition() {
	
		int tuitionCode = Helper.readInt("Enter class code: ");
		String tuitionTitle = Helper.readString("Enter class title: ");
		String subGrpName = Helper.readString("Enter the subject group name: ");
		String tuitionDescription = Helper.readString("Enter the tuition description: ");
		int tuitionDuration = Helper.readInt("Enter the class duration: ");
		String tuitionPreReq = Helper.readString("Enter the class pre-requisite: ");
		String teacherInfo = Helper.readString("Enter the teacher's information");
		
		tuition newTuition = new tuition(tuitionCode, tuitionTitle, subGrpName, 
				tuitionDescription, tuitionDuration, tuitionPreReq, teacherInfo);
		return newTuition;
	}
	public static void addTuition(ArrayList<tuition> tuitionList, tuition newTuition) {
		tuitionList.add(newTuition);
	}
	
	// 2 - View tuition
	public static String retrieveAllTuition(ArrayList<tuition> tuitionList) {
		String output = "";
		for(int i=0; i<tuitionList.size(); i++) {
			output += String.format("%-180s", tuitionList.get(i).toString());
		}
		return output;
	}
	public static void viewAllTuition(ArrayList<tuition> tuitionList) {
		C206_CaseStudy.setHeader("TUITION LIST");
		String output=String.format("%-10d %-30s %-20s %-50s %-5s minutes %-20s $-30s",
				"CODE", "TITLE", "SUBJECT GROUP", "DESCRIPTION", "DURATION", "PRE-REQUISITES",
				"TEACHER INFO");
		output+=retrieveAllTuition(tuitionList);
		System.out.println(output);
	}
	
	// Delete
	public static void deleteTuition()
		
}
	
	
