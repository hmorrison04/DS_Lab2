import java.util.Calendar;
import java.util.GregorianCalendar;

import calendar.Meeting;
import calendar.MeetingCalendar;

public class MultiDayPerWeekEvent extends CalendarEvent
{
	private GregorianCalendar repeatUntil;
	private int[] days;
	public MultiDayPerWeekEvent(String desc, String loc, GregorianCalendar start, GregorianCalendar end, GregorianCalendar repeat, int[] days)
	{
		super(desc, loc, start, end);
		this.repeatUntil = repeat;
		this.days = days;
	}

	@Override
	public void scheduleEvent(MeetingCalendar calendar)
	{
		Meeting d = new Meeting(getDescription(),getLocation(),getStartTime(),getEndTime());
		calendar.addMeeting(d);

		GregorianCalendar a = (GregorianCalendar) getStartTime().clone();
		GregorianCalendar b = (GregorianCalendar) getEndTime().clone();
		
	
		boolean isInArray = false;
		
		
		while(a.compareTo(repeatUntil) < 0)
		{ 
			for(int i = 0; i < days.length; i++)
			{
				if((a.get(Calendar.DAY_OF_WEEK)) == days[i]) 
				{
					isInArray = true;
				
				}	
			}
			
			if(isInArray)
			{
				Meeting e = new Meeting(getDescription(), getLocation(),a,b);
				calendar.addMeeting(e);
			}
		
			
			a.add(Calendar.DAY_OF_MONTH, 1);
			b.add(Calendar.DAY_OF_MONTH, 1);
			
			isInArray = false;
			
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

	public int[] getDays()
	{
		return days;
	}

	public void setDays(int[] days)
	{
		this.days = days;
	}

}
