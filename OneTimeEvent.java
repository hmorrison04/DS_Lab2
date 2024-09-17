import java.util.GregorianCalendar;

import calendar.Meeting;
import calendar.MeetingCalendar;

public class OneTimeEvent extends CalendarEvent
{

	public OneTimeEvent(String desc, String loc, GregorianCalendar start, GregorianCalendar end)
	{
		super(desc, loc, start, end);
	
		// TODO Auto-generated constructor stub
		
	}

	@Override
	public void scheduleEvent(MeetingCalendar calendar)
	{
		// TODO Auto-generated method stub
		Meeting a = new Meeting(getDescription(),getLocation(),getStartTime(),getEndTime());
		calendar.addMeeting(a);
		
	}

}
