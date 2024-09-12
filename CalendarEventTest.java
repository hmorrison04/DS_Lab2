import static org.junit.jupiter.api.Assertions.*;

import java.util.GregorianCalendar;

import org.junit.jupiter.api.Test;

import calendar.MeetingCalendar;

class CalendarEventTest
{

	OneTimeEvent A;
	WeeklyEvent B;
	PriorityEvent C;
	MultiDayPerWeekEvent D;
	
	GregorianCalendar startA;
	GregorianCalendar endA;
	GregorianCalendar startAB;
	GregorianCalendar endAB;
	GregorianCalendar endB;
	GregorianCalendar repeat;
	int days[];
	
	CalendarEvent cal;
	
	void setUp() throws Exception
	{
	
		startA = new GregorianCalendar(2023,8,28,8,30);
		endA = new GregorianCalendar(2023,8,28,9,30);
		endB = new GregorianCalendar(2023,8,28,10,30);
		repeat = new GregorianCalendar(2023,8,28,11,30);
		
		startAB = new GregorianCalendar(2023,8,28,9,00);
		endAB = new GregorianCalendar(2023,8,28,10,00);
		GregorianCalendar endBC = new GregorianCalendar(2023,8,28,11,00);
		
		A = new OneTimeEvent("A", "ALoc", startA, endA);
		B = new WeeklyEvent("B", "BLoc", endA, endB, repeat);
		C = new PriorityEvent("A", "ALoc", startA, endB);
		D = new MultiDayPerWeekEvent("D", "DLoc", startA, endA, repeat, days);
	}
	
	void testCalendarEvent()
	{
		
	}

	void testScheduleEvent()
	{
		
	}
}
