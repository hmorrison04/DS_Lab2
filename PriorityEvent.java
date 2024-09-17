/**
 * 
 */

import java.util.GregorianCalendar;

import calendar.Meeting;
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
		Meeting b = new Meeting(getDescription(),getLocation(),getStartTime(),getEndTime());
		calendar.addMeeting(b);
		if(calendar.doesMeetingConflict(b))
		{
			calendar.addMeeting(b,true);
		}

	}

}
