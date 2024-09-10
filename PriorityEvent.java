/**
 * 
 */

import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

/**
 * 
 */
public class PriorityEvent extends CalendarEvent
{

	/**
	 * @param desc
	 * @param loc
	 * @param start
	 * @param end
	 */
	public PriorityEvent(String desc, String loc, GregorianCalendar start, GregorianCalendar end)
	{
		super(desc, loc, start, end);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void scheduleEvent(MeetingCalendar calendar)
	{
		// TODO Auto-generated method stub

	}

}
