import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


public class C206_CaseStudyTest {
	private Students st1;
	private Students st2;
	private registration r1;
	private registration r2;
	private registration r3;
	
	private ArrayList<registration> rList;
	private ArrayList<Students> studentsList;
	
	public C206_CaseStudyTest() {
		super();
	}

	// AFIQ - STUDENTS test cases
	@Before
	public void setUp() throws Exception {
		// prepare test data
		st1 = new Students("Mike", "Male", "98549549","add@gmail.com", "23 July 2020", "Singapore", "English");
		st2 = new Students("Hannah", "Female", "98475737", "eki@gmail.com", "29 July 2020", "Singapore", "Science");

		studentsList= new ArrayList<Students>();
		
		r1 = new registration(1, "email.com", "Pending", "20-4-2022", "8.45pm", 001);
		r2 = new registration(2, "email.com", "Pending", "20-5-2022", "4.30pm", 002);
		r3 = new registration(3, "email.com", "Pending", "10-7-2022", "5.00pm", 003);
		
		rList = new ArrayList<registration>();
	}
	
	@Test
	public void testAddStudent() {
		// Student list is not null, so that can add a new student - boundary
		assertNotNull("Test if there is valid Student arraylist to add to", studentsList);
		//Given an empty list, after adding 1 student, the size of the list is 1 - normal
		//The student just added is as same as the first student of the list
		C206_CaseStudy.addStudent(studentsList, st1);		
		assertEquals("Test that Student arraylist size is 1", 1, studentsList.size());
		assertSame("Test that Student is added", st1, studentsList.get(0));
		
		//Add another student. test The size of the list is 2? – normal
		//The student just added is as same as the second item of the list
		C206_CaseStudy.addStudent(studentsList, st2);
		assertEquals("Test that Students arraylist size is 2", 2, studentsList.size());
		assertSame("Test that Students is added", st2, studentsList.get(1));
	}
	
	@Test
	public void testRetrieveAllStudents() {
		// Test if student list is not null but empty -boundary
		assertNotNull("Test if there is valid Students arraylist to retrieve students", studentsList);
		
		//Test if the list of Students retrieved from the C206_CaseStudy is empty - boundary
		String allStudents= C206_CaseStudy. retrieveAllStudents(studentsList);
		String testOutput = "";
		assertEquals("Check that ViewAllStudentslist", testOutput, allStudents);
		
		//Given an empty list, after adding 2 Students, test if the size of the list is 2 - normal
		C206_CaseStudy.addStudent(studentsList, st1);
		C206_CaseStudy.addStudent(studentsList, st2);
		assertEquals("Test that Students arraylist size is 2", 2, studentsList.size());
		
		//Test if the expected output string same as the list of Students retrieved from the C206_CaseStudy
		allStudents= C206_CaseStudy.retrieveAllStudents(studentsList);
		testOutput = String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s", "Mike", "Male", "98549549","add@gmail.com", "23 July 2020", "Singapore", "English");
		testOutput += String.format("%-10s %-30s %-10s %-10s %-10s %-10s %-10s", "Hannah", "Female", "98475737", "eki@gmail.com", "29 July 2020", "Singapore", "Science");

		assertEquals("Test that ViewAllStudentslist", testOutput, allStudents);
		
	}
	
	@Test
	public void testDeleteStudent() {
		//Student list is not null, so that can add a new student - boundary
		assertNotNull("Test if there is valid Students arraylist to add to", studentsList);
		C206_CaseStudy.addStudent(studentsList, st1);
	
		//There is now a value in student list, so the student can be deleted. – normal
		C206_CaseStudy.inputDelete(studentsList);
		assertEquals("Test if the arraylist is 0?", 0, studentsList.size());
		
	}

	// ANDREW - REGISTRATION test cases
	@Test
	public void testAddReg() {
		//fail("Not yet implemented");
		assertNotNull("Test if there is valid Reg arraylist to add to", rList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addRegistrations(rList, r1);		
		assertEquals("Test if that Reg arraylist size is 1?", 1, rList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Reg is added same as 1st item of the list?", r1, rList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addRegistrations(rList, r2);
		assertEquals("Test that Reg arraylist size is 2?", 2, rList.size());
		assertSame("Test that Reg is added.", r2, rList.get(1));
	}
	
	@Test
	public void testRetrieveAllReg() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", rList);
		
		//test if the list of regs retrieved from the SourceCentre is empty
		String allReg= C206_CaseStudy.retrieveAllRegistrations(rList);
		String testOutput = "";
		assertEquals("Check that ViewAllReglist", testOutput, allReg);
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addRegistrations(rList, r1);
		C206_CaseStudy.addRegistrations(rList, r2);
		assertEquals("Test if that Reg arraylist size is 2?", 2, rList.size());
		
		//test if the expected output string same as the list of regs retrieved from the SourceCentre
		allReg= C206_CaseStudy.retrieveAllRegistrations(rList);

		testOutput = String.format("%-10d %-30s %-10s %-10s %-10s %-20d\n",1, "email.com", "Pending", "20-4-2022", "8.45pm", 001);
		testOutput += String.format("%-10d %-30s %-10s %-10s %-10s %-20d\n",2, "email.com", "Pending", "20-5-2022", "4.30pm", 002);
	
		assertEquals("Check that ViewAllReglist", testOutput, allReg);
		
	}
	
	@Test
	public void testDelReg() {
		//fail("Not yet implemented");
		assertNotNull("Test if there is valid Reg arraylist to add to", rList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.deleteRegistrations(rList);		
		assertEquals("Test if that arraylist size is 0?", 0, rList.size());
	}
	
	
	// YANG - TIMETABLE test cases
	
	
	
	@After
	public void tearDown() throws Exception {
		st1 = null;
		st2 = null;
		studentsList = null;
		r1 = null;
		r2 = null;
		r3 = null;
		
		rList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
