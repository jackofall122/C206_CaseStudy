package Yang;

import java.util.ArrayList;

public class helloWorld {
			
	public static void main(String[] args) {
		ArrayList<timetable> timetableList = new ArrayList<timetable>(); 
		timetableList.add(new timetable(1, 160, "15-8-22", "19:00", "14-11-22", "21:00", "f2f"));
		timetableList.add(new timetable(2, 200, "17-8-22", "17:00", "16-11-22", "19:00", "f2f"));
		
		int option = 0;
		
		while (option != 9) {
			option = Helper.readInt("Enter an option > ");
			if (option == 1) {
				helloWorld.viewAllTimetable(timetableList);
			}
		}
		
	}
	public static String retrieveAllTimetable(ArrayList<timetable> timetableList) {
		String output = "";
		
		for (int i = 0; i < timetableList.size(); i++) {
			output += String.format("%-136s\n", timetableList.get(i).toString());
			}
		return output;
		
	}
	
	public static void viewAllTimetable(ArrayList<timetable> timetableList) {
		String output = String.format("%-10s %-15s %-20s %-20s %-20s %-20s %-20s\n", "ID", "PRICE", "STARTING DATE", "STARTING TIME", "ENDING DATE", "ENDING TIME", "MODE");
		output += retrieveAllTimetable(timetableList);
		System.out.println(output);
	}
	
	public static timetable inputTimetable() {
		int id = Helper.readInt("Enter timetable id > ");
		double price = Helper.readDouble("Enter price > ");
		String startDate = Helper.readString("Enter starting date (DD-MM-YY) > ");
		String startTime = Helper.readString("Enter starting time (24 hour format) > ");
		String endDate = Helper.readString("Enter ending date (DD-MM-YY) > ");
		String endTime = Helper.readString("Enter ending time (24 hour format) > ");
		String mode = Helper.readString("Enter mode (f2f/hbl) > ");
		
		timetable tt = new timetable(id, price, startDate, startTime, endDate, endTime, mode);
		return tt;
	}
	public static void AddTimetable(ArrayList<timetable> timetableList, timetable tt) {
		timetableList.add(tt);
	}
	public static void deleteTimetable(int id, ArrayList<timetable> timetableList) {
		for (int i = 0; i < timetableList.size(); i++) {
			if (timetableList.get(i).getId() == id) {
				timetableList.remove(i);
			}
		}
	}

}
