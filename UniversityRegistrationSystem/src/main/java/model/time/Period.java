package model.time;

public class Period {

	private Date startDate;
	private Date endDate;
	
	public Period(final Date start, final Date end) {
		startDate = start;
		endDate = end;
	}
	
	/**
	 * Returns the starting year for a period. For example,
	 * If we have a period 5/10/1990 - 12/2/2022, the year
	 * returned is 1990.
	 * @return the year of the starting date.
	 */
	public final short startingYear() {
		return startDate.getYear();
	}
	
	public final Date getStartDate() {
		return startDate;
	}
}