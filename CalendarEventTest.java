/*
import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import calendar.MeetingCalendar;
*/

import static org.junit.jupiter.api.Assertions.*;

import java.util.Calendar;
import java.util.GregorianCalendar;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import calendar.MeetingCalendar;

class CalendarEventTest
{
	
	//OneTimeEvent A;
	//WeeklyEvent B;
	//PriorityEvent C;
	//MultiDayPerWeekEvent D;
	GregorianCalendar startA = new GregorianCalendar(2023,8,28,8,30);
	GregorianCalendar endA = new GregorianCalendar(2023,8,29,30,31);
	GregorianCalendar endB = new GregorianCalendar(2023,8,28,10,30);
	GregorianCalendar repeat = new GregorianCalendar(2023,8,28,11,30);
	int days[] = {1,2,3,4,5,6,7};
	//startAB = new GregorianCalendar(2023,8,28,9,00);
	//endAB = new GregorianCalendar(2023,8,28,10,00);
//	GregorianCalendar endBC = new GregorianCalendar(2023,8,28,11,00);
	
	OneTimeEvent A = new OneTimeEvent("A", "ALoc", startA, endA);
	WeeklyEvent B = new WeeklyEvent("B", "BLoc", startA, endB, repeat);
	PriorityEvent C = new PriorityEvent("A", "ALoc", startA, endB);
	MultiDayPerWeekEvent D = new MultiDayPerWeekEvent("D", "DLoc", startA, endA, repeat, days);
	
	/*
	GregorianCalendar startA;
	GregorianCalendar endA;
	GregorianCalendar startAB;
	GregorianCalendar endAB;
	GregorianCalendar endB;
	GregorianCalendar repeat;
	*/
	
	
	MeetingCalendar cal = new MeetingCalendar();
	
	@BeforeEach
	void setUp() throws Exception
	{
		//GregorianCalendar today = new GregorianCalendar(2022, 9, 16, 28, 30);
	/*
		startA = new GregorianCalendar(2023,8,28,8,30);
		endA = new GregorianCalendar(2023,8,29,30,31);
		endB = new GregorianCalendar(2023,8,28,10,30);
		repeat = new GregorianCalendar(2023,8,28,11,30);
		
		startAB = new GregorianCalendar(2023,8,28,9,00);
		endAB = new GregorianCalendar(2023,8,28,10,00);
		GregorianCalendar endBC = new GregorianCalendar(2023,8,28,11,00);*/
		/*
		A = new OneTimeEvent("A", "ALoc", startA, endA);
		B = new WeeklyEvent("B", "BLoc", startA, endB, repeat);
		C = new PriorityEvent("A", "ALoc", startA, endB);
		D = new MultiDayPerWeekEvent("D", "DLoc", startA, endA, repeat, days);
		*/
	}
	
	/*
	void testScheduleEvent()
	{
		
	}
	*/
	@Test
	void testOneTimeEvent()
	{
		assertEquals("A",A.getDescription());
		assertEquals("ALoc",A.getLocation());
		assertEquals(startA,A.getStartTime());
		assertEquals(endA,A.getEndTime());
		A.scheduleEvent(cal);
		C.scheduleEvent(cal);
		assertFalse(A.equals(C));
		/*
		assertNotEquals(A.getDescription(),D.getDescription());
		assertNotEquals(A.getLocation(),D.getLocation());
		assertNotEquals(A.getStartTime(),D.getStartTime());
		assertNotEquals(endA,D.getEndTime());
		*/
	
	
	}
	@Test 
	void testWeeklyEvent()
	{
		assertEquals("B",B.getDescription());
		assertEquals("BLoc",B.getLocation());
		assertEquals(startA,B.getStartTime());
		assertEquals(endB,B.getEndTime());
		assertEquals(repeat,B.getRepeatUntil());
		B.scheduleEvent(cal);
	}
	
	@Test
	void testPriorityEvent()
	{
		assertEquals("A",C.getDescription());
		assertEquals("ALoc",C.getLocation());
		assertEquals(startA,C.getStartTime());
		assertEquals(endB,C.getEndTime());
		C.scheduleEvent(cal);
		
		
	}
	
	@Test
	void testMultiDayPerWeekEvent()
	{
		assertEquals("D",D.getDescription());
		assertEquals("DLoc",D.getLocation());
		assertEquals(startA,D.getStartTime());
		assertEquals(endA,D.getEndTime());
		assertEquals(repeat,D.getRepeatUntil());
		assertEquals(days,D.getDays());
	//	D.scheduleEvent(cal);
		
	}
	
	
	
}
