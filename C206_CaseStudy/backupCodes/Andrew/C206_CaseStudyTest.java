package Andrew;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private registration r1;
	private registration r2;
	private registration r3;
	
	private ArrayList<registration> rList;

	@Before
	public void setUp() throws Exception {
		r1 = new registration(1, "email.com", "Pending", "20-4-2022", "8.45pm", 001);
		r2 = new registration(2, "email.com", "Pending", "20-5-2022", "4.30pm", 002);
		r3 = new registration(3, "email.com", "Pending", "10-7-2022", "5.00pm", 003);
		
		rList = new ArrayList<registration>();
	}

	@After
	public void tearDown() throws Exception {
		r1 = null;
		r2 = null;
		r3 = null;
		
		rList = null;
	}

	
	@Test
	public void testAddReg() {
		//fail("Not yet implemented");
		assertNotNull("Test if there is valid Reg arraylist to add to", rList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.addRegistrations(rList, r1);		
		assertEquals("Test if that Camcorder arraylist size is 1?", 1, rList.size());
		
		//The item just added is as same as the first item of the list
		assertSame("Test that Camcorder is added same as 1st item of the list?", r1, rList.get(0));
		
		//Add another item. test The size of the list is 2?
		C206_CaseStudy.addRegistrations(rList, r2);
		assertEquals("Test that Chromebook arraylist size is 2?", 2, rList.size());
		assertSame("Test that Chromebook is added.", r2, rList.get(1));
	}
	
	@Test
	public void testRetrieveAllCamcorder() {
		// Test if Item list is not null but empty, so that can add a new item
		assertNotNull("Test if there is valid Camcorder arraylist to add to", rList);
		
		//test if the list of camcorders retrieved from the SourceCentre is empty
		String allReg= C206_CaseStudy.retrieveAllRegistrations(rList);
		String testOutput = "";
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allReg);
		//Given an empty list, after adding 2 items, test if the size of the list is 2
		C206_CaseStudy.addRegistrations(rList, r1);
		C206_CaseStudy.addRegistrations(rList, r2);
		assertEquals("Test if that Camcorder arraylist size is 2?", 2, rList.size());
		
		//test if the expected output string same as the list of camcorders retrieved from the SourceCentre
		allReg= C206_CaseStudy.retrieveAllRegistrations(rList);

		testOutput = String.format("%-10d %-30s %-10s %-10s %-10s %-20d\n",1, "email.com", "Pending", "20-4-2022", "8.45pm", 001);
		testOutput += String.format("%-10d %-30s %-10s %-10s %-10s %-20d\n",2, "email.com", "Pending", "20-5-2022", "4.30pm", 002);
	
		assertEquals("Check that ViewAllCamcorderlist", testOutput, allReg);
		
	}
	
	@Test
	public void testDelReg() {
		//fail("Not yet implemented");
		assertNotNull("Test if there is valid Reg arraylist to add to", rList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		C206_CaseStudy.deleteRegistrations(rList);		
		assertEquals("Test if that arraylist size is 0?", 0, rList.size());
	}

}
