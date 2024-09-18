/**
 * 
 */

import java.util.Calendar;
import java.util.GregorianCalendar;

import calendar.Meeting;
import calendar.MeetingCalendar;

/**
 * 
 */
public class WeeklyEvent extends CalendarEvent
{
	private GregorianCalendar repeatUntil;
	/**
	 * @param desc
	 * @param loc
	 * @param start
	 * @param end
	 */
	
	public WeeklyEvent(String desc, String loc, GregorianCalendar start, GregorianCalendar end, GregorianCalendar repeat)
	{
		super(desc, loc, start, end);
		this.repeatUntil = repeat;
	} 

	@Override
	public void scheduleEvent(MeetingCalendar calendar)
	{
		Meeting c = new Meeting(getDescription(),getLocation(),getStartTime(),getEndTime());
		calendar.addMeeting(c);
		
		GregorianCalendar a = (GregorianCalendar) getStartTime().clone();
		GregorianCalendar b = (GregorianCalendar) getEndTime().clone();
		
		while(a.compareTo(repeatUntil) < 0)
		{ 
			Meeting x = new Meeting(getDescription(), getLocation(),a,b);
			calendar.addMeeting(x);
			a.add(Calendar.DAY_OF_MONTH, 7);
			b.add(Calendar.DAY_OF_MONTH, 7);
			

		}
		
	}

	public GregorianCalendar getRepeatUntil()
	{
		return repeatUntil;
	}

	public void setRepeatUntil(GregorianCalendar repeatUntil)
	{
		this.repeatUntil = repeatUntil;
	}


}
