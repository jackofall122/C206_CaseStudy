package Yang;

public class timetable {
	private int id;
	private double price;
	private String sDate;
	private String sTime;
	private String eDate;
	private String eTime;
	private String mode;
	
	public timetable(int id, double price, String sDate, String sTime, String eDate, String eTime, String mode) {
		this.id = id;
		this.price = price;
		this.sDate = sDate;
		this.sTime = sTime;
		this.eDate = eDate;
		this.eTime = eTime;
		this.mode = mode;
	}

	public int getId() {
		return id;
	}

	public double getPrice() {
		return price;
	}

	public String getsDate() {
		return sDate;
	}

	public String getsTime() {
		return sTime;
	}

	public String geteDate() {
		return eDate;
	}

	public String geteTime() {
		return eTime;
	}

	public String getMode() {
		return mode;
	}
	
	public String toString() {
		String info = String.format("%-10d %-10f %-10s %-10s %-10s %-10s %-10s", id, price, sDate, sTime, eDate, eTime, mode);
		return info;
	}
}
