package Yang;
public class registration extends timetable{

	 

    private String studentEmail;
    private String status;
    private String date;
    private String time;    
    private int regNum;
    

    public registration(int id, String studentEmail, String status, String date, String time, int regNum) {
        super(id);
        this.studentEmail = studentEmail;
        this.status = status;
        this.date = date;
        this.time = time;
        this.regNum = regNum;
    }
    
    public int getRegNum() {
        return regNum;
    }
    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }
    public String getStudentEmail() {
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail) {
        this.studentEmail = studentEmail;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    
    
    
}