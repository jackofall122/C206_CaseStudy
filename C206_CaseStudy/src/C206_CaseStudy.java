
import java.util.ArrayList;

import Andrew.C206_CaseStudy;
import Andrew.Helper;
import Andrew.registration;
import Ben.tuition;

public class C206_CaseStudy {

	private static final int OPTION_STUDENTS = 1;
	private static final int OPTION_REGISTRATIONS = 2;
	private static final int OPTION_TIMETABLE = 3;
	private static final int OPTION_TUITION = 4;
	private static final int OPTION_QUIT = 5;
	public static void main(String[] args) {
	
		// Afiq
		ArrayList<Students> studentsList = new ArrayList<Students>();
		studentsList.add(new Students("Afiq", "Male", "9849593", "ert@gmail.com", "19 July 2020", "Singapore", "Math"));
		// Ben
		ArrayList<tuition> tuitionList = new ArrayList<tuition>();
		tuitionList.add(new tuition(1000, "English", "Language", "Advanced",120, 
				"Elementary English", "Mr Lee"));
		
		// Andrew
		ArrayList<registration> rList = new ArrayList<registration>();

		// Yang
		int option = 0;

		while (option != OPTION_QUIT) {

			C206_CaseStudy.menu();
			option = Helper.readInt("Enter an option > ");

			if (option == OPTION_STUDENTS) {
				StudentList();
				int type = Helper.readInt("Enter an option > ");
				
				if (type == 1) {
					Students st = inputStudents();
					C206_CaseStudy.addStudent(studentsList, st);
					System.out.println("Student added");
				}
				else if (type == 2) {
					C206_CaseStudy.viewAllStudents(studentsList);
				}
				else if (type == 3) {
					C206_CaseStudy.inputDelete(studentsList);
					System.out.println("Student deleted");
				}
				else {
					System.out.println("Invalid option");
				}
			}else if (option == OPTION_REGISTRATIONS) {
				RegistrationList();
				int type = Helper.readInt("Enter an option > ");
				
				if (type == 1) {
					//Add
					C206_CaseStudy.addRegistrations(rList, createRegistration());
				}
				else if (type == 2) {
					//View
					C206_CaseStudy.viewAllRegistrations(rList);
				}
				else if (type == 3) {
					//Delete
					C206_CaseStudy.deleteRegistrations(rList);
				}
				else {
					//
					System.out.println("Invalid option");
				}
			}else if (option == OPTION_TIMETABLE) {
				TimeTableList();
				int type = Helper.readInt("Enter an option > ");
				
				if (type == 1) {
					//Add
				}
				else if (type == 2) {
					//View
				}
				else if (type == 3) {
					//Delete
				}
				else {
					//
				}
			}else if (option == OPTION_TUITION) {
				TuitionList();
				int type = Helper.readInt("Enter an option > ");
				
				if (type == 1) {
					//Add
				}
				else if (type == 2) {
					//View
				}
				else if (type == 3) {
					//Delete
				}
				else {
					//
				}
			}else if (option == OPTION_QUIT) {
				System.out.println("Bye!");
			} else {
				System.out.println("Invalid option");
			}
		}
	}

	public static void StudentList() {
		C206_CaseStudy.setHeader("STUDENTS");
		System.out.println("1. Add Students");
		System.out.println("2. View Students");
		System.out.println("3. Delete Students");
	}
	
	public static void RegistrationList() {
		C206_CaseStudy.setHeader("REGISTRATION");
		System.out.println("1. Add registration");
		System.out.println("2. View registration");
		System.out.println("3. Delete registration");
	}
	
	public static void TimeTableList() {
		C206_CaseStudy.setHeader("TIMETABLE");
		System.out.println("1. Add timetable");
		System.out.println("2. View timetable");
		System.out.println("3. Delete timetable");
	}
	
	public static void TuitionList() {
		C206_CaseStudy.setHeader("TUITION");
		System.out.println("1. Add tuition");
		System.out.println("2. View tuition");
		System.out.println("3. Delete tuition");
	}

	public static void menu() {
		C206_CaseStudy.setHeader("Tuition Management System");
		System.out.println("1. STUDENTS");
		System.out.println("2. REGISTRATION");
		System.out.println("3. TIMETABLE");
		System.out.println("4. TUITION");
		System.out.println("5. Quit");
		Helper.line(80, "-");

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
			output += String.format("%-84s\n", studentsList.get(i).toString());
		}
		return output;
	}
	public static void viewAllStudents(ArrayList<Students> studentsList) {
		C206_CaseStudy.setHeader("STUDENT LIST");	
		String output = String.format("%-20s %-10s %-10s %-20s %-20s %-20s %-20s\n", "NAME", "GENDER", "MOBILE", "EMAIL", "DATE OF BIRTH", "COUNTRY OF RESIDENCE", "INTEREST");
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

	
public static registration createRegistration() {
		
		int id = Helper.readInt("Enter tuition timetable ID:");
		String email = Helper.readString("Enter email:");
		String status = "Pending";
		String date = Helper.readString("Enter date:");
		String time = Helper.readString("Enter time:");
		int regNum = Helper.readInt("Enter registration Number:");

		
		registration r = new registration(id,email,status,date,time,regNum);
		return r;
	}
	public static void addRegistrations(ArrayList<registration> rList, registration r) {
		rList.add(r);
	}

	// View reg
	public static String retrieveAllRegistrations(ArrayList<registration> rList) {
		String output = "";
		
		for (int i = 0; i < rList.size(); i++) {
			output += String.format("%-10d %-30s %-10s %-10s %-10s %-20d\n", rList.get(i).getId(),rList.get(i).getStudentEmail(),rList.get(i).getStatus(),rList.get(i).getDate(),rList.get(i).getTime(),rList.get(i).getRegNum());
		}
		return output;
	}
	public static void viewAllRegistrations(ArrayList<registration> rList) {
		C206_CaseStudy.setHeader("ALL REGISTRATIONS");
		String output = String.format("%-10s %-30s %-10s %-10s %-10s %-20s\n", "TUITION ID", "EMAIL", "STATUS", "DATE", "TIME", "REGNUM");
		output += retrieveAllRegistrations(rList);
		System.out.println(output);
	}
	
	// Delete reg
	public static void deleteRegistrations(ArrayList<registration> rList) {
		int id = Helper.readInt("Enter tuition timetable ID: ");
		for (int i = 0; i < rList.size(); i++) {
			if (rList.get(i).getId()==id) {
				rList.remove(i);
			}
		}
	}
}
	
