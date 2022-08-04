package Ben;

public class tuition {

	private int tuitionCode;
	private String tuitionTitle;
	private String subGrpName;
	private String tuitionDescription;
	private int tuitionDuration;
	private String tuitionPreReq;
	private String teacherInfo;
	public int getTuitionCode() {
		return tuitionCode;
	}

	public void setTuitionCode(int tuitionCode) {
		this.tuitionCode = tuitionCode;
	}

	public String getTuitionTitle() {
		return tuitionTitle;
	}

	public void setTuitionTitle(String tuitionTitle) {
		this.tuitionTitle = tuitionTitle;
	}

	public String getSubGrpName() {
		return subGrpName;
	}

	public void setSubGrpName(String subGrpName) {
		this.subGrpName = subGrpName;
	}

	public String getTuitionDescription() {
		return tuitionDescription;
	}

	public void setTuitionDescription(String tuitionDescription) {
		this.tuitionDescription = tuitionDescription;
	}

	public int getTuitionDuration() {
		return tuitionDuration;
	}

	public void setTuitionDuration(int tuitionDuration) {
		this.tuitionDuration = tuitionDuration;
	}

	public String getTuitionPreReq() {
		return tuitionPreReq;
	}

	public void setTuitionPreReq(String tuitionPreReq) {
		this.tuitionPreReq = tuitionPreReq;
	}

	public String getTeacherInfo() {
		return teacherInfo;
	}

	public void setTeacherInfo(String teacherInfo) {
		this.teacherInfo = teacherInfo;
	}

	

	
	public tuition(int tuitionCode, String tuitionTitle, String subGrpName, String tuitionDescription,
			int tuitionDuration, String tuitionPreReq, String teacherInfo) {
		this.tuitionCode = tuitionCode;
		this.tuitionTitle = tuitionTitle;
		this.subGrpName = subGrpName;
		this.tuitionDescription = tuitionDescription;
		this.tuitionDuration = tuitionDuration;
		this.tuitionPreReq = tuitionPreReq;
		this.teacherInfo = teacherInfo;
	}
	public void viewTuition() {
		System.out.println("Tuition Code: "+tuitionCode);
		System.out.println("Tuition Title: "+tuitionTitle);
		System.out.println("Subject Group Name: "+subGrpName);
		System.out.println("Tuition Description: "+tuitionDescription);
		System.out.println("Tuition Duration: "+tuitionDuration+" minutes");
		System.out.println("Pre-requisite: "+tuitionPreReq);
		System.out.println("Teacher Info: "+teacherInfo);
	}
	
}
