package Yang;
import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class C206_CaseStudyTest {
	
	private ArrayList<timetable> timetableList;
	private timetable tt1;
	private timetable tt2;
	
	public C206_CaseStudyTest() {
		super();
	}
	
	@Before
	public void setUp() throws Exception {
		//prepare test data
		tt1 = new timetable(1, 160, "15-8-22", "19:00", "14-11-22", "21:00", "f2f");
		tt2 = new timetable(2, 200, "17-8-22", "17:00", "16-11-22", "19:00", "f2f");
		
		timetableList = new ArrayList<timetable>();
	}

	
	@Test
	public void testRetrieveAllTimetable( ) {
		//test if there is a timetable list that is empty and not null
		assertNotNull("Test if timetable list is empty and not null", timetableList);
		
		//test to see if the list retrieved is empty
		String allTimetable = helloWorld.retrieveAllTimetable(timetableList);
		String testOutput = "";
		
		
		//given an empty list, after adding 2 items, test if the size of the list is 2
		helloWorld.addTimetable(timetableList, tt1);
		helloWorld.addTimetable(timetableList, tt2);
		assertEquals("Test to see if that timetableList size is 2", 2, timetableList.size());
		
	}
	
	@Test
	public void testAddTimetable() {
		//test item list not null
		assertNotNull("Check to see if there is a timetable list to add to", timetableList);
		
		//Given an empty list, after adding 1 item, the size of the list is 1
		//The item added is same as first item of the list
		helloWorld.AddTimetable(timetableList, tt1);
		assertEquals("Check that timetable list is 1", 1, timetableList.size());
		assertSame("Check that timetable is added", tt1, timetableList.get(0));
		
		//add another item to see if the size of the list becomes 2
		//the item added is same as second item of list
		helloWorld.AddTimetable(timetableList, tt2);
		assertEquals("Check that timetable list size is 2", 2, timetableList.size());
		assertSame("Check that timetable is added", tt2, timetableList.get(1));
	}
	
	@Test
	public void testDeleteTimetable() {
		//test that item list is empty and not null
		assertNotNull("check timetable list not null", timetableList);
		
		//Given that the list has 1 item, check to see if the list is empty after deleting item
		helloWorld.AddTimetable(timetableList, tt1);
		assertEquals("Check that timetable list is 1", 1, timetableList.size());
		assertSame("Check that timetable was added", tt1, timetableList.get(0));
		helloWorld.deleteTimetable(1, timetableList);
		assertTrue("Check to see if timetable list is empty", timetableList.isEmpty());
		
		//Given that the list has 2 item, check to see if only 1 item exists after deleting 1 item
		helloWorld.AddTimetable(timetableList, tt1);
		helloWorld.AddTimetable(timetableList, tt2);
		assertEquals("Test that timetable list size is 2", 2, timetableList.size());
		assertSame("Check that first timetable was added", tt1, timetableList.get(0));
		assertSame("Check that second timetable was added", tt2, timetableList.get(1));
		helloWorld.deleteTimetable(1, timetableList);
		assertEquals("test that timetable list is now 1", 1, timetableList.size());
		assertSame("check to see if the item is same", tt2, timetableList.get(0));
	}
	
	@After
	public void tearDown() throws Exception {
		tt1 = null;
		tt2 = null;
		timetableList = null;
	}

}
