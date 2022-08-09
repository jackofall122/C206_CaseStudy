import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	private Students st1;
	private Students st2;
	
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
		testOutput = String.format("%-20s %-10s %-10s %-20s %-20s %-20s %-20s", "Mike", "Male", "98549549","add@gmail.com", "23 July 2020", "Singapore", "English");
		testOutput += String.format("%-20s %-10s %-10s %-20s %-20s %-20s %-20s", "Hannah", "Female", "98475737", "eki@gmail.com", "29 July 2020", "Singapore", "Science");

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
	
	
	
	// YANG - TIMETABLE test cases
	
	
	
	@After
	public void tearDown() throws Exception {
		st1 = null;
		st2 = null;
		studentsList = null;
	}

	@Test
	public void c206_test() {
		//fail("Not yet implemented"); 
		assertTrue("C206_CaseStudy_SampleTest ",true);
	}

}
