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

import calendar.Meeting;
import calendar.MeetingCalendar;

class CalendarEventTest
{
	
	//OneTimeEvent A;
	//WeeklyEvent B;
	//PriorityEvent C;
	//MultiDayPerWeekEvent D;
	GregorianCalendar startA = new GregorianCalendar(2023,7,28,8,30);
	GregorianCalendar endA = new GregorianCalendar(2023,7,29,20,31);
	
	GregorianCalendar startB = new GregorianCalendar(2023,8,1,0,31);
	GregorianCalendar endB = new GregorianCalendar(2023,8,1,20,31);
	
	GregorianCalendar startC = new GregorianCalendar(2023,9,1,0,31);
	GregorianCalendar endC = new GregorianCalendar(2023,9,1,20,31);
	
	GregorianCalendar startD = new GregorianCalendar(2023,10,5,0,31);
	GregorianCalendar endD = new GregorianCalendar(2023,10,5,20,31);
	//GregorianCalendar newEndD = new GregorianCalendar(2023,10,8,30,31);
	
	GregorianCalendar startE = new GregorianCalendar(2023,11,29,20,31);
	GregorianCalendar endE = new GregorianCalendar(2023,11,30,20,31);
	
	GregorianCalendar startWeek1 = new GregorianCalendar(2023,8,8,0,31);
	GregorianCalendar endWeek1 = new GregorianCalendar(2023,8,8,20,31);
	GregorianCalendar startWeek2 = new GregorianCalendar(2023,8,15,0,31);
	GregorianCalendar endWeek2 = new GregorianCalendar(2023,8,15,20,31);
	GregorianCalendar startWeek3 = new GregorianCalendar(2023,8,22,0,31);
	GregorianCalendar endWeek3 = new GregorianCalendar(2023,8,22,20,31);
	GregorianCalendar startWeek4 = new GregorianCalendar(2023,8,29,0,31);
	GregorianCalendar endWeek4 = new GregorianCalendar(2023,8,29,20,31);
	
	//GregorianCalendar startDay1 = new GregorianCalendar(2023,10,8,0,31);
	//GregorianCalendar endDay1 = new GregorianCalendar(2023,10,8,30,31);
	GregorianCalendar startDay2 = new GregorianCalendar(2023,10,6,0,31);
	GregorianCalendar endDay2 = new GregorianCalendar(2023,10,6,20,31);
	GregorianCalendar startDay3 = new GregorianCalendar(2023,10,12,0,31);
	GregorianCalendar endDay3 = new GregorianCalendar(2023,10,12,20,31);
	GregorianCalendar startDay4 = new GregorianCalendar(2023,10,13,0,31);
	GregorianCalendar endDay4 = new GregorianCalendar(2023,10,13,20,31);
	GregorianCalendar startDay5 = new GregorianCalendar(2023,10,19,0,31);
	GregorianCalendar endDay5 = new GregorianCalendar(2023,10,19,20,31);
	GregorianCalendar startDay6 = new GregorianCalendar(2023,10,20,0,31);
	GregorianCalendar endDay6 = new GregorianCalendar(2023,10,20,20,31);
	GregorianCalendar startDayNext = new GregorianCalendar(2023,10,10,0,31);
	//GregorianCalendar endDayNext = new GregorianCalendar(2023,10,10,30,31);
	
	
	GregorianCalendar testNextDay = new GregorianCalendar(2023,10,10,0,31);
	GregorianCalendar endDayNext = new GregorianCalendar(2023,10,10,20,31);
	
	GregorianCalendar repeat1 = new GregorianCalendar(2023,8,22,30,31);
	GregorianCalendar checkWeekStart = new GregorianCalendar(2023,8,16,0,31);
	GregorianCalendar checkWeekEnd = new GregorianCalendar(2023,8,16,20,31);
	
	GregorianCalendar repeat2 = new GregorianCalendar(2023,10,12,20,31);
	//GregorianCalendar checkWeekStart = new GregorianCalendar(2023,8,29,0,31);
	//GregorianCalendar checkWeekEnd = new GregorianCalendar(2023,8,29,30,31);
	int days[] = {Calendar.SUNDAY,Calendar.MONDAY};
	//startAB = new GregorianCalendar(2023,8,28,9,00);
	//endAB = new GregorianCalendar(2023,8,28,10,00);
//	GregorianCalendar endBC = new GregorianCalendar(2023,8,28,11,00);
	
	OneTimeEvent A = new OneTimeEvent("A", "ALoc", startA, endA);
	WeeklyEvent B = new WeeklyEvent("B", "BLoc", startB, endB, repeat1);
	PriorityEvent C = new PriorityEvent("A", "ALoc", startC, endC);
	MultiDayPerWeekEvent D = new MultiDayPerWeekEvent("D", "DLoc", startD, endD, repeat2, days);
	
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
		cal = new MeetingCalendar();
		
	}
	
	
	@Test
	void testOneTimeEvent()
	{
		assertEquals("A",A.getDescription());
		assertEquals("ALoc",A.getLocation());
		assertEquals(startA,A.getStartTime());
		assertEquals(endA,A.getEndTime());
		A.scheduleEvent(cal);
		Meeting x = cal.findMeeting(startA);
		assertEquals(A.getDescription(),x.getDescription());
		OneTimeEvent check = new OneTimeEvent("Test", "Here", startA, endA);
		check.scheduleEvent(cal);
		Meeting y = cal.findMeeting(startA);
		assertEquals(A.getDescription(),y.getDescription());
	}
	
	@Test 
	void testWeeklyEvent()
	{
		assertEquals("B",B.getDescription());
		assertEquals("BLoc",B.getLocation());
		assertEquals(startB,B.getStartTime());
		assertEquals(endB,B.getEndTime());
		assertEquals(repeat1,B.getRepeatUntil());
		B.scheduleEvent(cal);
		
		Meeting k = cal.findMeeting(startB);
		assertEquals(B.getDescription(),k.getDescription());
		WeeklyEvent h = new WeeklyEvent("Quiz", "there", startB, endB, repeat1);
		h.scheduleEvent(cal);
		Meeting i = cal.findMeeting(startB);
		assertEquals(B.getDescription(),i.getDescription());
		
		Meeting t = cal.findMeeting(startWeek1);
		assertEquals(B.getDescription(),t.getDescription());
		Meeting u = cal.findMeeting(startWeek2);
		assertEquals(B.getDescription(),u.getDescription());
		Meeting v = cal.findMeeting(startWeek3);
		assertEquals(B.getDescription(),v.getDescription());
		//Meeting w = cal.findMeeting(checkWeekEnd);
		//assertEquals(B.getDescription(),w.getDescription());
		
		OneTimeEvent g = new OneTimeEvent("rest", "dorm", startWeek4, endWeek4);
		g.scheduleEvent(cal);
		Meeting e = cal.findMeeting(startWeek4);
		assertEquals(g.getDescription(),e.getDescription());
		
		
		
		
	}
	
	@Test
	void testPriorityEvent()
	{
		assertEquals("A",C.getDescription());
		assertEquals("ALoc",C.getLocation());
		assertEquals(startC,C.getStartTime());
		assertEquals(endC,C.getEndTime());
		C.scheduleEvent(cal);
		Meeting j = cal.findMeeting(startC);
		assertEquals(A.getDescription(),j.getDescription());
		PriorityEvent food = new PriorityEvent("Food", "Cowan", startC, endC);
		food.scheduleEvent(cal);
		Meeting q = cal.findMeeting(startC);
		assertEquals(food.getDescription(),q.getDescription());
		
		
		
	}
	
	@Test
	void testMultiDayPerWeekEvent()
	{
		assertEquals("D",D.getDescription());
		assertEquals("DLoc",D.getLocation());
		assertEquals(startD,D.getStartTime());
		assertEquals(endD,D.getEndTime());
		assertEquals(repeat2,D.getRepeatUntil());
		assertEquals(days,D.getDays());
		D.scheduleEvent(cal);
		Meeting go = cal.findMeeting(startD);
		assertEquals(D.getDescription(),go.getDescription());

		MultiDayPerWeekEvent hi = new MultiDayPerWeekEvent("Sleep", "house", startD, endD, repeat2, days);
		hi.scheduleEvent(cal);
		Meeting c = cal.findMeeting(startD);
		assertEquals(D.getDescription(),c.getDescription());
		
		
		
		
		Meeting s = cal.findMeeting(startDay2);
		assertEquals(D.getDescription(),s.getDescription());
		Meeting d = cal.findMeeting(startDay3);
		assertEquals(D.getDescription(),d.getDescription());
		//Meeting f = cal.findMeeting(startDay4);
		//assertEquals(D.getDescription(),f.getDescription());
		
		
		OneTimeEvent tomorrow = new OneTimeEvent("Here", "There", startDayNext,endDayNext);
		tomorrow.scheduleEvent(cal);
		Meeting m = cal.findMeeting(startDayNext);
		assertEquals(tomorrow.getDescription(),m.getDescription());
		
		
	}
	
	
	
}
