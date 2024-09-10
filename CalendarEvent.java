import java.util.GregorianCalendar;

import calendar.MeetingCalendar;

public abstract class CalendarEvent
{
	private String description;
	private String location;
	private GregorianCalendar startTime;
	private GregorianCalendar endTime;



	public CalendarEvent(String desc, String loc, GregorianCalendar start, GregorianCalendar end)
	{
		// TODO Auto-generated constructor stub
	}

	public abstract void scheduleEvent(MeetingCalendar calendar);

	public String getDescription()
	{
		return description;
	}

	public void setDescription(String description)
	{
		this.description = description;
	}

	public String getLocation()
	{
		return location;
	}

	public void setLocation(String location)
	{
		this.location = location;
	}

	public GregorianCalendar getStartTime()
	{
		return startTime;
	}

	public void setStartTime(GregorianCalendar startTime)
	{
		this.startTime = startTime;
	}

	public GregorianCalendar getEndTime()
	{
		return endTime;
	}

	public void setEndTime(GregorianCalendar endTime)
	{
		this.endTime = endTime;
	}



}