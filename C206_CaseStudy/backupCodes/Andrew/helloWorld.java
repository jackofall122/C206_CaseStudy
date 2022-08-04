package Andrew;

import java.util.ArrayList;

public class helloWorld {

	public static void main(String[] args) {
		ArrayList<registration> rList = new ArrayList<registration>();
	}
	// Register/Add students
	public static registration inputStudents() {
		
		int id = Helper.readInt("Enter tuition timetable ID:");
		String email = Helper.readString("Enter email:");
		String status = "Pending";
		String date = Helper.readString("Enter date:");
		String time = Helper.readString("Enter time:");
		int regNum = Helper.readInt("Enter registration Number:");

		
		registration r = new registration(id, email, status, date, time, regNum);
		return r;
	}
	public static void addReg(ArrayList<registration> rList, registration r) {
		rList.add(r);
	}

	// View students
	public static String retrieveAllRegistrations(ArrayList<registration> rList) {
		String output = "";
		
		for (int i = 0; i < rList.size(); i++) {
			output += String.format("%=84s\n", rList.get(i).toString());
		}
		return output;
	}
	public static void viewAllRegistrations(ArrayList<registration> rList) {
		C206_CaseStudy.setHeader("ALL REGISTRATIONS");
		String output = String.format("%-10d %-30s %-10s %-10s %-10s %-20d\n", "TUITION ID", "EMAIL", "STATUS", "EMAIL", "DATE", "TIME", "REGNUM");
		output += retrieveAllRegistrations(rList);
		System.out.println(output);
	}
	
	// Delete students
	public static void deleteRegistrations(ArrayList<registration> rList) {
		String id = Helper.readInt("Enter tuition timetable ID: ");
		for (int i = 0; i < rList.size(); i++) {
			if (rList.get(i).getID().equals(id)) {
				rList.remove(i);
			}
		}
	}
	
}
