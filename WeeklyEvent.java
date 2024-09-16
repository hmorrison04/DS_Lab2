/**
 * 
 */

import java.util.GregorianCalendar;

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
		// TODO Auto-generated constructor stub
	} 

	@Override
	public void scheduleEvent(MeetingCalendar calendar)
	{
		// TODO Auto-generated method stub
		

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
